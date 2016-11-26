package dto;

import java.util.Date;

/**
 * @Author zhang
 * @Time 2016/11/25.
 * @Des 煎蛋网查询dto
 *
 */
public class JiandanQueryDto extends JiandanDto{

    private Integer start;

    private Integer offset;


    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }



}

