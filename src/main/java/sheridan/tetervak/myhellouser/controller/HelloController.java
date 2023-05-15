package sheridan.tetervak.myhellouser.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sheridan.tetervak.myhellouser.model.AppUser;

@Controller
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String input(){
        log.trace("input() is called");
        return "Input";
    }

    @GetMapping("/output")
    public ModelAndView output(
            @RequestParam String firstName,
            @RequestParam String lastName
    ){
        log.trace("output() is called");
        AppUser appUser = new AppUser(firstName ,lastName);

        log.debug("appUser=" + appUser);

        return new ModelAndView("Output", "appUser", appUser);
    }

}
