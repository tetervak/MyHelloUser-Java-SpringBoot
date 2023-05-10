package sheridan.tetervak.myhellouser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sheridan.tetervak.myhellouser.model.AppUser;

@Controller
public class HelloController {

    @GetMapping("/")
    public ModelAndView output(){

        AppUser appUser = new AppUser("Bart" ,"Simpson");

        return new ModelAndView("Output", "appUser", appUser);
    }

}
