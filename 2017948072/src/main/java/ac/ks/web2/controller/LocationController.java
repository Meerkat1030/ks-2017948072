package ac.ks.web2.controller;


import ac.ks.web2.domain.Location;
import ac.ks.web2.repository.LocationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class LocationController {
    private LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    @GetMapping("/location")
    public List<String> location(){
        List<String> locationList = new ArrayList<>();
        for(Location s : locationRepository.findAll()){
            locationList.add(s.getAddress());
        }
        return locationList;
    }
}
