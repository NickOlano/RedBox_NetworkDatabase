/*
 * MovieClearskin.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieCleanskin extends Movie{
	public MovieCleanskin() {
		super("Clearskin", "1:47", "E1 Entertainment",
				"Widescreen", "cleanskin.jpeg", 3.0,"NR",
				new ArrayList<String>(Arrays.asList("Action")),
				new ArrayList<String>(Arrays.asList("Hadi Hajaig")),
				new ArrayList<String>(Arrays.asList("Sean Bean",
						"Charlotte Rampling", "Abhin Galeya",
						"Peter Polycarpou","Tuppence Middleton")),
				new ArrayList<String>(Arrays.asList("English")),
				2012,10,11,"A burnt-out secret service agent must pursue" +
						" and eliminate a deadly suicide bomber and dismantle" +
						" a terrorist cell that is wreaking havoc on the " +
						"streets of London before they strike again.");
	}

}
