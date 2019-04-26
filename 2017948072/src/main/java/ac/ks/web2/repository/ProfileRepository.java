package ac.ks.web2.repository;

import ac.ks.web2.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findFirstByNetwork(final String network);

}