package med.voll.api.medic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicRepository extends JpaRepository<Medic, String> {
    Page<Medic> findAllByEnabledTrue(Pageable pagination);
}
