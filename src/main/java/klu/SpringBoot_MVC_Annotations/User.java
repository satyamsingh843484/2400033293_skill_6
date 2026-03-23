package klu.SpringBoot_MVC_Annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class User {
	
	@GetMapping("/welcome")
	//@ResponseBody
	public String display() {
		return "Welcome Controller";
	}

	@GetMapping("/d1")
	//@ResponseBody
	public String display1() {
		return "Controller from display1 method";
	}
	@GetMapping("/d2")
	//@ResponseBody
	public String display2() {
		return "Controller from display2 method";
	
	}
	@GetMapping("/d3")
	//@ResponseBody
	public int display3() {
		return 10;
		
	}
	
	//with parameter name   @RequestParam http://localhost:9372/d9?id=100
	@GetMapping("/d9")
	public int display9(@RequestParam("id") int uid) {
		return uid;
	}
	
	
	
	
	
	
	
	
	
	
	//without parameter name                  @PathVariable
	
	@RestController
	public class MyController {

	    @GetMapping("/d10/{eid}")
	    public int display10(@PathVariable("eid") int uid1) {
	        return uid1;
	    }
	}

	
	
	
	
	
	
	@GetMapping("/d4")
	//@ResponseBody
	public String display4() {
		return "Controller from display4 method";
	}
	@GetMapping("/d5")
	//@ResponseBody
	public String display5() {
		return "Controller from display5 method";
	}
	@GetMapping("/d6")
	//@ResponseBody
	public String display6() {
		return "Controller from display6 method";
	}
	
	

}