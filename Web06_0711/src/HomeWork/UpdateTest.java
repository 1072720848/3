package HomeWork;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JdbcUtil;

public class UpdateTest {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
    @Test
    public void testAdd(){
        jdbcTemplate.update("INSERT INTO emp(emp_name, dept_id)VALUES (?,?)","哈哈",2);
    }
    @Test
    public void testDelete(){
        jdbcTemplate.update("DELETE FROM emp WHERE emp_name=?","哈哈");
    }
    @Test
    public void testUpdate(){
        jdbcTemplate.update("UPDATE emp SET dept_id=? WHERE emp_name=?",1,"哈哈");
    }

}
