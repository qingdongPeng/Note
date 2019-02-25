package mybatis.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Create by peng.qd on 2019/2/25 0025.
 */
@Data
@Accessors(chain = true)
public class Result1 {

    private String sId;

    private String sName;

    private String sSex;

    private LocalDateTime sBrithday;

    private BigDecimal class01;

    private BigDecimal class02;
}
