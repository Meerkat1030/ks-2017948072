package ac.ks.web2.controller;

import ac.ks.web2.domain.Work;
import ac.ks.web2.repository.WorkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkController {
    private WorkRepository workRepository;

    public WorkController(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @GetMapping("/work")
    public List<String> work() {
        List<String> workList = new ArrayList<>();
        for (Work s : workRepository.findAll()) {
            workList.add(s.getCompany());
        }
        return workList;
    }
}
