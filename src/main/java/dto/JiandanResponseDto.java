package dto;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/26.
 */
public class JiandanResponseDto implements Serializable {

    private List<JiandanDto> jiandanList;

    private Integer page;

    private List<Object> rows;


    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 开始页
     */
    private Integer start;

    /**
     * 每页条目
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer pages;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }

    public List<JiandanDto> getJiandanList() {
        return jiandanList;
    }

    public void setJiandanList(List<JiandanDto> jiandanList) {
        this.jiandanList = jiandanList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
