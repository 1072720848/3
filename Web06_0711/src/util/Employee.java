package util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer emp_id;
    private String emp_name;
    private Integer dept_id;
    private Integer emp_wage;
}
