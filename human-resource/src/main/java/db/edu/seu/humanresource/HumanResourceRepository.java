package db.edu.seu.humanresource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanResourceRepository extends CrudRepository<HumanResource,String> {
   List<HumanResource> findAllByName(String name);
   // List<Student> findAllByName(String name);
   List<HumanResource>findByInitial(String initial);
}
