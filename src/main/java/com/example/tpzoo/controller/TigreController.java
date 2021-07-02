package com.example.tpzoo.controller;

import com.example.tpzoo.entites.Tigre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("tigres")
public class TigreController {

    @GetMapping("tigres")
    public List<Tigre> getTigres(){

        Tigre tigre1 = new Tigre();
        tigre1.setNom("tigre1");
        tigre1.setCouleur("jaune");
        tigre1.setRace("Tigre de Siberie");
        tigre1.setType("Tigresse");
        tigre1.setAge(4);

        Tigre tigre2 = new Tigre();
        tigre2.setNom("tigre2");
        tigre2.setCouleur("Rayé noir");
        tigre2.setRace("Tigre de Malaisie");
        tigre2.setType("Tigre");
        tigre2.setAge(8);

        Tigre tigre3 = new Tigre();
        tigre3.setNom("tigre3");
        tigre3.setCouleur("Orange fonçée");
        tigre3.setRace("Tigre de Bali");
        tigre3.setType("Tigreau");
        tigre3.setAge(1);

        Tigre tigre4 = new Tigre();
        tigre4.setNom("tigre4");
        tigre4.setCouleur("clair");
        tigre4.setRace("Tigre d'Indochine");
        tigre4.setType("Tigresse");
        tigre4.setAge(5);

        List<Tigre> tigres = new ArrayList<Tigre>();
        tigres.add(tigre1);
        tigres.add(tigre2);
        tigres.add(tigre3);
        tigres.add(tigre4);

        return tigres;
    }
}
