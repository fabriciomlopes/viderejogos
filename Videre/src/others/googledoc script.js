var InitComment = "/*";
var EndComment =  "*/";
var sSeparator = ","
var sStringDivisor = "\"";
var iSpacement = 3; // spacement for id. better view
var iMinTab = 23; 	// spacement for Gui. better view

////////////////////////////////////////////////////////////////////
// languages ID
var ENGLISH 	= 0;
var FRENCH 		= 1;
var ITALIAN 	= 2;
var GERMAN 		= 3;
var SPANISH 	= 4;
var PORTUGUESE 	= 5;

// language name (important for the ouput language)
var Languages = [];
Languages[ENGLISH] 		= "english";
Languages[FRENCH] 		= "french";
Languages[ITALIAN] 		= "italian";
Languages[GERMAN] 		= "german";
Languages[SPANISH] 		= "spanish";
Languages[PORTUGUESE] 	= "portuguese";

// language label (from the spread sheet. the name to acess them in javascript
var LanguageLabel = [];

var MAX_LANGUAGES = Languages.length;

////////////////////////////////////////////////////////////////////
// Programming language structs
var RegionMarker = [];
var DataFormat = [];

var CSHARP = 0;
var JAVA = 1;
var CPP = 2;



if (CSHARP) {
// C# - region marker.
RegionMarker[CSHARP] = 
"			#region Generated Code\n\
{0}\n\
			#endregion"
;

// C# - language output struct.
DataFormat[CSHARP] = 
"		case (LANGUAGES.{0}):\n\
			output = new string[] {\n\
			#region {1}\n\
{2}\n\
			#endregion\n\
			};\n\
		break;\n\
"
;
}

// --------------

if (JAVA) {
// JAVA - region marker.
RegionMarker[JAVA] = 
"\n// <editor-fold defaultstate=\"collapsed\" desc=\"Generated Code\">\n\
{0}\n\
// </editor-fold>\n"
;

// JAVA - language output struct.
DataFormat[JAVA] = 
"\n// <editor-fold defaultstate=\"collapsed\" desc=\"{0}\">\n\
class Lokaki{0} extends LokakiData {\n\
\n\
	@Override\n\
	public String toString() {\n\
		return \"{0}\";\n\
	}\n\
\n\
	public Lokaki{0}() {\n\
		texts = new String[]{\n\
{2}\n\
				};\n\
	}\n\
}\n\
// </editor-fold>\n"
;
}
// --------------

////////////////////////////////////////////////////////////////////
// Select language output.
var iLanguageOutput = JAVA;

var sLanguageFormat = DataFormat[iLanguageOutput];
var sRegionMarker = RegionMarker[iLanguageOutput];


////////////////////////////////////////////////////////////////////
// real programming :::
function toUnityScript() {
	// 
	// each row of generated script is something like this
	// /* 30*/ "the text of ID 30",
	//


	var ss = SpreadsheetApp.getActiveSpreadsheet();
	var sheet = ss.getSheets()[0];

	

	var lokakiData = ss.getRangeByName("lokaki");
	var lokakiObjects = getRowsData(sheet, lokakiData, 1);

	
	
	var sResult = [];
	var iSuccess = [];
	var sPreviousGui = []; // just to look better
	
	// init values
	for (var x = 0; x < MAX_LANGUAGES; x++){
		sResult[x] = "";
		iSuccess[x] = 0;
		sPreviousGui[x] = "";
	}
	
	// init how to access the values
	LanguageLabel[ENGLISH] = normalizeHeader(ss.getRange("B1").getValue());
	LanguageLabel[FRENCH ] = normalizeHeader(ss.getRange("C1").getValue());
	LanguageLabel[ITALIAN] = normalizeHeader(ss.getRange("D1").getValue());
	LanguageLabel[GERMAN ] = normalizeHeader(ss.getRange("E1").getValue());
	LanguageLabel[SPANISH] = normalizeHeader(ss.getRange("F1").getValue());
	LanguageLabel[PORTUGUESE] = normalizeHeader(ss.getRange("G1").getValue());
	
	for (var x in lokakiObjects) {
		if (x == 0) {continue;}
		
		//if (x == 2) {break;} // test
		
		var row = lokakiObjects[x];
		
		
		for (var x = 0; x < MAX_LANGUAGES; x++){
			var sValue = row[LanguageLabel[x]];
			
			if (sValue != null) {
				if (sPreviousGui[x] != row.gui) {
					// ALL LANGUAGES NEW LINE!
					sResult[x] += "\n";
					
					sPreviousGui[x] = row.gui;
				}
				// write a row;
				iSuccess[x]++;
				
				sValue = ReplaceCharacters(sValue);
				
				sResult[x] += Format(row.id, sValue, row.gui) + "\n";				
			}
		}
		
	}

	var sDate = updateGeneratedDate("B1");
	
	var sMsg = "Successfully generated:\n";
	for (var x = 0; x < MAX_LANGUAGES; x++){
		sMsg += iSuccess[x] + LanguageLabel[x] + " texts;\n";
	}
	Browser.msgBox(sMsg);
	
	// generated date mark
	var sFinalText = "\t\t" + InitComment + "Generated on: " + sDate + EndComment + "\n";
	for (var x = 0; x < MAX_LANGUAGES; x++){
		sResult[x] += sStringDivisor + "end" + sStringDivisor; // gamb end
		
		sFinalText += Stringformat(
			sLanguageFormat,
			Stringcapitalize(Languages[x]), Languages[x].toUpperCase(), sResult[x]
		);
	}
	//sheet.getRange("J3").setValue(sResult);
	
	// generated code region marker:
	sFinalText = Stringformat(sRegionMarker, sFinalText);
	
	
	//sResult[ENGLISH] = InitComment + "Generated on: " + sDate + EndComment + "\n" + sResult[ENGLISH];
	SpreadsheetApp.getActiveSpreadsheet().getSheets()[1].getRange("C3").setValue( 
		sFinalText
		
		
	);
	
}


// replaces things like '\t' to "\t"
function ReplaceCharacters(sValue) {
	//var sOutput = sValue;
	
	sValue = sValue.replace(/\t/g, "\\t");
	sValue = sValue.replace(/\n/g, "\\n");
	sValue = sValue.replace(/\"/g, "\\\"");
	
	return sValue;
}

function Format(iLokakiId, sTextValue, sGuiName){
	var sOutput = "";
	
	// format ID comment, better to see.
	var sLokakiId = "" + iLokakiId;
	while(sLokakiId.length < iSpacement) {
		sLokakiId = " " + sLokakiId;
	}
	
	
	var sCommentID = InitComment + sLokakiId + EndComment + " ";
	
	// the value
	var sValue = " " + sStringDivisor + sTextValue + sStringDivisor + sSeparator;
	sValue = StringTrim(sValue);
	// format the tabs, better to see.
	
	var sFinal = "// at GUI: " + sGuiName;
	
	
	var iTabAmount = Math.ceil((sCommentID + sValue).length) / 4;
	while (iTabAmount < iMinTab) {
		iTabAmount++;
		sFinal = "\t" + sFinal;
	}
	
	// indent with tabs
	sOutput = "\t\t\t\t" + sCommentID + sValue + sFinal;
	
	// trim string.
	return sOutput;
}

function updateGeneratedDate(sCell){

	var ss = SpreadsheetApp.getActiveSpreadsheet();
	var sheet = ss.getSheets()[0];
	var sDate = getTodayDate();
	SpreadsheetApp.getActiveSpreadsheet().getSheets()[1].getRange(sCell).setValue(sDate);
	return sDate;
}

function getTodayDate(){
	var formattedToday = Utilities.formatDate( new Date(), "GMT-3" , "yyyy/MM/dd - HH:mm");
	return formattedToday;
}


// getRowsData iterates row by row in the input range and returns an array of objects.
// Each object contains all the data for a given row, indexed by its normalized column name.
// Arguments:
//   - sheet: the sheet object that contains the data to be processed
//   - range: the exact range of cells where the data is stored
//   - columnHeadersRowIndex: specifies the row number where the column names are stored.
//       This argument is optional and it defaults to the row immediately above range; 
// Returns an Array of objects.
function getRowsData(sheet, range, columnHeadersRowIndex) {
  columnHeadersRowIndex = columnHeadersRowIndex || range.getRowIndex() - 1;
  var numColumns = range.getEndColumn() - range.getColumn() + 1;
//  Browser.msgBox(columnHeadersRowIndex + ", " + numColumns + ", " + range.getColumn() + ", " + numColumns);
  var headersRange = sheet.getRange(columnHeadersRowIndex, range.getColumn(), 1, numColumns);
  var headers = headersRange.getValues()[0];
  return getObjects(range.getValues(), normalizeHeaders(headers));
}


// For every row of data in data, generates an object that contains the data. Names of
// object fields are defined in keys.
// Arguments:
//   - data: JavaScript 2d array
//   - keys: Array of Strings that define the property names for the objects to create
function getObjects(data, keys) {
  var objects = [];
  for (var i = 0; i < data.length; ++i) {
    var object = {};
    var hasData = false;
    for (var j = 0; j < data[i].length; ++j) {
      var cellData = data[i][j];
      if (isCellEmpty(cellData)) {
        continue;
      }
      object[keys[j]] = cellData;
      hasData = true;
    }
    if (hasData) {
      objects.push(object);
    }
  }
  return objects;
}

// Returns an Array of normalized Strings.
// Arguments:
//   - headers: Array of Strings to normalize
function normalizeHeaders(headers) {
  var keys = [];
  for (var i = 0; i < headers.length; ++i) {
    var key = normalizeHeader(headers[i]);
    if (key.length > 0) {
      keys.push(key);
    }
  }
  return keys;
}

// Normalizes a string, by removing all alphanumeric characters and using mixed case
// to separate words. The output will always start with a lower case letter.
// This function is designed to produce JavaScript object property names.
// Arguments:
//   - header: string to normalize
// Examples:
//   "First Name" -> "firstName"
//   "Market Cap (millions) -> "marketCapMillions
//   "1 number at the beginning is ignored" -> "numberAtTheBeginningIsIgnored"
function normalizeHeader(header) {
  var key = "";
  var upperCase = false;
  for (var i = 0; i < header.length; ++i) {
    var letter = header[i];
    if (letter == " " && key.length > 0) {
      upperCase = true;
      continue;
    }
    if (!isAlnum(letter)) {
      continue;
    }
    if (key.length == 0 && isDigit(letter)) {
      continue; // first character must be a letter
    }
    if (upperCase) {
      upperCase = false;
      key += letter.toUpperCase();
    } else {
      key += letter.toLowerCase();
    }
  }
  return key;
}

// Returns true if the cell where cellData was read from is empty.
// Arguments:
//   - cellData: string
function isCellEmpty(cellData) {
  return typeof(cellData) == "string" && cellData == "";
}

// Returns true if the character char is alphabetical, false otherwise.
function isAlnum(char) {
  return char >= 'A' && char <= 'Z' ||
    char >= 'a' && char <= 'z' ||
    isDigit(char);
}

// Returns true if the character char is a digit, false otherwise.
function isDigit(char) {
  return char >= '0' && char <= '9';
}
// getColumnsData iterates column by column in the input range and returns an array of objects.
// Each object contains all the data for a given column, indexed by its normalized row name.
// Arguments:
//   - sheet: the sheet object that contains the data to be processed
//   - range: the exact range of cells where the data is stored
//   - rowHeadersColumnIndex: specifies the column number where the row names are stored.
//       This argument is optional and it defaults to the column immediately left of the range; 
// Returns an Array of objects.
function getColumnsData(sheet, range, rowHeadersColumnIndex) {
  rowHeadersColumnIndex = rowHeadersColumnIndex || range.getColumnIndex() - 1;
  var headersTmp = sheet.getRange(range.getRow(), rowHeadersColumnIndex, range.getNumRows(), 1).getValues();
  var headers = normalizeHeaders(arrayTranspose(headersTmp)[0]);
  return getObjects(arrayTranspose(range.getValues()), headers);
}

Stringformat = function() {
  var s = arguments[0];
  for (var i = 0; i < arguments.length - 1; i++) {       
    var reg = new RegExp("\\{" + i + "\\}", "gm");             
    s = s.replace(reg, arguments[i + 1]);
  }

  return s;
}

function Stringcapitalize(string){
    return string.charAt(0).toUpperCase() + string.slice(1);
}

function StringTrim(str) {
	return str.replace(/^\s+|\s+$/g,"");
}
