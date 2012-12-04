/*
 * MovieSpaceDogs.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieSpaceDogs extends Movie {

	public MovieSpaceDogs() {
		super("Space Dogs", "1:28", "Phase 4 Films",
				"Widescreen", "spacedogs.jpeg", 3.5,"G",
				new ArrayList<String>(Arrays.asList("Family", "Kids")),
				new ArrayList<String>(Arrays.asList("Slava Ushakov")),
				new ArrayList<String>(Arrays.asList("Chloe Grace Moretz",
						"Dorothy Fahn","Spike Spencer","Richard Epcar",
						"Ellyn Epcar")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2010,3,18,"A circus dog named Belka and a stray dog" +
						" named Strelka embark on an out-of-this-world " +
						"adventure to become the worlds most famous canine " +
						"cosmonauts.");
	}
}