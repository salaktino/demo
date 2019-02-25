package org.bq.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Description;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonToken;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE", discriminatorType = DiscriminatorType.STRING, length = 2)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes({
    @Type(name="CC",value=CompteCourant.class),
    @Type(name="CE",value=CompteEpargne.class)
})
public abstract class Compte implements Serializable {
    @Id
    private String codeCompte;
    private double solde;
    @ManyToOne
    @JoinColumn(name = "CODE_CLI")
    private Client client;

    public Compte() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Compte(String codeCompte, double solde) {
	super();
	this.codeCompte = codeCompte;
	this.solde = solde;
    }

    public String getCodeCompte() {
	return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
	this.codeCompte = codeCompte;
    }

    public double getSolde() {
	return solde;
    }

    public void setSolde(double solde) {
	this.solde = solde;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

}
