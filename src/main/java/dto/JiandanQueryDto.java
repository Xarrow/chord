package dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhang
 * @Time 2016/11/25.
 * @Des 煎蛋网查询dto
 */
public class JiandanQueryDto extends JiandanDto implements Serializable {

    private Integer page;

    private Integer rows;


    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}

