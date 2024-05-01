package cdproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

  @GetMapping("/")
  public String show_home(){
    return "index";
  }


}
