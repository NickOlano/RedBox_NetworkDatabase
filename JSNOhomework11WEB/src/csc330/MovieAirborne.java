/*
 * MovieAirborne.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieAirborne extends Movie{
	public MovieAirborne() {
		super("Airborne", "1:17", "Image",
				"Widescreen", "airborne.jpeg", 1.5,"NR",
				new ArrayList<String>(Arrays.asList("Action", "Horror")),
				new ArrayList<String>(Arrays.asList("Dominic Burns")),
				new ArrayList<String>(Arrays.asList("Mark Hamill",
						"Craig Conway", "Simon Phillips","Gemma Atkinson",
						"Kimberly Jaraj")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,10,16,"When a storm starts closing in, air traffic " +
						"controller Malcolm sends one last plane into the " +
						"sky - but after takeoff, the passengers aboard " +
						"discover the pilots have been brutally murdered. " +
						"Suddenly the plane disappears from radar, and one" +
						" by one, the people aboard turn into dangerous, " +
						"bloody psychopaths. With time running out, the " +
						"survivors must unlock the deadly mystery in their" +
						" midst - and find a way to land the plane before " +
						"their ultimate nightmare is unleashed.");
	}

}
