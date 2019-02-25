package org.bq.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant() {
	super();
	// TODO Auto-generated constructor stub
    }

    public CompteCourant(String codeCompe, double solde, double decouvert) {
	super(codeCompe, solde);
	this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
    

}
