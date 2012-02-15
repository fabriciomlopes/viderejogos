/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.net.URL;
import java.util.Random;

/**
 * Created on : Jan 30, 2012, 8:39:27 PM
 * @author diogo
 */
public class UtilidadesVidere {

	/**
	 * source: http://www.leepoint.net/notes-java/algorithms/random/random-shuffling.html
	 * @param iMin
	 * @param iMax
	 * @return
	 */
	public static int[] getShuffleIntegers(int iMin, int iMax){
		
		Random rgen = new Random();  // Random number generator
		int[] output = new int[iMax - iMin];

		//--- Initialize the array to the ints 0-51
		for (int i = 0; i < output.length; i++) {
			output[i] = i + iMin;
		}

		//--- Shuffle by exchanging each element randomly
		for (int i = 0; i < output.length; i++) {
			int randomPosition = rgen.nextInt(output.length);
			int temp = output[i];
			output[i] = output[randomPosition];
			output[randomPosition] = temp;
		}

		return output;
		
	}

	public static int[] getShuffleIntegers(int iMax){
		return getShuffleIntegers(0, iMax);
	}

	/**
	 * toca um Audio midi
	 * @param nomeAudio
	 */
	public static void TocarMusicaMIDI(String nomeAudio){
		try {
			//System.out.println("Tocando audio: " + nomeAudio);
			URL url = Recursos.GetInsance().getUrl(Defs.audioPath + nomeAudio + ".mid");
			AudioManager.GetInsance().PlayBGM(url);
		} catch (Exception e) {
			System.err.println("nao deu pra tocar: " + nomeAudio);
		}
	}

	/**
	 * join an integer array into a string.
	 * each value is separated by a sepearator
	 * @param sSeparator
	 * @param vSequence
	 * @return "1,2,3"
	 */
	public static String JoinInt(String sSeparator, int [] vSequence) {
		StringBuilder output = new StringBuilder();
		
		for (int index = 0; index < vSequence.length; index++) {
			int i = vSequence[index];

			output.append(String.valueOf(i));

			// next is last index?
			if (index+1 <= vSequence.length) {
				// no, then add separator
				output.append(sSeparator);
			}
			
		}
		
		return output.toString();
	}

//	public static void main(String[] args) {
//
//		int[] merda = getShuffleIntegers(50);
//		for (int index = 0; index  < merda.length; index ++) {
//			System.out.println(index + ": " + merda[index]);
//		}
//
//	}
	
}
