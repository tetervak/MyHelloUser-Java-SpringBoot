package sheridan.tetervak.myhellouser.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.tetervak.myhellouser.model.AppUser;

@Controller
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public ModelAndView input(){
        log.trace("input() is called");
        return new ModelAndView("Input", "appUser", new AppUser());
    }

    @GetMapping("/output")
    public ModelAndView output(
           @Validated @ModelAttribute AppUser appUser,
           BindingResult bindingResult
    ){
        log.trace("output() is called");

        if(bindingResult.hasErrors()){
            return new ModelAndView("Input", "appUser", appUser);
        }

        log.debug("appUser=" + appUser);

        return new ModelAndView("Output", "appUser", appUser);
    }

}
