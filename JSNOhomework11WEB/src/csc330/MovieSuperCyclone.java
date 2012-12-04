/*
 * MovieSuperCyclone
 * .java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieSuperCyclone extends Movie{
	public MovieSuperCyclone() {
		super("Super Cyclone", "1:30", "Asylum",
				"Widescreen", "supercyclone.jpeg", 1.0,"NR",
				new ArrayList<String>(Arrays.asList("Action", 
						"Sci-Fi & Fantasy")),
				new ArrayList<String>(Arrays.asList("Liz Adams")),
				new ArrayList<String>(Arrays.asList("Nick Turturro",
						"Andy Clemence", "Ming-Na Wen","Darin Cooper",
						"Dylan Vox")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,9,25, "A storm the size of a continent..." +
						"that threatens to destroy us all!");
	}

}
