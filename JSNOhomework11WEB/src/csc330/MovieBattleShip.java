/*
 * MovieBattleShip.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieBattleShip extends Movie{
	public MovieBattleShip() {
		super("BattleShip", "2:12", "Universal",
				"Widescreen", "battleship.jpeg", 4.0,"PG-13",
				new ArrayList<String>(Arrays.asList("Action", "Sci-Fi " +
						"& Fantasy")),
				new ArrayList<String>(Arrays.asList("Peter Berg")),
				new ArrayList<String>(Arrays.asList("Taylor Kitsch",
						"Alexander Skarsgord", "Rihanna","Brooklyn Decker",
						"Tadanobu Asano")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,9,25,"When scientists discover a planet in a nearby " +
						"galaxy capable of sustaining life, they attempt " +
						"to communicate with its inhabitants who respond " +
						"by paying Earth a visit. When the alien spacecraft " +
						"crash lands in the Pacific, near the naval station" +
						" off the coast of Hawaii, a battle for supremacy" +
						" unfolds on the water.");
	}
}
