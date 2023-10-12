package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {
  private final List<Lekce> seznamLekci = List.of(
          new Lekce("Zěměpis", "19.září 2023","18:00","Praha"),
          new Lekce("Čeština", "20.září 2023","19:00","Brno")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/lekce/index");
    modelAndView.addObject("lekce", seznamLekci);
    return modelAndView;
  }
}
