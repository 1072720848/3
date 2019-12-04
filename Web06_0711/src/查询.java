import domain.Student;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JdbcUtil;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class 查询 {
//    使用queryForMap
      @Test
    public void testQueueuerymap(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        Map<String, Object> map = jdbcTemplate.queryForMap("select * from student where name=?", "朗逸");
        System.out.println(map);
    }
//  使用queryForList
    @Test
    public void testQueueueryList(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM student ");
        for (Map<String, Object> map : maps) {
            System.out.println(map);
            System.out.println(map.get("id")+"\t"+map.get("name"));
        }
    }
//    使用query查询  必须有实体类
    @Test
    public void testQueueuery(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
        List<Student> query = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>(Student.class));
        for (Student student1 : query) {
            System.out.println(student1.getId());
        }
    }

//    使用queryForObject查询 查询结果有且仅有一条
    @Test
    public void testQueryObject(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtil.getdatasource());
//        把查询到的结果封装成javabean对象
        Student student = jdbcTemplate.queryForObject("select * from student", new BeanPropertyRowMapper<>(Student.class));
        System.out.println(student);
//      把查询到的结果封装成数字对象
        Integer integer = jdbcTemplate.queryForObject("select count(id) from student ", Integer.class);
        System.out.println(integer);
    }
}
