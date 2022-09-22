package com.movieapp.dao;

import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByGenre(String category) {
		if (category.equals("thriller"))
			return Arrays.asList("John wick", "Extraction", "Basic INstinct");

		else if (category.equals("romance"))
			return Arrays.asList("NoteBook", "Prejudice");
		else if (category.equals("scienceFic"))
			return Arrays.asList("Intersteller", "Inception");
		else
			return Arrays.asList("Gravity", "Private Ryan");

	}

}
