package org.bq.metier;

import java.util.List;

import org.bq.entities.Compte;

public interface CompteMetier {
    
    public Compte saveCompte(Compte c);
    public Compte getCompte(String code);
    public List<Compte> listCompte();
    public List<Compte> listCompteByCodeClt(Long code);

}
