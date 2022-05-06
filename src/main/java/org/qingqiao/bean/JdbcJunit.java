package org.qingqiao.bean;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.qingqiao.dao.Clazz;
import org.qingqiao.dao.StudentDemo;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.Properties;

public class JdbcJunit {
    private static Connection  conn=null;

    static {
        FileInputStream fs = null;
        Properties ps;
        try {
            fs = new FileInputStream("src\\resource\\db.properties");
            ps = new Properties();
            ps.load(fs);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(ps);
            conn = dataSource.getConnection();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public List<StudentDemo> showALl() throws SQLException {
        ArrayList<StudentDemo> sl = new ArrayList<>();
        PreparedStatement ps= conn.prepareStatement("select s.*,c.cname from student1 s,clazz c where s.cid=c.id; ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            StudentDemo studentDemo = new StudentDemo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),new Clazz(rs.getInt(5),rs.getString(6)));
           sl.add(studentDemo);
        }

        return sl;
    }
    public int insertStudent(StudentDemo studentDemo) throws SQLException {
        int i=0;
        PreparedStatement ps= conn.prepareStatement("insert into student1 values(0,?,?,?,?);");
        ps.setString(1,studentDemo.getName());
        ps.setString(2,studentDemo.getSex());
        ps.setInt(3,studentDemo.getAge());
        ps.setInt(4,studentDemo.getClazz().getId());
         i = ps.executeUpdate();
        return i;
    }
    public int updateStudent(StudentDemo studentDemo,int id) throws SQLException {
        int i=0;
                PreparedStatement ps= conn.prepareStatement("update student1 set name=?,sex=?,age=?,cid=? where id=?; ");
        ps.setString(1,studentDemo.getName());
        ps.setString(2,studentDemo.getSex());
        ps.setInt(3,studentDemo.getAge());
        ps.setInt(4,studentDemo.getClazz().getId());
        ps.setInt(5,id);
        i = ps.executeUpdate();
        return i;
    }
    public int deleteStudent(int id) throws SQLException {
        int i=0;
        PreparedStatement ps= conn.prepareStatement("delete from student1 where id=?");
        ps.setInt(1,id);
        i = ps.executeUpdate();
        return i;
    }

}
