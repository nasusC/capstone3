package cdproject.capstone3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {

  @GetMapping("/")
  public String show_home(){
    return "index";
  }

  @GetMapping("login")
  public String login(){
    return "login";
  }
  @PostMapping("login")
  public String logincheck(@RequestParam String userId){
    return null;
  }

  @GetMapping("main")
  public String main(){
    return "main";
  }

}
