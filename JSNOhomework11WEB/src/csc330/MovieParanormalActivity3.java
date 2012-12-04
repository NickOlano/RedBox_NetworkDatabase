/*
 * MovieParanormalActivity3.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieParanormalActivity3 extends Movie{
	public MovieParanormalActivity3() {
		super("Paranormal Activity 3", "1:24", "Paramount",
				"Widescreen", "paranormalactivity3.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList("Horror")),
				new ArrayList<String>(Arrays.asList("Henry Joost")),
				new ArrayList<String>(Arrays.asList("Lauren Bittner",
						"Chris Smith", "Chloe Csengary","Jessica Brown",
						"Hallie Foote")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,10,18,"In 1988, a couple and their two young daughters " +
						"Katie and Kristi encounter an entity in their house. " 
				+
						"At first, the invisible presence is friendly toward " +
						"them, but its behavior changes drastically and it " +
						"starts tormenting them. So they install security " +
						"cameras to record these paranormal activities.");
	}

}
