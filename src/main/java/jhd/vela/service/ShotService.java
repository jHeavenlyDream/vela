package jhd.vela.service;

import jhd.vela.model.Shot;
import jhd.vela.repository.ShotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ShotService {

    private final ShotRepository shotRepository;

    public ShotService(ShotRepository shotRepository) {
        this.shotRepository = shotRepository;
    }

    public Page<Shot> getPage(int pageNumber){
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("number"));

        return shotRepository.findAll(pageable);
    }
}
