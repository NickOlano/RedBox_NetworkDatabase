/*
 * MovieTheLorax.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTheLorax extends Movie{
	public MovieTheLorax() {
		super("Dr.Seuss The Lorax", "1:27", "Lions Gate",
				"Widescreen", "lorax.jpeg", 4.0,"PG",
				new ArrayList<String>(Arrays.asList("Family", "Kids")),
				new ArrayList<String>(Arrays.asList("Universal")),
				new ArrayList<String>(Arrays.asList("Danny DeVito","Ed Helms", 
						"Zac Efron","Taylor Swift","Betty White")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,9,4, "A boy searches for the one thing that will enable" +
						"him to win the affections of the girl of his dreams." +
						"To find it, he must discover the story of the Lorax," +
						"the grumpy yet charming creature who fights to" +
						"protect his world.");
	}

}
