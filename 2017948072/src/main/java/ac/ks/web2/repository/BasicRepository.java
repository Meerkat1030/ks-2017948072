package ac.ks.web2.repository;

import ac.ks.web2.domain.Basic;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BasicRepository extends JpaRepository<Basic, Long>{
    Basic findFirstByName(final String name);

}



