package com.fnic.mybatis.dao;

import com.fnic.mybatis.model.TbUser;
import com.fnic.mybatis.model.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    long countByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int deleteByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int insert(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int insertSelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    TbUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbUser record);
}