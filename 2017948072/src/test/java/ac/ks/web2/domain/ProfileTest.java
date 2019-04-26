package ac.ks.web2.domain;

import ac.ks.web2.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileTest {
    @Autowired
    private ProfileRepository profileRepository;

    private Profile savedProfile;

    @Before
    public void init() {
        savedProfile = profileRepository.save(Profile.builder()
                .network("Twitter")
                .username("홍길동")
                .url("http://www.twitter.com/홍길동")
                .build());
    }
    @Test
    public void testFindIDProfile(){
        Profile foundProfile = profileRepository.findById(savedProfile.getIdx()).orElse(null);
        assertThat(foundProfile.getIdx()).isEqualTo(savedProfile.getIdx());
    }
    @Test
    public void testFindNetworkProfile(){
        Profile findNetworkProfile = profileRepository.findFirstByNetwork("Twitter");
        assertThat(findNetworkProfile.getNetwork()).isEqualTo("Twitter");
    }

}
