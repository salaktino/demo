package org.bq.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
    }

    public CompteEpargne(String codeCompe, double solde, double taux) {
	super(codeCompe, solde);
	this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

}
