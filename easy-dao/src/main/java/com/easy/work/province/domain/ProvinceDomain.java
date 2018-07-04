package com.easy.work.province.domain;

import com.easy.work.province.dto.ProvinceDto;

import java.util.Date;

public class ProvinceDomain extends ProvinceDto{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.version
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.code
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.create_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.name
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.op_id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private String opId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.update_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.id
     *
     * @return the value of province.id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.id
     *
     * @param id the value for province.id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.version
     *
     * @return the value of province.version
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.version
     *
     * @param version the value for province.version
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.code
     *
     * @return the value of province.code
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.code
     *
     * @param code the value for province.code
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.create_time
     *
     * @return the value of province.create_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.create_time
     *
     * @param createTime the value for province.create_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.name
     *
     * @return the value of province.name
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.name
     *
     * @param name the value for province.name
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.op_id
     *
     * @return the value of province.op_id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public String getOpId() {
        return opId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.op_id
     *
     * @param opId the value for province.op_id
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setOpId(String opId) {
        this.opId = opId == null ? null : opId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.update_time
     *
     * @return the value of province.update_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.update_time
     *
     * @param updateTime the value for province.update_time
     *
     * @mbg.generated Fri Jun 15 09:13:25 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}