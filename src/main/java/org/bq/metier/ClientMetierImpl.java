package org.bq.metier;

import java.util.List;

import org.bq.dao.ClientRepository;
import org.bq.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientMetierImpl implements ClientMetier{
	@Autowired
	private ClientRepository clientRepository;
	@Override
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		return clientRepository.findAll();
	}

	@Override
	public Client updateClient(Client c) {
	    Client cltToUpdate = clientRepository.getOne(c.getCodeClient());
	    cltToUpdate.setNomClient(c.getNomClient());
	     return clientRepository.save(cltToUpdate);
	    
	}

}
