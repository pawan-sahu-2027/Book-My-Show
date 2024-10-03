package com.scaler.bookmyshow.controler;

import com.scaler.bookmyshow.dto.ErrorDto;
import com.scaler.bookmyshow.dto.Userdto;
import com.scaler.bookmyshow.exception.UserAlreadyExistException;
import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.service.MovieService;
import com.scaler.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MovieController {
    @Autowired
   private MovieService movieService;
    @Autowired
    private UserService userService;
   public MovieController(MovieService movieService ) {
        this.movieService = movieService;
        this.userService = userService;
    }
   @PostMapping("/entermoviedetail/")
    public Movie saveMovieDetail ( @RequestBody Movie movie){
         Movie save = movieService.savemovie(movie);
         return movie;
    }
    @PostMapping("/singinservice/")
    public User singin (@RequestBody Userdto userdto) throws UserAlreadyExistException {
         return userService.singInService (userdto);
    }
    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ErrorDto> handleProductNotFoundException (Exception e){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage(e.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
    }

}
