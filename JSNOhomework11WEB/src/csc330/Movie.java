/*
 * Movie.java
 * (c) Jeff Stern and Nick Olano, 2012
 * October 30, 2012
 */

package csc330;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * 
 * @author jeffreyStern and nicholasOlano
 *
 */
public class Movie {

	String title, runningTime, studio, format, imagePath, rate, description;
	double rating;
	int year, month, day;
	ArrayList<String> genres = new ArrayList<String>();
	ArrayList<String> directors = new ArrayList<String>();
	ArrayList<String> actors = new ArrayList<String>();
	ArrayList<String> subtitles = new ArrayList<String>();
	static Calendar releaseDate = Calendar.getInstance();
	
	/**
	 * Movie Constructor
	 * 
	 * @param title - title of the movie
	 * @param runningTime - length of the movie
	 * @param studio - where the movie was created
	 * @param format - widescreen or fullscreen
	 * @param imagePath - where the image of the movie is located
	 * @param rating - rating from other views of the movie
	 * @param rate - rating from the MPAA
	 * @param genres - what genre the movie falls under
	 * @param directors - who directed the movie
	 * @param actors - actors in the movie
	 * @param subtitles - what language the movie subtitles are in
	 * @param year - year the movie was added to redbox
	 * @param month - month the movie was added to redbox
	 * @param day - day the movie was added to redbox
	 * @param description - what the movie is about
	 */
	public Movie(String title, String runningTime, String studio,
			String format, String imagePath, double rating,String rate,
				ArrayList<String> genres,
			ArrayList<String> directors, ArrayList<String> actors,
			ArrayList<String> subtitles, int year, int month, int day,
			String description) {
	    this.title = title;
	    this.runningTime = runningTime;
	    this.studio = studio;
	    this.imagePath = imagePath;
	    this.format = format;
	    this.rate = rate;
	    this.description = description;
	    this.rating = rating;
	    this.genres = genres;
	    this.directors = directors;
	    this.actors = actors;
	    this.subtitles = subtitles;
	    this.year = year;
	    this.month = month;
	    this.day = day;

	  }

	/**
	 * Compares two movies to determine which one comes first when sorting 
	 * by date
	 * @param z
	 * @return integer to let the sort know which movie comes first
	 */

	public int compareTo(Movie z) 
	  {
	      int res=0;
	     	Calendar c = Calendar.getInstance();
	      	c.set(getYear(), getMonth(), getDay());
	      	long currentTime = c.getTimeInMillis();
	      	
	      	Calendar c2 = Calendar.getInstance();
	      	c2.set(z.getYear(), z.getMonth(), z.getDay());
	      	long currentTime2 = c2.getTimeInMillis();
	      	
	        if (currentTime < currentTime2) {res=1;  }
	        if (currentTime > currentTime2){res=-1;}
	      return res;
	  }
	
	/**
	 * Compares the titles to determine which movie comes firls alphabetically
	 * 
	 * @param z
	 * @return integer to let the sort know which movie comes first
	 */
	public int compareTitleTo(Movie z) 
	  {
			if(getTitle().equals(z.getTitle())) {
				return 0;
			}
			int forloopLength;
			if(getTitle().length() > z.getTitle().length()) {
				forloopLength = z.getTitle().length();
			}
			else {
				forloopLength = getTitle().length();
			}
			
			for(int i = 0; i < forloopLength; i++){
		        if (getTitle().charAt(i) == z.getTitle().charAt(i)){
		        	continue;
		        }
				if (getTitle().charAt(i) < z.getTitle().charAt(i)) { return -1;}
				else { return 1; }				
			}
	      return 0;
	  }
	
	/**
	 * Setters and Getters
	 */
	public String getRate() {
		return rate;
	}


	public void setRate(String rate) {
		this.rate = rate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}

	public ArrayList<String> getDirectors() {
		return directors;
	}

	public void setDirectors(ArrayList<String> directors) {
		this.directors = directors;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

	public ArrayList<String> getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(ArrayList<String> subtitles) {
		this.subtitles = subtitles;
	}
	
	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

}