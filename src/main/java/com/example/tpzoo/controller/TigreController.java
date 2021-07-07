package com.example.tpzoo.controller;

import com.example.tpzoo.entites.Tigre;
import com.example.tpzoo.metier.ServiceTigre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("tigres")
public class TigreController {

    @Autowired
    ServiceTigre serviceTigre;


    @GetMapping("tigres")
    public List<Tigre> recupererTigres(){

        return serviceTigre.getTigres();
    }

    @PostMapping("tigres")
    public void addTigre(@RequestBody Tigre nouveauTigre){

        serviceTigre.addTigre(nouveauTigre);
        System.out.println(nouveauTigre);
    }


    @DeleteMapping("/tigres/{id}")
    public int deleteTigre(@PathVariable("id") Long id){
        serviceTigre.deleteTigre(id);
        return 1;

    }

}
