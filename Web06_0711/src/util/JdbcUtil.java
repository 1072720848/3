package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class JdbcUtil {

    private static DataSource dataSource;
    static{
        try {
            Properties properties = new Properties();
            properties.load(JdbcUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
             dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getdatasource(){
        return dataSource;
    }
}