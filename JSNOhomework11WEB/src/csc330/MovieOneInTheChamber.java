/*
 * MovieOneInTheChamber.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieOneInTheChamber extends Movie{
	public MovieOneInTheChamber() {
		super("One in the Chamber", "1:31", "Anchor Bay",
				"Widescreen", "oneinthechamber.jpeg", 3.0,"R",
				new ArrayList<String>(Arrays.asList("Action", "Adventure")),
				new ArrayList<String>(Arrays.asList("William Kaufman")),
				new ArrayList<String>(Arrays.asList("Cuba Gooding",
						"Dolph Lundgren", "Louis Mandylor","Billy Murray",
						"Claudia Bassols")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,8,21,"A seasoned assassin plays both sides in a Russian " +
						"gang war and becomes the target of an unknown enemy.");
	}

}
