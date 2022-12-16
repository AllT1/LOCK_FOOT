package footlock.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import footlock.app.model.Terrains;

@Repository
public interface TerrainRepo extends JpaRepository<Terrains, Long> {
	

}
