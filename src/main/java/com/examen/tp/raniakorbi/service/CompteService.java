package springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import springboot.dao.CompteDao;
import springboot.model.Compte;

@Service
@Transactional
public class CompteService {
	private final CompteDao compteDao;

	public CompteService(CompteDao compteDao) {
		super();
		this.compteDao = compteDao;
	}
	
public Optional<Compte> FindCompteById(int id){
	return compteDao.findById(id);
}
public List<Compte> FindAllComptes(){
	return compteDao.findAll();
}
public Compte addCompte(Compte compte) {
	return compteDao.save(compte);
}
public Compte updateCeompte(Compte compte) {
	return compteDao.save(compte);
}
public void deleteCompte (int id) {
	compteDao.deleteById(id);
}

public Compte findById(int id) {
	return  compteDao.findById(id).orElseThrow(()->new CompteNotFoundException("Compte not found!"));
}
}
