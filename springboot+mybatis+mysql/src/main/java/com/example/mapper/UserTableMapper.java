package com.example.mapper;

import com.example.domain.UserTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    UserTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTable record);

    int updateByPrimaryKey(UserTable record);
}