package com.asher.vo;

public class PageInfo<T> {

    private int currentPage;
    private int pageRows;
    private int pageCount;
    private T keywords;
    private String sort;
    private int minPage;
    private int maxPage;
    
    public void init(){
        
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageRows() {
        return pageRows;
    }

    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public T getKeywords() {
        return keywords;
    }

    public void setKeywords(T keywords) {
        this.keywords = keywords;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getMinPage() {
        return minPage;
    }

    public void setMinPage(int minPage) {
        this.minPage = minPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public PageInfo(int currentPage, int pageRows, int pageCount, T keywords,
            String sort, int minPage, int maxPage) {
        super();
        this.currentPage = currentPage;
        this.pageRows = pageRows;
        this.pageCount = pageCount;
        this.keywords = keywords;
        this.sort = sort;
        this.minPage = minPage;
        this.maxPage = maxPage;
    }

    public PageInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + currentPage;
        result = prime * result
                + ((keywords == null) ? 0 : keywords.hashCode());
        result = prime * result + maxPage;
        result = prime * result + minPage;
        result = prime * result + pageCount;
        result = prime * result + pageRows;
        result = prime * result + ((sort == null) ? 0 : sort.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PageInfo other = (PageInfo) obj;
        if (currentPage != other.currentPage)
            return false;
        if (keywords == null) {
            if (other.keywords != null)
                return false;
        } else if (!keywords.equals(other.keywords))
            return false;
        if (maxPage != other.maxPage)
            return false;
        if (minPage != other.minPage)
            return false;
        if (pageCount != other.pageCount)
            return false;
        if (pageRows != other.pageRows)
            return false;
        if (sort == null) {
            if (other.sort != null)
                return false;
        } else if (!sort.equals(other.sort))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PageInfo [currentPage=" + currentPage + ", pageRows="
                + pageRows + ", pageCount=" + pageCount + ", keywords="
                + keywords + ", sort=" + sort + ", minPage=" + minPage
                + ", maxPage=" + maxPage + "]";
    }
    
}
