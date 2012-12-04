/*
 * MovieCabinInTheWoods.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieCabinInTheWoods extends Movie{
	public MovieCabinInTheWoods() {
		super("The Cabin in the Woods", "1:34", "Lions Gate",
				"Widescreen", "cabininthewoods2.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList( "Horror","Suspense")),
				new ArrayList<String>(Arrays.asList("Drew Goddard")),
				new ArrayList<String>(Arrays.asList("Kristen Connolly",
						"Chris Hemsworth", "Anna Hutchison","Fran Kranz",
						"Jesse Williams")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,10,29,"A rambunctious group of five college friends " +
						"steal away for a weekend of debauchery in an i" +
						"solated country cabin, only to be attacked by " +
						"horrific supernatural creatures in a night of " +
						"endless terror and bloodshed. Sound familiar?" +
						" Just wait.");
	}

}