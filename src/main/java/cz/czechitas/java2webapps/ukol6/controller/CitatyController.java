package cz.czechitas.java2webapps.ukol6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

/**
 *
 */
@Controller
public class CitatyController {
   private final CitatyService citatyService;

  @Autowired
  public CitatyController( CitatyService service) {
   this.citatyService = service;
  }

  @GetMapping("/")
  public ModelAndView nahodnyCitat() {
    ModelAndView modelAndView = new ModelAndView("citat");
    modelAndView.addObject("citat", citatyService.nahodnyCitat());
    return modelAndView;
  }

  @GetMapping("/{cislo}")
  public ModelAndView vybranyCitat(@PathVariable int cislo){
    ModelAndView vybranyCitat = new ModelAndView("citat");
    vybranyCitat.addObject("citat", citatyService.konkretniCitat(cislo));
    return vybranyCitat;
  }


}
