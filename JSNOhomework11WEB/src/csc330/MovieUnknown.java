/*
 * MovieUnknown.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */


package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieUnknown extends Movie{
	public MovieUnknown() {
		super("The Unknown", "2:23", "Sony",
				"Widescreen", "unknown.jpeg", 1.5,"NR",
				new ArrayList<String>(Arrays.asList("Action", "Horror","Suspense")),
				new ArrayList<String>(Arrays.asList("Martha Coolidge")),
				new ArrayList<String>(Arrays.asList("Dominic Monaghan","Brian Krause", "Ryann Turner","William Atherton","Joanne Baron")),
				new ArrayList<String>(Arrays.asList("English")),
				2012,10,2, "Dr. Martin Harris awakens after a car accident in" +
						"Berlin to discover that his wife suddenly doesnt " +
						"recognize him and another man has assumed his identity." +
						" Ignored by disbelieving authorities and hunted by" +
						"mysterious assassins, he finds himself alone, tired" +
						"and on the run. Aided by an unlikely ally, Martin" +
						"plunges headlong into a deadly mystery that will force" +
						"him to question his sanity, his identity, and just how" +
						"far hes willing to go to uncover the truth.");
	}

}
