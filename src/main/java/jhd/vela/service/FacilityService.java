package jhd.vela.service;

import jhd.vela.model.Facility;
import jhd.vela.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
