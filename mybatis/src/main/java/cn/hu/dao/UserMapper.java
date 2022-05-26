package cn.hu.dao;

import cn.hu.entity.User;

/**
 * @author hucc
 * 2022/4/30 16:34
 */
public interface UserMapper {
    User selectUser(int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(User user);

}
