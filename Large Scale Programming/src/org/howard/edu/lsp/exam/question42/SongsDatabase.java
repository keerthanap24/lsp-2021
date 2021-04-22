package org.howard.edu.lsp.exam.question42;

import java.util.*;

public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();


	/**
	 * Add a song title to a genre
	 * @param genre
	 * @param songTitle
	 */
	public void addSong(String genre, String songTitle) {
			if(map.containsKey(genre)) {
				map.get(genre).add(songTitle);
			}else {
				Set<String> newSet = new HashSet<String>();
				newSet.add(songTitle);
				map.put(genre, newSet);
			}
		}


	/**
	 * Return the Set that contains all songs for a genre
	 * @param genre
	 * @return set that contains all songs for a genre
	 */
	public Set<String> getSongs(String genre) {
			return map.get(genre);
	}

	/**
	 * Return genre, i.e., jazz, given a song title
	 * @param songTitle
	 * @return genre given a song title or "Does not exist" if the genre doesn't exist
	 */
	public String getGenreOfSong(String songTitle) {
			for(Map.Entry<String, Set<String>> e : map.entrySet()) {
				if(e.getValue().contains(songTitle)) {
					return e.getKey();
				}
			}
			return("Does not exist");
	}
	
	/**
	 * @return string of hashmap
	 */
	public String toString() {
		return map.toString();
	}
}



