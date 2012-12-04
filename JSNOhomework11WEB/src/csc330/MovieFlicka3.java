/*
 * MovieFlicka3.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieFlicka3 extends Movie {

	public MovieFlicka3() {
		super("Flicka 3: Country Pride", "1:33", "Fox",
				"Widescreen", "flicka.jpeg", 4.0,"G",
				new ArrayList<String>(Arrays.asList("Family", "Drama")),
				new ArrayList<String>(Arrays.asList("Michael Damian")),
				new ArrayList<String>(Arrays.asList("Kacey Rohl", "Lisa Hartman",
						"Clint Black","Max Lloyd-Jones","Siobhan Williams")),
				new ArrayList<String>(Arrays.asList("English","French","Spanish")),
				2010,5,7,"When Toby takes on a managing job at a boarding " +
						"stable with Flicka in tow, the owners teenage " +
						"daughter Kelly quickly bonds with the wild horse. " +
						"Kelly, a budding equestrian rider, would love to " +
						"break Flicka for her teams competition, however, " +
						"her mother Lindy doesnt want to get her hopes up," +
						" as their stable may soon be for sale. With the " +
						"competition coming up and a rival trainer stealing" +
						" business, Toby steps in to train Kellys team and " +
						"save the stable.");
	}

}
