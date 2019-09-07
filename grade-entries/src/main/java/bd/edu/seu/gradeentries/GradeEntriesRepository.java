package bd.edu.seu.gradeentries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeEntriesRepository extends CrudRepository<GradeEntries,Long> {
    List<GradeEntries> findAllByDepartment(String department);

}
