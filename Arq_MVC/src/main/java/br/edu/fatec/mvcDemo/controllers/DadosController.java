package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.LojaCarro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/carros")
public class DadosController {
    private static final List<LojaCarro>
            carros = new ArrayList<LojaCarro>();

    public DadosController() {
        carros.add(new LojaCarro("Camaro","Chevrolet",150000.00f));
        carros.add(new LojaCarro("Spyder","Porsche",2000000.00f));
        carros.add(new LojaCarro("Urus","Lamborghini",2500000.00f));
    }

    @GetMapping
    public List<LojaCarro> getCarro()
    {
        return carros;
    }
}
