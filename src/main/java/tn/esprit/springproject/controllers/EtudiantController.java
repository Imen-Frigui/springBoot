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

    @PutMapping("/editEd/{id}")
    public Etudiant updateEtudiant(@RequestBody Etudiant e, @PathVariable long id){
        Etudiant etudiant = etudiantServiceImp.getById(id);
        System.out.println(etudiant.toString());
        etudiant.setCin(etudiant.getCin());
        etudiant.setNomEt(etudiant.getNomEt());
        etudiant.setPrenomET(etudiant.getPrenomET());
        etudiant.setEcole(etudiant.getEcole());
        etudiant.setDateNaissance(etudiant.getDateNaissance());
        etudiant.setReservationList(etudiant.getReservationList());

        return etudiant;
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
