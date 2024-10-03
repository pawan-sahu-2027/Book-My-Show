package com.scaler.bookmyshow.controler;

import com.scaler.bookmyshow.dto.ShowDto;
import com.scaler.bookmyshow.exception.IllegalArgumentException;
import com.scaler.bookmyshow.models.Show1;
import com.scaler.bookmyshow.service.ShowService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowController {
    private ShowService showService;
    @Autowired
    public ShowController (ShowService showService){
        this.showService = showService;
    }

     @GetMapping("makeShow")
     @ResponseBody
    public ResponseEntity<Show1> makeShow (@RequestBody ShowDto showDto) throws IllegalArgumentException {
            Show1  show1 = showService.createShow(showDto.getScreen() , showDto.getMovie(),  showDto.getStartTime() , showDto.getEndTime() );

            return ResponseEntity.ok(show1);
    }
}
