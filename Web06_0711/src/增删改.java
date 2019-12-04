import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JdbcUtil;

public class 增删改 {

    @Test
    public void testAdd(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        jdbcTemplate.update("INSERT INTO student(name,age) VALUES(?,?)  ","朗逸",20);

    }
    @Test
    public void testUpdate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        jdbcTemplate.update("UPDATE student SET age=?",33);
    }
    @Test
    public void testDelete(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        jdbcTemplate.update("DELETE FROM student WHERE age=?",33);
    }
}
