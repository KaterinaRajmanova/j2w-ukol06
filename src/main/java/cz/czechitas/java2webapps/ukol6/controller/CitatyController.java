package cz.czechitas.java2webapps.ukol6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

/**
 *
 */
@Controller
public class CitatyController {
  private final CitatyService service;

  @Autowired
  public CitatyController( CitatyService service) {
   this.service = service;
  }

  @GetMapping("/")
  public ModelAndView nahodnyCitat() {
    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", service.vratNahodnyCitat());
    return modelAndView;
  }
}
