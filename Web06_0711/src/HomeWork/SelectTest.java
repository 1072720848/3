package HomeWork;

import domain.EmpXX;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JdbcUtil;

import java.util.List;
import java.util.Queue;

public class SelectTest {
    @Test
    public void testQuery(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        List<EmpXX> query = jdbcTemplate.query("select * from emp", new BeanPropertyRowMapper<>(EmpXX.class));
        for (EmpXX empXX : query) {
            System.out.println(empXX);
        }
    }
    @Test
    public void testQueryForObject(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        Integer integer = jdbcTemplate.queryForObject("select count(emp_name) from emp", Integer.class);
        System.out.println(integer);
    }
}
