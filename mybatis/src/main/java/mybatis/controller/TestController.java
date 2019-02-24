package mybatis.controller;

import mybatis.bean.Student;
import mybatis.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by peng.qd on 2019/2/22 0022.
 */
@RestController
public class TestController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping(value = "/")
    public String aa() {
        return "test";
    }

    @GetMapping(value = "/test")
    public String dd() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping(value = "getAllStudent")
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }
}
