package com.niit.vhrend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * renshixinxitongji
 * @author 
 */
@Entity
@Data
public class Renshixinxitongji implements Serializable {
    /**
     * 员工编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */

    @JsonFormat(pattern = "yyyy-MM-dd hh:hh", timezone = "Asia/Shanghai")
    private Date birthday;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 民族
     */
    private String nation;

    /**
     * 籍贯
     */
    private String nativeplace;

    /**
     * 政治面貌
     */
    private String politicid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门
     */
    private String departmentid;

    /**
     * 职称ID
     */
    private String joblevelid;

    /**
     * 职位ID
     */
    private String posid;

    /**
     * 工号
     */
    private String workid;

    private Integer money;

    private static final long serialVersionUID = 1L;
}