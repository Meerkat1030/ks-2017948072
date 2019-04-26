package ac.ks.web2.repository;

import ac.ks.web2.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkRepository extends JpaRepository<Work, Long> {

    Work findFirstByCompany(final String company);
}