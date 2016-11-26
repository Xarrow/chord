package dto;

import model.Jiandan;

import java.util.List;

/**
 * @Author zhang
 * @Time 2016/11/26.
 */
public class JiandanResponseDto  {

    private List<JiandanDto> jiandanList;
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
