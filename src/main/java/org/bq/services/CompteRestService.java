package org.bq.services;

import java.util.List;

import org.bq.entities.Client;
import org.bq.entities.Compte;
import org.bq.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CompteRestService {
    @Autowired
    private CompteMetier compteMetier;

    @RequestMapping(value = "/comptes", method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody Compte c) {
	return compteMetier.saveCompte(c);
    }



    @RequestMapping(value="/comptes",method=RequestMethod.GET)
    public List<Compte> listCompte() {
    	return compteMetier.listCompte();
    }
    
    @RequestMapping(value = "/comptes/{code}", method = RequestMethod.GET)
    public List<Compte> getCompteByClt(@PathVariable Long code) {
	return compteMetier.listCompteByCodeClt(code);
    }
}
