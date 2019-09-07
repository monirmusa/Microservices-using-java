package bd.edu.seu.gradeentries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GradeEntries {
    @Id
    private long studentId;
    private String StudentName;
    private String Department;
    private String CourseName;
    private String CourseCGPA;
    private String TotalCGPA;
}
