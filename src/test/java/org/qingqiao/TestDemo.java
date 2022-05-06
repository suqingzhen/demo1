package org.qingqiao;

import org.qingqiao.bean.JdbcJunit;
import org.qingqiao.dao.Clazz;
import org.qingqiao.dao.StudentDemo;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        JdbcJunit jt = new JdbcJunit();
       // int i = jt.deleteStudent(5);
       // StudentDemo studentDemo1 = new StudentDemo(0, "苏庆真", "男", 60, new Clazz(2,null));
        //int i = jt.updateStudent(studentDemo1, 1);
        int i = jt.deleteStudent(1);
        if (i>0) {
            List<StudentDemo> studentDemos = jt.showALl();
            for (StudentDemo studentDemo : studentDemos) {
                System.out.println(studentDemo);
            }
        }


    }
}
