package demo.dao.user;


import demo.entity.Smbms_provider;

import java.util.List;

public interface Smbms_providerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Smbms_provider record);

    Smbms_provider selectByPrimaryKey(Long id);

    List<Smbms_provider> selectAll();

    int updateByPrimaryKey(Smbms_provider record);


    /** 根据用户名称查询用户列表
     *  //TODO :用户表模糊查询
     */

    List<Smbms_provider>getUserListByUserName(String userName);
}