/*
 * MovieHunter.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieHunter extends Movie{
	public MovieHunter() {
		super("The Hunter", "1:42", "Magnolia",
				"Widescreen", "hunter.jpeg", 3.0,"R",
				new ArrayList<String>(Arrays.asList("Drama", "Suspense")),
				new ArrayList<String>(Arrays.asList("Daniel Nettheim")),
				new ArrayList<String>(Arrays.asList("Willem Dafoe",
						"Frances OConnor", "Sam Neill","Morgana Davies",
						"Finn Woodlock")),
				new ArrayList<String>(Arrays.asList("Spanish")),
				2012,9,4, "Martin, a skilled and ruthless mercenary, is sent " +
						"into the Tasmanian wilderness on a hunt for a tiger " +
						"believed to be extinct. Hired by an anonymous " +
						"company that wants the tigers genetic material, " +
						"Martin arrives in Tasmania posing as a scientist. " +
						"He proceeds to set up base camp at a broken-down " +
						"farmhouse, where he stays with a family whose father" +
						" has gone missing. Usually a loner, Martin becomes " +
						"increasingly close to the family; however, as his" +
						" attachment to the family grows, Martin is led down" +
						" a path of unforeseen dangers, complicating his " +
						"deadly mission.");
	}

}
