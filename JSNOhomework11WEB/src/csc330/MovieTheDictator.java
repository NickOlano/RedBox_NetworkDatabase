/*
 * MovieTheDictator.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTheDictator extends Movie{
	public MovieTheDictator() {
		super("The Dictator", "1:31", "Paramount",
				"Widescreen", "dictator.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList("Comedy")),
				new ArrayList<String>(Arrays.asList("Larry Charles")),
				new ArrayList<String>(Arrays.asList("Sacha Baron Cohen",
						"Anna Faris", "Ben Kingsley","Jason Mantzoukas",
						"Sayed Badreya")),
				new ArrayList<String>(Arrays.asList("English","Spanish",
						"French")),
				2012,8,28, "Ruthless dictator Admiral General Omar Aladeen" +
						"rules the oil-rich North African nation of Wadiya," +
						"beheading anyone who opposes him. Aladeen is" +
						"despised by all, including the countrys rightful" +
						"heir to power, Tamir, who tries to assassinate him," +
						"then plots his destruction by luring him to New York" +
						"where he is replaced by body double Efawadh. But the" +
						"Supreme Leader begins to find his place within the" +
						"capitalist system.");
	}

}
