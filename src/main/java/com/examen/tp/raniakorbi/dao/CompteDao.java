package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.model.Compte;

public interface CompteDao extends JpaRepository<Compte,Integer> {

}
