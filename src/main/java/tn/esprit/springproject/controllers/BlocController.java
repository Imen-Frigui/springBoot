package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chamber;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.services.BlocSericeImp;
import tn.esprit.springproject.services.EtudiantServiceImp;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class BlocController {
    public BlocSericeImp blocSericeImp;

    @GetMapping("/getBlocByTypeC/{type}")
    public List<Bloc> findBlocByTypeC(@PathVariable TypeChambre type){
        return blocSericeImp.findByChamberListTypeC(type);
    }

}
