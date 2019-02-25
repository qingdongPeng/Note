package mybatis.dao;

import mybatis.bean.Student;
import mybatis.pojo.Result1;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Repository
public interface StudentDao {

    List<Student> getAllStudent();

    default List<Result1> selectByCoruseMax() {
        return _selectByCoruseMax().entrySet().stream().map(
                a -> {
                    Result1 result = new Result1();
                    result.setSId((String) a.getValue().get("sId"))
                            .setSName((String) a.getValue().get("sName"))
                            .setSBrithday(LocalDateTime.parse(a.getValue().get("sBrithday").toString().substring(0, 19),
                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                            .setClass01((BigDecimal) a.getValue().get("class01"))
                            .setClass02((BigDecimal) a.getValue().get("class02"))
                            .setSSex((String) a.getValue().get("sSex"));
                    return result;
                }
        ).collect(Collectors.toList());
    }

    @MapKey("sId")
    HashMap<String, Map<String, Object>> _selectByCoruseMax();
}
