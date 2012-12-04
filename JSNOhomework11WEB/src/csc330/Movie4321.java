/*
 * Movie4321.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie4321 extends Movie{

	public Movie4321() {
		super("4.3.2.1", "1:57", "Universal",
				"Widescreen", "four321.jpeg", 2.0,"NR",
				new ArrayList<String>(Arrays.asList("Drama", "Suspense")),
				new ArrayList<String>(Arrays.asList("Noel Clarke")),
				new ArrayList<String>(Arrays.asList("Emma Roberts",
						"Noel Clarke", "Tamsin Egerton","Ophelia Lovibond",
						"Shanika Warren")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,8,28,"While Jo (Roberts) is chained down in a dead end" +
						" supermarket job, her friends are all out on their" +
						" own separate adventures: Cassandra (Egerton) is" +
						" jetting off to New York to meet her Internet " +
						" boyfriend; Kerrys (Warren-Markland) is on a one" +
						" woman crusade fighting for female liberation and" +
						" Shannon (Lovibond) is on a one way trip to meet" +
						" her maker.");
		}

}
