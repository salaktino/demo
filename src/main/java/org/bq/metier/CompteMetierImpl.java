package org.bq.metier;

import java.util.List;

import org.bq.dao.CompteRepository;
import org.bq.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteMetierImpl implements CompteMetier {

    @Autowired
    CompteRepository compteRepository;
    
    @Override
    public Compte saveCompte(Compte c) {
	// TODO Auto-generated method stub
	return compteRepository.save(c);
    }

    @Override
    public Compte getCompte(String code) {
	return compteRepository.findById(code).orElse(null);
    }

    @Override
    public List<Compte> listCompte() {
	return compteRepository.findAll();
    }

    @Override
    public List<Compte> listCompteByCodeClt(Long code) {
	return compteRepository.findByClt(code);
    }

}
