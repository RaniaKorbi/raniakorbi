package springboot.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import springboot.model.Compte;
import springboot.service.CompteService;
@RestController
@RequestMapping("/compte")
public class CompteController {
	private final CompteService compteService;

	public CompteController(CompteService compteService) {
		super();
		this.compteService = compteService;
	}
	

	@GetMapping("/all")
	public ResponseEntity<List<Compte>> getAllComptes(){
	 List<Compte> comptes = compteService.FindAllComptes();
	return new ResponseEntity<List<Compte>>(comptes, HttpStatus.OK);
	 
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Compte>> getCompteById(@PathVariable("id")int id){
		 Optional<Compte> compte = compteService.FindCompteById(id);
		return new ResponseEntity<Optional<Compte>>(compte, HttpStatus.OK);
		 
	}
	@PostMapping("/add")
	public ResponseEntity<Compte> ajouterCompte(@RequestBody Compte compte){
		 Compte newCompte = compteService.addCompte(compte);
		return new ResponseEntity<Compte>(newCompte, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Compte> updateCompte(@RequestBody Compte compte){
		 Compte updateCompte = compteService.addCompte(compte);
		return new ResponseEntity<Compte>(updateCompte, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Compte> deleteCompte(@PathVariable("id")int id){
		compteService.deleteCompte(id);
		return new ResponseEntity<>( HttpStatus.OK);
	}
}
