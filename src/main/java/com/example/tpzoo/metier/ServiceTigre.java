package com.example.tpzoo.metier;

import com.example.tpzoo.entites.Tigre;
import com.example.tpzoo.repository.TigreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ServiceTigre {

    @Autowired
    TigreRepository tigreRepository;

    private List<Tigre> tigres = new ArrayList<Tigre>();

    public List<Tigre> getTigres() { // retourner la liste des tigres
       // return tigres;
        return tigreRepository.findAll();
    }

    public void addTigre(Tigre nouveauTigre){
        //tigres.add(nouveauTigre);
        tigreRepository.save(nouveauTigre);
    }

   public void deleteTigre(Long id){
        Iterator<Tigre> it = tigres.iterator();
        while(it.hasNext()){
            Tigre t = it.next();
            if(t.getId() == id){
                tigres.remove(t);
            }
        }
   }



}
