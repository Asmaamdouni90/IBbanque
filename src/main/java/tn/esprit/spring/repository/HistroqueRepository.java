package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Historique;

@Repository
public interface HistroqueRepository extends CrudRepository<Historique, Long>{

}