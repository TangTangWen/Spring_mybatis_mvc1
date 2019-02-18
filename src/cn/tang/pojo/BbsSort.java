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

import java.util.List;

/**
 * BBS_SORT
 * 
 * @author SiWen_Tang
 * @version 1.0.0 2019-02-14
 */
public class BbsSort implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6279986632655206226L;

    /** 分类编号 */
    private Integer id;

    /** 分类名称 */
    private String name;

    private List<BbsDetail> details;

    public List<BbsDetail> getDetails() {
        return details;
    }

    public void setDetails(List<BbsDetail> details) {
        this.details = details;
    }

    /**
     * 获取分类编号
     * 
     * @return 分类编号
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置分类编号
     * 
     * @param id
     *          分类编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     * 
     * @return 分类名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置分类名称
     * 
     * @param name
     *          分类名称
     */
    public void setName(String name) {
        this.name = name;
    }
}