/*
 * MoviePeopleLikeUs.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MoviePeopleLikeUs extends Movie{
	public MoviePeopleLikeUs() {
		super("People Like Us", "1:53", "BVHE",
				"Widescreen", "peoplelikeus.jpeg", 4.0,"PG-13",
				new ArrayList<String>(Arrays.asList("Drama")),
				new ArrayList<String>(Arrays.asList("Alex Kurtzman")),
				new ArrayList<String>(Arrays.asList("Chris Pine",
						"Elizabeth Banks", "Michael DAddario",
						"Michelle Pfeiffer","Olivia Wilde")),
				new ArrayList<String>(Arrays.asList("No subtitles")),
				2012,10,9, "Sam is a young, fast-paced salesman who" +
						"reluctantly returns home when he learns his father " +
						"has died unexpectedly. In the course of putting his " +
						"fathers estate in order and reconnecting with his " +
						"estranged family, Sam discovers he has an older " +
						"sister. As their relationship develops, Sam must" +
						" rethink everything he thought he knew about this " +
						"family and take a hard look at his own life choices.");
	}

}
