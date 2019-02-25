package mybatis.controller;

import mybatis.dao.StudentDao;
import mybatis.pojo.Result1;
import mybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by peng.qd on 2019/2/25 0025.
 */
@RestController
public class StudnetController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private StudentDao studentDao;

    /**
     * 查询" 01 "课程比" 02 "课程成绩高的学生的信息及课程分数
     */
    @GetMapping(value = "selectByCoruseMax")
    public List<Result1> selectByCoruseMax() {
        return studentDao.selectByCoruseMax();
    }

}
