package com.xm.springboot.domain;

import javax.persistence.*;

public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * erp账号
     */
    private String erp;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 组织机构编号
     */
    private String orgid;

    /**
     * 部门名称
     */
    private String depart;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取erp账号
     *
     * @return erp - erp账号
     */
    public String getErp() {
        return erp;
    }

    /**
     * 设置erp账号
     *
     * @param erp erp账号
     */
    public void setErp(String erp) {
        this.erp = erp;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取组织机构编号
     *
     * @return orgid - 组织机构编号
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * 设置组织机构编号
     *
     * @param orgid 组织机构编号
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    /**
     * 获取部门名称
     *
     * @return depart - 部门名称
     */
    public String getDepart() {
        return depart;
    }

    /**
     * 设置部门名称
     *
     * @param depart 部门名称
     */
    public void setDepart(String depart) {
        this.depart = depart;
    }
}