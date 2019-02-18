/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

package cn.tang.pojo;

import java.util.Date;

/**
 * BBS_DETAIL
 * 
 * @author SiWen_Tang
 * @version 1.0.0 2019-02-14
 */
public class BbsDetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3601345933658873758L;

    /** 编号 */
    private Integer id;

    /** 分类编号 */
    private Integer sortId;

    /** 标题 */
    private String titile;

    /** 详细内容 */
    private String detail;

    /** 作者 */
    private String author;

    /** 创建时间 */
    private Date createDate;

    /** 回复次数 */
    private Integer replyCount;

//    //分类
    private BbsSort bbsSort;

    public BbsSort getBbsSort() {
        return bbsSort;
    }

    public void setBbsSort(BbsSort bbsSort) {
        this.bbsSort = bbsSort;
    }

    /**
     * 获取编号
     * 
     * @return 编号
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置编号
     * 
     * @param id
     *          编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类编号
     * 
     * @return 分类编号
     */
    public Integer getSortId() {
        return this.sortId;
    }

    /**
     * 设置分类编号
     * 
     * @param sortId
     *          分类编号
     */
    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    /**
     * 获取标题
     * 
     * @return 标题
     */
    public String getTitile() {
        return this.titile;
    }

    /**
     * 设置标题
     * 
     * @param titile
     *          标题
     */
    public void setTitile(String titile) {
        this.titile = titile;
    }

    /**
     * 获取详细内容
     * 
     * @return 详细内容
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * 设置详细内容
     * 
     * @param detail
     *          详细内容
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取作者
     * 
     * @return 作者
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * 设置作者
     * 
     * @param author
     *          作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置创建时间
     * 
     * @param createDate
     *          创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取回复次数
     * 
     * @return 回复次数
     */
    public Integer getReplyCount() {
        return this.replyCount;
    }

    /**
     * 设置回复次数
     * 
     * @param replyCount
     *          回复次数
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }


}