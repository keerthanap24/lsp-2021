package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	@Test
	@DisplayName("Test case for addSong")
	void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String data = db.toString();
		assertEquals("{Rap=[Savage, Gin and Juice], Jazz=[Always There]}", data);
	}

	@Test
	@DisplayName("Test case for getSongs")
	void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		Set<String> songs = db.getSongs("Rap");
		Set<String> answer = new HashSet();
		answer.add("Savage");
		answer.add("Gin and Juice");
		assertEquals(songs, answer);
	}

	@Test
	@DisplayName("Test case for getGenreOfSong")
	void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String genre1 = db.getGenreOfSong("Gin and Juice");
		String genre2 = db.getGenreOfSong("Always There");
		assertEquals(genre1, "Rap");
		assertEquals(genre2, "Jazz");
	}

}
