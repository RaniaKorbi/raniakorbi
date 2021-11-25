package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.model.Operation;

public interface OperationDao extends  JpaRepository<Operation,Integer>{

}
