package org.bq.metier;

import java.util.List;

import org.bq.entities.Client;

public interface ClientMetier {
public Client saveClient(Client c);
public List<Client> listClient();
public Client updateClient(Client c);
}
