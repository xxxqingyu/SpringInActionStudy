/**
 * 
 */
package soundsystem;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class BlankDisc implements ICompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	/**
	 * 
	 */
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see soundsystem.ICompactDisc#play()
	 */
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

}
