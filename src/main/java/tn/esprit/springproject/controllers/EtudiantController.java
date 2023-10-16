package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.EtudiantServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {
    public EtudiantServiceImp etudiantServiceImp;

    @PostMapping("/addEd")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantServiceImp.addEtudiant(e);
    }

    @PutMapping("/editEd")
    public Etudiant updateFoyer(@RequestBody Etudiant e){
        return etudiantServiceImp.updateEtudaint(e);
    }

    @GetMapping("/getEd")
    public List<Etudiant> findAllFoyer(){
        return etudiantServiceImp.getAllEtudiants();
    }

    @GetMapping("/getEd/{IdE}")
    public Etudiant findFoyerById(@PathVariable long IdE){
        return  etudiantServiceImp.getById(IdE);
    }

    @DeleteMapping("/delete/{IdE}")
    public void deleteFoyerById(@PathVariable long IdE){
        etudiantServiceImp.deleteEtudiant(IdE);
    }
}
