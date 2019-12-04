package 练习;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.Employee;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

public class X {
    public static void main(String[] args) throws Exception {
//          读取配置文件
        Properties properties = new Properties();
        properties.load(X.class.getClassLoader().getResourceAsStream("druid.properties"));
//        创建连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        获取连接池对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Employee> query = jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<>(Employee.class));
        for (Employee employee : query) {
            System.out.println(employee);
        }


    }
}
