package mybatis.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Data
@Accessors(chain = true)
public class Score {

    private String sId;

    //course id
    private String cId;

    private BigDecimal score;

}
