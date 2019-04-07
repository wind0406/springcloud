package com.cn.dao;

import springcloud.test.user.web.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(String suId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String suId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}