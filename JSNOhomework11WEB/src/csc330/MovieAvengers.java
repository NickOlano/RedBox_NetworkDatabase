/*
 * MovieAvengers.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieAvengers extends Movie{
	public MovieAvengers() {
		super("The Avengers", "2:23", "BVHE",
				"Widescreen", "avengers.jpeg", 4.5,"PG-13",
				new ArrayList<String>(Arrays.asList("Action","Adventure",
						"Sci-Fi & Fantasy")),
				new ArrayList<String>(Arrays.asList("Joss Whedon")),
				new ArrayList<String>(Arrays.asList("Robert Downey",
						"Chris Evans", "Mark Ruffalo","Chris Hemsworth",
						"Scarlett Johansson")),
				new ArrayList<String>(Arrays.asList("English")),
				2012,10,29,"When scientists discover a planet in a nearby " +
						"galaxy capable of sustaining life, they attempt to " +
						"communicate with its inhabitants who respond by " +
						"paying Earth a visit. When the alien spacecraft " +
						"crash lands in the Pacific, near the naval station" +
						" off the coast of Hawaii, a battle for supremacy " +
						"unfolds on the water.");
	}

}
