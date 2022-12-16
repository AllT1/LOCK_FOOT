package footlock.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import footlock.app.exception.ResourceNotFoundException;
import footlock.app.model.Terrains;
import footlock.app.repository.TerrainRepo;

@RestController
@RequestMapping("/api/v1")
public class TerrainController {

	@Autowired
	private TerrainRepo terrainRepo;
	
	
	//Get All terrains
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/terrains")
	public List<Terrains> getAllTerrains(){
		return terrainRepo.findAll();
	}
	
	
	//Create terrains
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/terrains")
	public Terrains createTerrains(@RequestBody Terrains terrain) {
		return terrainRepo.save(terrain);
	}
	
	//get Terrain by id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/terrains/{id}")
	public ResponseEntity<Terrains> getTerrainById(@PathVariable long id) {
		Terrains terrains= terrainRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Terrain n'existe pas"));
		return ResponseEntity.ok(terrains);
	}
	
	//Modifier terrain
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/terrains/{id}")
	public ResponseEntity<Terrains> updateTerrainById(@PathVariable long id, Terrains terrainDetail) {
		Terrains terrain= terrainRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Terrain n'existe pas"));
		
		terrain.setAdresse(terrainDetail.getAdresse());
		terrain.setDescription(terrainDetail.getDescription());
		terrain.setEtoiles(terrainDetail.getEtoiles());
		terrain.setLatitude(terrainDetail.getLatitude());
		terrain.setLongitude(terrainDetail.getLongitude());
		terrain.setNbrJoueur(terrainDetail.getNbrJoueur());
		terrain.setNom(terrainDetail.getNom());
		terrain.setPhoto(terrainDetail.getPhoto());
		terrain.setPrix(terrainDetail.getPrix());
		terrain.setReview(terrainDetail.getReview());
		terrain.setTel(terrainDetail.getTel());
		
		Terrains updatedterrain = terrainRepo.save(terrain);
	
		return ResponseEntity.ok(updatedterrain);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/terrains/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteTerrain(@PathVariable long id) {
		Terrains terrains= terrainRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Terrain n'existe pas"));
		terrainRepo.delete(terrains);
		Map<String, Boolean> response= new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
