/*
 * MovieTropicThunder.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTropicThunder extends Movie{
	public MovieTropicThunder() {
		super("Tropic Thunder", "1:47", "Dreamworks",
				"Widescreen", "tropicthunder.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList("Comedy")),
				new ArrayList<String>(Arrays.asList("Ben Stiller")),
				new ArrayList<String>(Arrays.asList("Ben Stiller","Jack Black",
						"Robert Downey Jr.")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,9,18, "A group of self-absorbed actors set out to make" +
						"the most expensive war film. But after ballooning" +
						"costs force the studio to cancel the movie, the " +
						"frustrated director refuses to stop shooting, leading "
						+
						"his cast into the jungles of Southeast Asia, where " +
						"they encounter real bad guys.");
	}

}
