package jhd.vela.controller.admin;

import jhd.vela.model.Facility;
import jhd.vela.service.FacilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/admin/facilities")
public class AdminFacilityController {

    private final FacilityService facilityService;

    public AdminFacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @GetMapping
    public String listFacilities(Model model) {
        List<Facility> facilities = facilityService.findAll();
        model.addAttribute("facilities", facilities);
        return "admin/facilities";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("facility", new Facility());
        return "admin/facility-edit";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute("facility") Facility facility) {
        facilityService.save(facility);
        return "redirect:/admin/facilities";
    }

    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("facility", facilityService.findById(id).get());
        return "admin/facility-edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        facilityService.deleteById(id);
        return "redirect:/admin/facilities";
    }
}
