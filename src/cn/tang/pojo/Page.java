package cn.tang.pojo;


import java.util.List;

public class Page {
    //每页显示数量
    private int pageSize;
    //当前第几页
    private int pageNumber;
    //当前页显示的数据
    private List<?> list;
    //总页数
    private Long total;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                ", list=" + list +
                ", total=" + total +
                '}';
    }

    public Page(int pageSize, int pageNumber, List<?> list, Long total) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.list = list;
        this.total = total;
    }

    public Page() {
    }
}
