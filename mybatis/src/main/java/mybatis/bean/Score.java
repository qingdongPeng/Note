package mybatis.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by peng.qd on 2019/2/24 0024.
 */
@Data
@Accessors(chain = true)
public class Score {

    private String sId;

    //course id
    private String cId;

    private Double score;

}
