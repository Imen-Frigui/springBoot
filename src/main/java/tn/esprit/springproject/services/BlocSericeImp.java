package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.TypeChambre;
import tn.esprit.springproject.repositories.BolcRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class BlocSericeImp implements IBloc {
    @Autowired
    public BolcRepository bolcRepository;
    @Override
    public List<Bloc> findByChamberListTypeC(TypeChambre type) {
        return bolcRepository.findByChamberListTypeC(type);
    }
}
