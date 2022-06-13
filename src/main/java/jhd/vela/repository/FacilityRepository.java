package jhd.vela.repository;

import jhd.vela.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer> {

    @Transactional
    Optional<Facility> findFirstBy();
}
