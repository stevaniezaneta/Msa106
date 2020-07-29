package com.example.helloWorld;

import java.io.IOException;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@SpringBootApplication
public class HelloWorldApplication {

  @CrossOrigin(origins = "*")
  @RestController
  class ImageOverlayController {

      @RequestMapping(path = "/", method = RequestMethod.GET)
      public String Get() {
          return new Date().toString();
      }
    }
  
  public static void main(String[] args) throws IOException {
    SpringApplication.run(HelloWorldApplication.class, args);
  }
}
