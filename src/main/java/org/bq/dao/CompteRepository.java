package org.bq.dao;
import java.util.List;


import org.bq.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CompteRepository extends  JpaRepository<Compte, String>{
    
    @Query("SELECT c FROM Compte c WHERE c.client.codeClient = :codeClient")
    public List<Compte> findByClt(@Param("codeClient") Long codeClient);
}
