package com.example.tpzoo.metier;

import com.example.tpzoo.entites.Tigre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTigre {

    private List<Tigre> tigres = new ArrayList<Tigre>();

    public List<Tigre> getTigres() {
        return tigres;
    }

    public void addTigre(Tigre nouveauTigre){
        tigres.add(nouveauTigre);
    }

}
