package mybatis.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Data
@Accessors(chain = true)
public class Student {

    private String sId;

    private String sName;

    private LocalDateTime sBrithday;

    private String sSex;

}
