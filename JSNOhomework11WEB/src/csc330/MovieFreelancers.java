/*
 * MovieFreelancers.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieFreelancers extends Movie{
	public MovieFreelancers() {
		super("Freelancers", "1:36", "Lions Gate",
				"Widescreen", "Freelancers.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList("Action", "Drama")),
				new ArrayList<String>(Arrays.asList("Jessy Terrero")),
				new ArrayList<String>(Arrays.asList("50 Cent","Robert De Niro",
						"Forest Whitaker","Ryan ONan","Anabelle Acosta")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,8,21,"The son of a slain NYPD officer joins the force, " +
						"where he falls in with his fathers former partner " +
						"and a team of rogue cops. His new boss, Sarcone, " +
						"will see if he has what it takes to be rogue through " 
						+
						"many trials and tribulations of loyalty, trust " +
						"and respect. When the truth about his fathers " +
						"death is revealed, revenge takes over him and he " +
						"wont stop until justice has been truly served.");
	}

}
