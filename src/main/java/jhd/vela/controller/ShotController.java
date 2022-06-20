package jhd.vela.controller;

import jhd.vela.model.Shot;
import jhd.vela.service.ShotService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShotController {

    private final ShotService shotService;

    public ShotController(ShotService shotService) {
        this.shotService = shotService;
    }

    @RequestMapping("/shots")
    public String shorPageShots(Model model){
        return showPage(model, 1);
    }

    @RequestMapping("/shots/page/{page_number}")
    public String showPage(Model model, @PathVariable(name = "page_number") int pageNumber){
        Page<Shot> page = shotService.getPage(pageNumber);
        List<Shot> shots = page.getContent();

        model.addAttribute("shots", shots);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("curentPage", pageNumber);

        return "shots";
    }


}
