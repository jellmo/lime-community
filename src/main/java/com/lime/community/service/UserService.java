package com.lime.community.service;

import com.lime.community.entity.User;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-21 13:12:51
 */
public interface UserService {

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户详细信息
     */
    User selectById(int id);
}
