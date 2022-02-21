package com.lime.community.mapperTest;

import com.lime.community.entity.DiscussPost;
import com.lime.community.repository.DiscussPostMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * <p></p>
 *
 * @author mohe
 * @date 2022-02-21 12:54:20
 */
@SpringBootTest
public class DiscussPostMapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelect() {
//        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
//        for (DiscussPost post : list) {
//            System.out.println(post);
//        }

        int i = discussPostMapper.selectDiscussPostRows(101);
        System.out.println(i);
    }
}
