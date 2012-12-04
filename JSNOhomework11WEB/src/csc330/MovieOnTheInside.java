/*
 * MovieOnTheInside.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */
package csc330;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieOnTheInside extends Movie{
	public MovieOnTheInside() {
		super("On the inside", "1:30", "Anchor Bay",
				"Widescreen", "ontheinside.jpeg", 2.5,"R",
				new ArrayList<String>(Arrays.asList("Suspense", "Drama")),
				new ArrayList<String>(Arrays.asList("D. W. Brown")),
				new ArrayList<String>(Arrays.asList("Nick Stahl","Olivia Wilde",
						"Dash Mihok","Shohreh Aghdashloo","Daniel London")),
				new ArrayList<String>(Arrays.asList("English","Spanish")),
				2012,10,16,"After a revenge killing goes tragically wrong, " +
						"a troubled college professor is sentenced to a " +
						"psychiatric hospital for the criminally insane. " +
						"But through an experimental socialization program, " +
						"he meets a beautiful fellow inmate with a shocking " +
						"secret as well as a volatile psychopath with a " +
						"deadly history. In a place of sudden violence and " +
						"buried emotions, can two damaged souls now make one " +
						"last stab at redemption?");
	}


}
