package Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import util.JdbcUtil;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception {
        long stsrt = System.currentTimeMillis();
//        读取配置文件
        Properties properties = new Properties();
        properties.load(DruidTest.class.getClassLoader().getResourceAsStream("druid.properties"));
//        创建连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//       获取连接池对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        long end = System.currentTimeMillis();
        System.out.println(end-stsrt);

    }
}
