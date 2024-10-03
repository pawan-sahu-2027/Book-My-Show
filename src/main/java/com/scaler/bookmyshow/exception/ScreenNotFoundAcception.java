package com.scaler.bookmyshow.exception;

import com.scaler.bookmyshow.repository.ScreensRepository;

public class ScreenNotFoundAcception extends Exception{
  public   ScreenNotFoundAcception (String message){
      super(message);
  }
}
