package jhd.vela.controller;

import jhd.vela.model.Facility;
import jhd.vela.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class FacilityController {

    private final FacilityService facilityService;

    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @GetMapping("/facility/{id}")
    public String showFacilityById(Model model, @PathVariable Integer id){
        Optional<Facility> facility;
        if(id == null){
            facility  = facilityService.findFirst();
        }else{
            facility = facilityService.findById(id);
        }
        if(facility.isEmpty()){

        }else{
            model.addAttribute("facility", facility.get());
        }
        return "facility";
    }

    @GetMapping("/facility")
    public String showFacility(Model model){
        return showFacilityById(model, null);
    }
}
