/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.applet.AudioClip;
import java.net.URL;


/**
 * Created on : Feb 6, 2012, 7:16:18 PM
 * @author diogo
 * controla tocar musicas de fundo
 */
public class AudioManager {

	public static final boolean DISABLE_SOUNDS = true; // faster to open menus when true

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static AudioManager instance;

	public static AudioManager GetInsance() {
		InicializarSingleton();
		return instance;
	}
	public static void InicializarSingleton() {
		if (instance == null) {
			instance = new AudioManager();
		}
	}
	// </editor-fold>


    protected AudioClip currentAudio = null;
	
	public void PlayBGM(URL audioFile) {
		if (DISABLE_SOUNDS) {
			return;
		}
		// stop current audio
		if (currentAudio != null) {
			currentAudio.stop();
		}

		if (audioFile != null) {
			
			try {
				currentAudio = java.applet.Applet.newAudioClip(audioFile);
				currentAudio.loop();
			} catch (Exception e) {
				System.err.println("Arquivo nao achado: " + audioFile.getPath());
			}
			
		}
	}
	
}
