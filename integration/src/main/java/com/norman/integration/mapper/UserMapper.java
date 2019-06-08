package com.norman.integration.mapper;

import com.norman.integration.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();

}
