package mybatis.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Data
@Accessors(chain = true)
public class Teacher {

    private String tId;

    private String tName;

}
