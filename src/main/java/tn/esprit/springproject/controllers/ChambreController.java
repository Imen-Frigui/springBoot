package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Chamber;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.ChambreServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
@Tag(name = "chambre API")
public class ChambreController {
    public ChambreServiceImp chambreServiceImp;

    @PostMapping("/add")
    public Chamber addChamber(@RequestBody Chamber c){
        return chambreServiceImp.addChamber(c);
    }
    @PutMapping("/edit")
    public Chamber updateChamber(@RequestBody Chamber c){
        return chambreServiceImp.updateChamber(c);
    }
    @GetMapping("/get")
    public List<Chamber> findAllChamber(){
        return chambreServiceImp.getAllChamber();
    }
    @GetMapping("/get/{IdC}")
    public Chamber findChamberById(@PathVariable long IdC){
        return  chambreServiceImp.getChamberById(IdC);
    }
    @DeleteMapping("/delete/{IdC}")
    public void deleteChamberById(@PathVariable long IdC){ chambreServiceImp.deleteChamber(IdC); }


}
