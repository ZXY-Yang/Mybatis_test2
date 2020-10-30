package com.qf.myBatis.test.mapper;

import com.qf.myBatis.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    List<User> selectUserByName(@Param("userName")User user) throws Exception;
}
