package klu.SpringBoot_MVC_Annotations;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class user_restcontroler {
  
  @GetMapping("/d7")
  public String display7() {
    return " Rest Controller from display7 method";
  }
  @GetMapping("/d8")
  public String display8() {
    return "Rest Controller from display8 method";
  }

}