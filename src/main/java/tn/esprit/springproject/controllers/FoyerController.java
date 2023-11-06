package tn.esprit.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.FoyerServiceImp;

import java.util.List;

@RestController
public class FoyerController {
    @Autowired
    private FoyerServiceImp foyerServiceImp;

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f){
        return foyerServiceImp.addFoyer(f);
    }

    @PutMapping("/edit")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return foyerServiceImp.updateFoyer(f);
    }

    @GetMapping("/get")
    public List<Foyer> findAllFoyer(){
        return foyerServiceImp.findAllFoyer();
    }

    @GetMapping("/get/{IdF}")
    public Foyer findFoyerById(@PathVariable long IdF){
        return  foyerServiceImp.findById(IdF);
    }

    @DeleteMapping("/delete/{IdF}")
    public void deleteFoyerById(@PathVariable long IdF){
        foyerServiceImp.deleteFoyer(IdF);
    }

    @GetMapping("/getbynom/{nomf}")
    public Foyer getByNom(@PathVariable String nomf){
        return foyerServiceImp.getByNomFoyer(nomf);
    }

}
