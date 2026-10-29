package org.example.webui.week9.controller;

import org.example.webui.week9.entity.Movie;
import org.example.webui.week9.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@RequestBody Movie movie){
        return movieService.create(movie);
    }

    @GetMapping
    public List<Movie> getAll(){
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable Long id){
        return movieService.get(id);
    }

    @PutMapping("/{id}")
    public Movie update(@PathVariable Long id, @RequestBody Movie movie){
        return movieService.update(id,movie);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        movieService.delete(id);
    }


}
