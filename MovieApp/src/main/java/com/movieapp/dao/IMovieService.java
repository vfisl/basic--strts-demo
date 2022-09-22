package com.movieapp.dao;

import java.util.List;

public interface IMovieService {
    List<String> getByGenre(String category);
}
