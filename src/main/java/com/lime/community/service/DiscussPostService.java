package com.lime.community.service;

import com.lime.community.model.entity.DiscussPost;

import java.util.List;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-21 13:07:53
 */
public interface DiscussPostService {

    /**
     * 查询讨论帖文集合，userId若为0则代表显示所有帖文。
     *
     * @param userId 帖文作者
     * @param offset 当前页码数应显示的帖文在数据库中的起始行
     * @param limit  每一页帖文数量
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询帖文总数
     *
     * @param userId 帖文作者id
     * @return 帖文总数
     */
    int selectDiscussPostRows(int userId);
}
