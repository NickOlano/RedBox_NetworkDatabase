/*
 * RedboxBean.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */

package csc330;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.*;

import javax.faces.model.SelectItem;



/**
 * This bean file does all the logic of the redbox app.
 * 
 * @author jeffreyStern and nicholasOlano
 *
 */
public class RedboxBean {

	private String driver = "org.apache.derby.jdbc.ClientDriver";
	private String url = "jdbc:derby://localhost:1527/redbox;create=true";
	
	private Connection connection = null;
	private ArrayList<String> studios = new ArrayList<String>();;
	private ArrayList<String> genres = new ArrayList<String>();;

	private Properties userInfo = new Properties();

	public RedboxBean() {
		userInfo.put("user", "derbyuser");
		userInfo.put("password", "derbyuser");
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
			
			sta.executeQuery("SELECT * FROM studios");
		} catch (Exception e) {
			try { 
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();

			sta.executeUpdate("CREATE TABLE " +
					"STUDIOS(StudioID INT NOT NULL GENERATED ALWAYS AS " +
					"IDENTITY (START WITH 1, INCREMENT BY 1), " +
					"Studio VARCHAR(25), PRIMARY KEY (StudioID))");
			sta.executeUpdate("CREATE TABLE " +
					"RATINGS (RatingID INT NOT NULL GENERATED ALWAYS AS " +
					"IDENTITY (START WITH 1, INCREMENT BY 1), " +
					"Rating VARCHAR(25), PRIMARY KEY (RatingID))");
			sta.executeUpdate("CREATE TABLE GENRES " +
					"(GenreID INT NOT NULL GENERATED ALWAYS AS IDENTITY " +
					"(START WITH 1, INCREMENT BY 1), Genre VARCHAR(25), " +
					"PRIMARY KEY (GenreID))");
			sta.executeUpdate("CREATE TABLE MOVIE_GENRES " +
					"(MovieID INT NOT NULL, GenreID INT NOT NULL, " +
					"PRIMARY KEY (MovieID, GenreID))");
			sta.executeUpdate("CREATE TABLE MOVIES " +
					"( MovieID INT NOT NULL GENERATED ALWAYS AS IDENTITY " +
					"(START WITH 1, INCREMENT BY 1), MovieName VARCHAR(40), " +
					"RunningTime CHAR(10), ImagePath VARCHAR(25), " +
					"RatingID INT, ReleaseDate DATE, " +
					"AverageRating DECIMAL(10,2), Description VARCHAR(1500), " +
					"Format CHAR(25), Actors VARCHAR(255), " +
					"Directors VARCHAR(255), Languages VARCHAR(255), " +
					"StudioID INT, PRIMARY KEY (MOVIEID))");
			 
			sta.executeUpdate(generateStudiosInsert());
			sta.executeUpdate(generateMovieSQLStatement());
			sta.executeUpdate("INSERT INTO ratings (Rating) " +
					"VALUES ('G'),('PG'),('PG-13'),('R'),('NR')");
			sta.executeUpdate(generateGenresInsert());
			sta.executeUpdate(generateMovieGenresInsert());

		     sta.close();        	
		     connection.close();
			} catch (Exception e2) {
				
			}
		}
	}


	
	private String printSQLException(SQLException se) {
		String result = "";
		while (se != null) {

			result += "SQLException: State:   " + se.getSQLState();
			result += "Severity: " + se.getErrorCode() + "\n";
			result += se.getMessage();

			se = se.getNextException();
		}
		return result;
	}

	private String printSQLWarning(SQLWarning sw) {
		String result = "";
		while (sw != null) {

			result += "SQLWarning: State=" + sw.getSQLState() + "\n";
			result += ", Severity = " + sw.getErrorCode() + "\n";
			result += sw.getMessage();

			sw = sw.getNextWarning();
		}
		return result;
	}

	
	/**
	 * This query is the main query that drops, creates and populates tables
	 */
	public void doquery() {

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
			
			sta.executeUpdate("DROP TABLE movie_genres");
			sta.executeUpdate("DROP TABLE movies");
		    sta.executeUpdate("DROP TABLE studios");
		    sta.executeUpdate("DROP TABLE ratings");
		    sta.executeUpdate("DROP TABLE genres");
		     
			sta.executeUpdate("CREATE TABLE " +
					"STUDIOS(StudioID INT NOT NULL GENERATED ALWAYS AS " +
					"IDENTITY (START WITH 1, INCREMENT BY 1), " +
					"Studio VARCHAR(25), PRIMARY KEY (StudioID))");
			sta.executeUpdate("CREATE TABLE " +
					"RATINGS (RatingID INT NOT NULL GENERATED ALWAYS AS " +
					"IDENTITY (START WITH 1, INCREMENT BY 1), " +
					"Rating VARCHAR(25), PRIMARY KEY (RatingID))");
			sta.executeUpdate("CREATE TABLE GENRES " +
					"(GenreID INT NOT NULL GENERATED ALWAYS AS IDENTITY " +
					"(START WITH 1, INCREMENT BY 1), Genre VARCHAR(25), " +
					"PRIMARY KEY (GenreID))");
			sta.executeUpdate("CREATE TABLE MOVIE_GENRES " +
					"(MovieID INT NOT NULL, GenreID INT NOT NULL, " +
					"PRIMARY KEY (MovieID, GenreID))");
			sta.executeUpdate("CREATE TABLE MOVIES " +
					"( MovieID INT NOT NULL GENERATED ALWAYS AS IDENTITY " +
					"(START WITH 1, INCREMENT BY 1), MovieName VARCHAR(40), " +
					"RunningTime CHAR(10), ImagePath VARCHAR(25), " +
					"RatingID INT, ReleaseDate DATE, " +
					"AverageRating DECIMAL(10,2), Description VARCHAR(1500), " +
					"Format CHAR(25), Actors VARCHAR(255), " +
					"Directors VARCHAR(255), Languages VARCHAR(255), " +
					"StudioID INT, PRIMARY KEY (MOVIEID))");
			 
			sta.executeUpdate(generateStudiosInsert());
			sta.executeUpdate(generateMovieSQLStatement());
			sta.executeUpdate("INSERT INTO ratings (Rating) " +
					"VALUES ('G'),('PG'),('PG-13'),('R'),('NR')");
			sta.executeUpdate(generateGenresInsert());
			sta.executeUpdate(generateMovieGenresInsert());

		     sta.close();        	
		     connection.close();
		} catch (Exception e) {
			
		}
		
		selectedRating = "All Ratings";
		selectedSort = "Release Date";
		selectedGenre = "All";

	}

	private String movieShown;
	private String selectedRating = "All Ratings";
	private String selectedSort = "Release Date";
	private String selectedGenre = "All";
	private ArrayList <String> grid;
	

	/**
	 * Setters and Getters
	 */
	private String movieShownTitle;
	private String movieShownRate;
	private String movieShownRating;
	private String movieShownTime;
	private String movieShownDescription;
	private String movieShownGenres;
	private String movieShownStarring;
	private String movieShownImagePath;
	
	public String getMovieShownImagePath() {
		return movieShownImagePath;
	}

	public void setMovieShownImagePath(String movieShownImagePath) {
		this.movieShownImagePath = movieShownImagePath;
	}

	public String getMovieShownTitle() {
		return movieShownTitle;
	}

	public void setMovieShownTitle(String movieShownTitle) {
		this.movieShownTitle = movieShownTitle;
	}

	public String getMovieShownRate() {
		return movieShownRate;
	}

	public void setMovieShownRate(String movieShownRate) {
		this.movieShownRate = movieShownRate;
	}

	public String getMovieShownRating() {
		return movieShownRating;
	}

	public void setMovieShownRating(String movieShownRating) {
		this.movieShownRating = movieShownRating;
	}

	public String getMovieShownTime() {
		return movieShownTime;
	}

	public void setMovieShownTime(String movieShownTime) {
		this.movieShownTime = movieShownTime;
	}

	public String getMovieShownDescription() {
		return movieShownDescription;
	}

	public void setMovieShownDescription(String movieShownDescription) {
		this.movieShownDescription = movieShownDescription;
	}

	public String getMovieShownGenres() {
		return movieShownGenres;
	}

	public void setMovieShownGenres(String movieShownGenres) {
		this.movieShownGenres = movieShownGenres;
	}

	public String getMovieShownStarring() {
		return movieShownStarring;
	}

	public void setMovieShownStarring(String movieShownStarring) {
		this.movieShownStarring = movieShownStarring;
	}

	public String getMovieShownStudio() {
		return movieShownStudio;
	}

	public void setMovieShownStudio(String movieShownStudio) {
		this.movieShownStudio = movieShownStudio;
	}

	public String getMovieShownFormat() {
		return movieShownFormat;
	}

	public void setMovieShownFormat(String movieShownFormat) {
		this.movieShownFormat = movieShownFormat;
	}

	public String getMovieShownSubtitles() {
		return movieShownSubtitles;
	}

	public void setMovieShownSubtitles(String movieShownSubtitles) {
		this.movieShownSubtitles = movieShownSubtitles;
	}


	private String movieShownStudio;
	private String movieShownFormat;
	private String movieShownSubtitles;
	private String movieShownDirectors;
	
	public String getMovieShownDirectors() {
		return movieShownDirectors;
	}

	public void setMovieShownDirectors(String movieShownDirectors) {
		this.movieShownDirectors = movieShownDirectors;
	}

	public String getMovieShown() {
		return movieShown;
	}
	
	
	/**
	 * Creates select statement for single movie view
	 * 
	 * @param movieShown
	 */
	public void setMovieShown(String movieShown) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
		     ResultSet rs = sta.executeQuery("SELECT m.ImagePath, m.MovieName, " +
		     		"r.Rating, m.Description, m.RunningTime, m.AverageRating, " +
		     		"m.actors, m.directors, m.format, s.studio, m.languages " +
		     		"FROM movies AS m NATURAL JOIN ratings r NATURAL JOIN " +
		     		"studios s WHERE m.imagePath = '" + movieShown +"'");
		     rs.next();
		     setMovieShownDescription(rs.getString("description"));
		     setMovieShownRating(rs.getString("AverageRating"));
		     setMovieShownTime(rs.getString("RunningTime"));
		     setMovieShownRate(rs.getString("Rating"));
		     setMovieShownStarring(removeBrackets(rs.getString("actors")));
		     setMovieShownSubtitles(removeBrackets(rs.getString("languages")));
		     setMovieShownStudio(rs.getString("studio"));
		     setMovieShownImagePath(rs.getString("imagePath"));
		     setMovieShownDirectors(removeBrackets(rs.getString("directors")));
		     setMovieShownTitle(rs.getString("movieName"));
		     setMovieShownImagePath(rs.getString("imagePath"));
		     setMovieShownFormat(rs.getString("format"));
		     sta.close();        
		     connection.close();
		} catch (Exception e) {
			setMovieShownTitle(e.getMessage());
		}
		String genres = "";
		try {
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
		     ResultSet rs = sta.executeQuery("SELECT g.genre FROM genres AS g " +
		     		"NATURAL JOIN movie_genres AS mg " +
		     		"NATURAL JOIN movies AS m " +
		     		"WHERE m.imagePath = '" + movieShown +"'");
		     while(rs.next()){
		    	 genres += rs.getString(1) + ", ";
		     }
		     setMovieShownGenres(genres.substring(0,genres.length()-2));
		     sta.close();        
		     connection.close();
		} catch (Exception e) {
			setMovieShownTitle(e.getMessage());
		}
	}
	
	/**
	 * Deletes that movie from the movies table and refreshes grid view
	 * 
	 * @return Link back to homepage
	 */
	public String deleteButton(){
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
		    sta.executeUpdate("DELETE FROM movies AS m WHERE m.ImagePath = '" 
		    		+ getMovieShownImagePath() +"'");
		    sta.close();
		    connection.close();
		} catch (Exception e) {
			
		}
		return "firstPage";
	}
	
	public String removeBrackets(String input){
		String noBrackets = input.substring(1, input.length()-1);
		return noBrackets;
	}
	
	public String getSelectedSort() {
		return selectedSort;
	}

	public void setSelectedSort(String selectedSort) {
		this.selectedSort = selectedSort;
	}

	public String getSelectedRating() {
		return selectedRating;
	}

	public void setSelectedRating(String selectedRating) {
		this.selectedRating = selectedRating;
	}
	
	public ArrayList<String> getGrid() {
		return grid;
	}

	public void setGrid(ArrayList<String> grid) {
		this.grid = grid;
	}

	public String getSelectedGenre() {
		return selectedGenre;
	}

	public void setSelectedGenre(String selectedGenre) {
		this.selectedGenre = selectedGenre;
	}
	
	public SelectItem[] getRatingsSelection() {
		return ratingsSelection;
	}

	public void setRatingsSelection(SelectItem[] ratingsSelection) {
		this.ratingsSelection = ratingsSelection;
	}

	public SelectItem[] getSortSelection() {
		return sortSelection;
	}

	public void setSortSelection(SelectItem[] sortSelection) {
		this.sortSelection = sortSelection;
	}

	
	/**
	 * Determines if the selected genre is the same as the current genre
	 * @param genre
	 * @return true or false
	 */
	public boolean isActive(String genre) {
		if (selectedGenre.equals(genre)) return true;
		else return false;
	}
	/**
	 * Selects the genre foe which movies need to be displayed
	 */
	public void action() {
		selectedGenre = "Action";
		filterCovers();
	}
	public void comedy() {
		selectedGenre = "Comedy";
		filterCovers();
	}
	public void drama() {
		selectedGenre = "Drama";
		filterCovers();
	}
	public void family() {
		selectedGenre = "Family";
		filterCovers();
	}
	public void horror() {
		selectedGenre = "Horror";
		filterCovers();
	}
	public void all() {
		selectedGenre = "All";	
		filterCovers();
	}

	
/**
 * Creates all our movie instances
 */
	Movie247Degrees movie1 = new Movie247Degrees();
	Movie4321 movie2 = new Movie4321();
	MovieAfterDuskTheyCame movie3 = new MovieAfterDuskTheyCame();
	MovieAirborne movie4 = new MovieAirborne();
	MovieBattleShip movie5 = new MovieBattleShip();
	MovieCleanskin movie6 = new MovieCleanskin();
	MovieDarkShadows movie7 = new MovieDarkShadows();
	MovieForTheLoveOfMoney movie8 = new MovieForTheLoveOfMoney();
	MovieFreelancers movie9 = new MovieFreelancers();
	MovieOneInTheChamber movie10 = new MovieOneInTheChamber();
	MovieOnTheInside movie11 = new MovieOnTheInside();
	MovieParanormalActivity3 movie12 = new MovieParanormalActivity3();
	MoviePeopleLikeUs movie13 = new MoviePeopleLikeUs();
	MovieSnowWhite movie14 = new MovieSnowWhite();
	MovieSuperCyclone movie15 = new MovieSuperCyclone();
	MovieTheLorax movie16 = new MovieTheLorax();
	MovieTheDictator movie17 = new MovieTheDictator();
	MovieTropicThunder movie18 = new MovieTropicThunder();
	MovieUnknown movie19 = new MovieUnknown();
	MovieCabinInTheWoods movie20 = new MovieCabinInTheWoods();
	MovieHunter movie21 = new MovieHunter();
	MovieAvengers movie22 = new MovieAvengers();
	MovieSpaceDogs movie23 = new MovieSpaceDogs();
	MovieFlicka3 movie24 = new MovieFlicka3();
	MovieCowgirlsNAngels movie25 = new MovieCowgirlsNAngels();
	
	/**
	 * Creates an Array List of all our movie objects
	 */
	ArrayList<Movie> allMovies = new ArrayList<Movie>(Arrays.asList(movie1,
			movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9,
			movie10, movie11, movie12, movie13, movie14, movie15, movie16,
			movie17, movie18, movie19, movie20, movie21, movie22, movie23,
			movie24, movie25));
	
	/**
	 * SQL to insert into Studios table
	 * 
	 * @return SQL statement
	 */
	public String generateStudiosInsert() {
		String studiosStatement = "INSERT INTO studios (STUDIO) values ";
		for (Movie movie : allMovies) {
			if(!studios.contains(movie.getStudio())){
				studios.add(movie.getStudio());
			}
		}
		for (String studio : studios) {
			studiosStatement += "('" + studio + "'),";
		}
		studiosStatement = studiosStatement.substring(0,studiosStatement.length()-1);
		return studiosStatement;
	}
	
	/**
	 * SQL to insert Genres table
	 * @return SQL statement
	 */
	public String generateGenresInsert() {
		String genresStatement = "INSERT INTO genres (GENRE) values ";
		for (Movie movie : allMovies) {
			for (String genre : movie.getGenres()){
			if(!genres.contains(genre)){
				genres.add(genre);
			}
			}
		}
		for (String genre : genres) {
			genresStatement += "('" + genre + "'),";
		}
		genresStatement = genresStatement.substring(0,genresStatement.length()-1);
		return genresStatement;
	}
	
	/**
	 * SQL to insert Movie Genres insert
	 * 
	 * @return SQL Statement
	 */
	public String generateMovieGenresInsert() {
		generateGenresInsert();
		String moviegenresStatement = "INSERT INTO movie_genres " +
				"(MovieID, GenreID) values ";
		int i = 1;
		for (Movie movie : allMovies) {
			for (String genre : movie.getGenres()){
				moviegenresStatement +=  "(" + i + ", " + 
				(genres.indexOf(genre) + 1) + "),";
				}
			i++;

		}
		moviegenresStatement = moviegenresStatement.substring(0, 
				moviegenresStatement.length() - 1);
		return moviegenresStatement;
	}
	
	/**
	 * SQL to insert movies into movie table
	 * 
	 * @return SQL Statement
	 */
	public String generateMovieSQLStatement(){
		generateStudiosInsert();
		String insertMoviesSQL = "INSERT INTO movies" +
			" (MOVIENAME, RUNNINGTIME, IMAGEPATH, RATINGID, RELEASEDATE," +
			"AVERAGERATING, DESCRIPTION, FORMAT, ACTORS, DIRECTORS, LANGUAGES," +
			"STUDIOID) VALUES ";
		for (Movie movie : allMovies) {
			insertMoviesSQL += "('" + movie.getTitle() + "', '" + 
				movie.getRunningTime() +
			"', '" + movie.getImagePath() + "', ";
			String rating = movie.getRate();
			if (rating == "G"){
				insertMoviesSQL += "1, '";
			} else if (rating == "PG") {
				insertMoviesSQL += "2, '";
			} else if (rating == "PG-13") {
				insertMoviesSQL += "3, '";
			} else if (rating == "R") {
				insertMoviesSQL += "4, '";
			} else {
				insertMoviesSQL += "5, '";
			}
			insertMoviesSQL += movie.getYear() + "-" + movie.getMonth() + "-" +
			movie.getDay() +  "', " + movie.getRating() + ", '" +
			movie.getDescription() + "', '" + movie.getFormat() + "', '" +
			Arrays.toString(movie.getActors().toArray()) +  "', '" +
			Arrays.toString(movie.getDirectors().toArray()) + "', '" +
			Arrays.toString(movie.getSubtitles().toArray()) + "', "+ 
			 "1 ),";
			
		}
		insertMoviesSQL = insertMoviesSQL.substring(0, 
				insertMoviesSQL.length() - 1);

		return insertMoviesSQL;
	}
	
	/**
	 * All of our ratings for the dropdown list
	 */
	private SelectItem[] ratingsSelection = {
			new SelectItem("All Ratings"),
			new SelectItem("G"),
			new SelectItem("PG"),
			new SelectItem("PG-13"),
			new SelectItem("R"),
			new SelectItem("NR")
	};

	/**
	 * Release Date and Alphabetical sort options. Our list is filled from here
	 */
	private SelectItem[] sortSelection = {
			new SelectItem("Release Date"),
			new SelectItem("Alphabetical")
	};

	/**
	 * Filters all the movies and sorts them using SQL depending on what the user 
	 * selected and then returns an Array List with all the movies images path
	 * 
	 * @return ArrayList of the movies images paths
	 */
	public ArrayList<String> filterCovers(){

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();	 
			   sta.executeUpdate(generateStudiosInsert());
			   sta.executeUpdate(generateMovieSQLStatement());
			   sta.executeUpdate("INSERT INTO ratings (Rating) " +
			   		"VALUES ('G'),('PG'),('PG-13'),('R'),('NR')");
			   sta.executeUpdate(generateGenresInsert());
			   sta.executeUpdate(generateMovieGenresInsert());
		     sta.close();        	
		     connection.close();
		} catch (Exception e) {

		}
		
		ArrayList<String> covers = new ArrayList<String>();

		String qry = "SELECT DISTINCT ImagePath, m.movieName, m.releaseDate " +
				"FROM movies AS m INNER JOIN ratings r ON m.ratingid = r.ratingid " +
				"INNER JOIN movie_genres mg ON mg.movieid = m.movieid " +
				"INNER JOIN genres g ON g.genreid = mg.genreid ";
		boolean and = false;
		if(! getSelectedRating().equals("All Ratings")){
			qry += "WHERE Rating='" + getSelectedRating() + "'";
			and = true;
		}
		if (and && !selectedGenre.equals("All")) {
			qry += " AND Genre='" + selectedGenre + "'";
		}
		else if (!selectedGenre.equals("All")) {
			qry += "WHERE Genre='" + selectedGenre + "'";
		}
		if(getSelectedSort().equals("Alphabetical")){
			qry += " ORDER BY m.movieName";
		} else {
			qry += " ORDER BY m.releaseDate DESC";
		}
		
		try {
			connection = DriverManager.getConnection(url);
			Statement sta = connection.createStatement();
		    ResultSet rs = sta.executeQuery(qry);
		    while(rs.next()){
		      covers.add(rs.getString(1));
		    }
		     sta.close();        
		     connection.close();
		} catch (Exception e) {
			covers.add(e.getMessage());
		}

		return covers;	
	}
		
	/**
	 * Sends the user back to the first page when clicked
	 * 
	 * @return string that facesConfig uses to send the user to the home page
	 */
	public String continueButton(){
		return "firstPage";
	}

	/**
	 * When a movie is selected it will send the user to the movie selection 
	 * page
	 * 
	 * @return String of "valid"
	 */
	public String selectMovie(){
		return "valid";
	}
}