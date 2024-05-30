package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.LojaCarro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carros")
public class CarroController {
 private static final List<LojaCarro>
         carros = new ArrayList<LojaCarro>();

    public CarroController() {
        carros.add(new LojaCarro("Camaro","Chevrolet",150000.00f));
        carros.add(new LojaCarro("Spyder","Porsche",2000000.00f));
        carros.add(new LojaCarro("Urus","Lamborghini",2500000.00f));
    }

    @GetMapping
    public String getCarro(Model model)
    {
        model.addAttribute("carros", carros);
        return "carros";
    }
}
