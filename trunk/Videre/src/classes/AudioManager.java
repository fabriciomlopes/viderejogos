/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.net.URL;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;


/**
 * Created on : Feb 6, 2012, 7:16:18 PM
 * @author diogo
 * controla tocar musicas de fundo
 */
public class AudioManager {

	public static final boolean DISABLE_SOUNDS = false; //

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

//    protected AudioClip currentAudio = null;
	/**
	 * The midi Player (this is better than AudioClip).
	 * It seems that it loads the midi file in 
	 * another thread so that it wouldn't freeze our game.
	 */
	protected Sequencer currentSequencer; 

	public void PlayBGM(URL audioFile) {
		if (DISABLE_SOUNDS) {
			return;
		}

		try {
			if (currentSequencer != null) {
				currentSequencer.stop();
			} else {
				// init the currentSequencer
				currentSequencer = MidiSystem.getSequencer();
				// set as loop
				currentSequencer.setLoopCount(currentSequencer.LOOP_CONTINUOUSLY);
			}

			if (audioFile != null) {
				Sequence sequenceToPlay = MidiSystem.getSequence(audioFile);
				currentSequencer.setSequence(sequenceToPlay);

				currentSequencer.open();
				currentSequencer.start();
//				
//				currentAudio = java.applet.Applet.newAudioClip(audioFile);
//				currentAudio.loop();
			}
		} catch (Exception e) {
			System.err.println("Arquivo nao achado: " + audioFile.getPath());
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
