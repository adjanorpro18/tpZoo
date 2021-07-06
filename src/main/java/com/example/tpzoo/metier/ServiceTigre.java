package com.example.tpzoo.metier;

import com.example.tpzoo.entites.Tigre;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Iterator;
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

   public void deleteTigre(String nom){
        Iterator<Tigre> it = tigres.iterator();
        while(it.hasNext()){
            Tigre t = it.next();
            if(t.getNom().equals(nom)){
                tigres.remove(t);
            }
        }
   }

}
