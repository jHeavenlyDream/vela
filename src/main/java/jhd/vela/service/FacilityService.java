package jhd.vela.service;

import jhd.vela.model.Facility;
import jhd.vela.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService {

    private final FacilityRepository facilityRepository;

    public FacilityService(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    public Optional<Facility> findById(Integer id){
        return facilityRepository.findById(id);
    }

    public Optional<Facility> findFirst(){
        return facilityRepository.findFirstBy();
    }

    public List<Facility> findAll(){
        return facilityRepository.findAll();
    }

    public void save(Facility facility) {
        facilityRepository.save(facility);
    }

    public void deleteById(Integer id) {
        facilityRepository.deleteById(id);
    }
}
