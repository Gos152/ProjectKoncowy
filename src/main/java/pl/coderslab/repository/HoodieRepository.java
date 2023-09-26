package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Hoodie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoodieRepository extends JpaRepository<Hoodie, Long> {

    List<Hoodie> findBySize(String size);

    List<Hoodie> findByColour(String colour);

    List<Hoodie> findByGender(String gender);

    List<Hoodie>findByTitle(String title);
}
