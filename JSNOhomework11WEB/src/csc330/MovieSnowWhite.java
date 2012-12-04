/*
 * MovieSnowWhite.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieSnowWhite extends Movie{
	public MovieSnowWhite() {
		super("Snow White and the Hunts Men", "2:08", "Universal",
				"Widescreen", "snow2.jpeg", 3.5,"PG-13",
				new ArrayList<String>(Arrays.asList("Action", "Adventure")),
				new ArrayList<String>(Arrays.asList("Rupert Sanders")),
				new ArrayList<String>(Arrays.asList("Kristen Stewart",
						
						"Chris Hemsworth", "Charlize Theron","Sam Claflin",
						"Sam Spruell")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,10,29,"Snow White is the only person in the land fairer" +
						"than the evil queen out to destroy her. But what the" +
						"wicked ruler never imagined is that the young woman" +
						"threatening her reign has been training in the art" +
						"of war with a huntsman dispatched to kill her.");
		
	}

}
