/*
 * MovieForTheLoveOfMoney.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieForTheLoveOfMoney extends Movie{
	public MovieForTheLoveOfMoney() {
		super("For the Love of Money", "1:15", "Lions Gate",
				"Widescreen", "money.jpeg", 2.0,"R",
				new ArrayList<String>(Arrays.asList("Action")),
				new ArrayList<String>(Arrays.asList("Ellie Kanner-Zuckerman")),
				new ArrayList<String>(Arrays.asList("James Caan","Paul Sorvino",
						"Jeffrey Tambor"," Edward Furlong","Delphine Chaneac")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,9,4,"Attempting to escape a life surrounded by brutal " +
						"crime and violence, a young hustler immigrates to " +
						"Los Angeles for a fresh start. When his life and " +
						"everything he has built is threatened, he has no " +
						"choice but to confront the past he has been " +
						"running from.");
	}

}
