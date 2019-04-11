import com.qianfeng.Bean.TbStudent;
import com.qianfeng.Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class test {
    @Autowired
    private StudentService studentService;
    @Test
    public void tes(){
        List<TbStudent> students = studentService.selectAllStu();
        System.out.println(students.size());
    }
    @Test
    public void tes1(){
        for(int i=1;i<=30;i++){
            TbStudent student = new TbStudent(1,"陈"+i+"哲",i);
            studentService.insertStu(student);
        }
    }
}
