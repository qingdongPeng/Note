package mybatis.dao;

import mybatis.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Repository
public interface StudentDao {

    List<Student> getAllStudent();

}
