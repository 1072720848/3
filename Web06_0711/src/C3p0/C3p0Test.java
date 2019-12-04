package C3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;
//c3p0自动读取配置文件
public class C3p0Test {
    public static void main(String[] args) throws SQLException {
        long l = System.currentTimeMillis();
//        创建连接池
        ComboPooledDataSource cpds = new ComboPooledDataSource();
//        从连接池中获取连接对象
        Connection connection = cpds.getConnection();
        System.out.println(connection);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
