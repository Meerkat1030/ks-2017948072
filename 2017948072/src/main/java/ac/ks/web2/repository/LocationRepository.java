package ac.ks.web2.repository;


import ac.ks.web2.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findFirstByAddress(final String address);

}