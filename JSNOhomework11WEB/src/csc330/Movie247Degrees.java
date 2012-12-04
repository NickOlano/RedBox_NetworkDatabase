/*
 * Movie247Degrees.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie247Degrees extends Movie {

	public Movie247Degrees() {
		super("247 Degress", "2:00", "Anchor Bay",
				"Widescreen", "247degrees.jpeg", 4.5,"R",
				new ArrayList<String>(Arrays.asList("Horror", "Action")),
				new ArrayList<String>(Arrays.asList("Levan Bakhia")),
				new ArrayList<String>(Arrays.asList("Scout Taylor-Compton",
						"Tyler Mane", "Christina Ulloa","Travis Van Winkle",
						"Michael Copon")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,10,31,"When four friends travel to a lakeside cabin for" +
						" a carefree weekend, the fun turns into a nightmare" +
						" when three of them end up locked in a hot sauna." +
						" Every minute counts and every degree matters as " +
						"they fight for their lives in heat that is " +
						"quickly approaching the deadly limit of 247°F.");
	}

}
