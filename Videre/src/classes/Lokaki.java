/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Created on : Oct 4, 2011, 7:28:33 PM
 * @author diogo
 */
public class Lokaki {

	protected static LokakiData currentData;

	public static void SetLokakiData(LokakiData newData) {
//		if (currentData == null || currentData.toString().equals(newData.toString())) {
		currentData = newData;
//		}
	}

	public static String GetText(int id){
		return currentData.GetLokaki(id);
	}
	/*
	public static void main(String[] args) {
		Lokaki.SetLokakiData(new LokakiPortugues());
		System.out.println(Lokaki.GetText(0));
		System.out.println(Lokaki.GetText(1));
		
		Lokaki.SetLokakiData(new LokakiEnglish());
		System.out.println(Lokaki.GetText(0));
		System.out.println(Lokaki.GetText(1));
	}
	 * 
	 */
}

abstract class LokakiData {

	protected String[] texts;

	public boolean HasText(int id) {
		if (id < 0 || id >= texts.length) {
			return false;
		}
		return true;
	}

	public String GetLokaki(int id) {
		if (HasText(id)) {
			return GetText(id);
		} else {
			return GetInvalidText(id);
		}
	}

	protected String GetText(int id) {
		return texts[id];
	}

	private String GetInvalidText(int id) {
		return "lokaki " + id;
	}
}

// <editor-fold defaultstate="collapsed" desc="Generated Code">
class LokakiPortugues extends LokakiData {

	@Override
	public String toString() {
		return "Português";
	}

	public LokakiPortugues() {
		texts = new String[]{
					"ola mundo",
					"alguma coisa"
				};
	}
}

class LokakiEnglish extends LokakiData {

	@Override
	public String toString() {
		return "English";
	}

	public LokakiEnglish() {
		texts = new String[]{
					"hello world",
					"something"
				};
	}
}
// </editor-fold>
