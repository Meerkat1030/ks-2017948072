package ac.ks.web2.controller;

import ac.ks.web2.domain.Profile;
import ac.ks.web2.repository.ProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {
    private ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    @GetMapping("/profile")
    public List<String> profile(){
        List<String> profileList = new ArrayList<>();
        for(Profile s : profileRepository.findAll()){
            profileList.add(s.getNetwork());
        }
        return profileList;
    }
}
