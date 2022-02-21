package com.lime.community.service.impl;

import com.lime.community.entity.DiscussPost;
import com.lime.community.repository.DiscussPostMapper;
import com.lime.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-21 13:08:59
 */
@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    private DiscussPostMapper postMapper;

    @Autowired
    public DiscussPostServiceImpl(DiscussPostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Override
    public List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit) {
        return postMapper.selectDiscussPosts(userId, offset, limit);
    }

    @Override
    public int selectDiscussPostRows(int userId) {
        return postMapper.selectDiscussPostRows(userId);
    }
}
