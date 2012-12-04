/*
 * MovieDarkShadows.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieDarkShadows extends Movie{
	public MovieDarkShadows() {
		super("Dark Shadows", "1:53", "Warner",
				"Widescreen", "darkshadowsB.jpeg", 3.5,"PG-13",
				new ArrayList<String>(Arrays.asList("Comedy")),
				new ArrayList<String>(Arrays.asList("Tim Burton")),
				new ArrayList<String>(Arrays.asList("Johnny Depp",
						"Michelle Pfeiffer", "Helena Bonham Carter",
						"Eva Green","Jackie Earle Haley")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,10,29,"In the year 1752, Joshua and Naomi Collins, " +
						"with young son Barnabas, set sail from Liverpool," +
						" England to start a new life in America. But even" +
						" an ocean was not enough to escape the mysterious" +
						" curse that has plagued their family. Two decades" +
						" pass and Barnabas has the world at his feet-or " +
						"at least the town of Collinsport, Maine.");
	}

}
