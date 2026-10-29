package org.example.webui.week9.service;

import org.example.webui.week9.entity.Movie;
import org.example.webui.week9.repository.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie create(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie get(Long id){
        return movieRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Movie not found:"+id));
    }

    public Movie update(Long id, Movie request){
        Movie movie =  get(id);

        movie.setTitle(request.getTitle());
        movie.setDirector(request.getDirector());
        movie.setGenre(request.getGenre());
        movie.setReleaseYear(request.getReleaseYear());
        movie.setRating(request.getRating());
        movie.setRunningTime(request.getRunningTime());

        return movieRepository.save(movie);
    }

    public void delete(Long id){
        get(id);
        movieRepository.deleteById(id);
    }

}
