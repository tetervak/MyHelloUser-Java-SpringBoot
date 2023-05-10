package sheridan.tetervak.myhellouser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sheridan.tetervak.myhellouser.model.AppUser;

@Controller
public class HelloController {

    @GetMapping("/")
    public String input(){
        return "Input";
    }

    @GetMapping("/output")
    public ModelAndView output(
            @RequestParam String firstName,
            @RequestParam String lastName
    ){

        AppUser appUser = new AppUser(firstName ,lastName);

        return new ModelAndView("Output", "appUser", appUser);
    }

}
