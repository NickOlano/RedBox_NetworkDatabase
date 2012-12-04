/*
 * MovieAfterDuskTheyCome.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */

package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieAfterDuskTheyCame extends Movie{
	public MovieAfterDuskTheyCame() {
		super("After Dusk They Came", "1:57", "Lions Gate",
				"Widescreen", "afterdusk2.jpeg", 2.0,"R",
				new ArrayList<String>(Arrays.asList("Action", "Horror")),
				new ArrayList<String>(Arrays.asList("No Director")),
				new ArrayList<String>(Arrays.asList("Kellan Lutz",
						"Jewel Staite", "Nikki Griffin","Justin Baldoni",
						"Lance Henriksen")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,10,29,"A group of friends set out on a luxury yacht" +
						" for a gorgeous island vacation. But they soon" +
						" realize that they have veered off-course to " +
						"a strange uncharted island. After a horrific boat " +
						"crash shipwrecks them in the dense jungle, it " +
						"quickly becomes evident that they are not the " +
						"first to arrive to their new island prison. An" +
						" unknown, cannibalistic beast stalks the group " +
						"from the shadows, picking them off one-by-one.");
	}

}
