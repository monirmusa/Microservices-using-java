package db.edu.seu.humanresource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class HumanResource {
    @Id
    private String initial;
    private String name;
    private String password;
}
