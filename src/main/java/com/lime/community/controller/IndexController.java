package com.lime.community.controller;

import com.lime.community.entity.DiscussPost;
import com.lime.community.entity.User;
import com.lime.community.service.DiscussPostService;
import com.lime.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 首页视图层
 * </p>
 *
 * @author mohe
 * @date 2022-02-21 13:25:29
 */
@Controller
public class IndexController {

    private UserService userService;
    private DiscussPostService discussPostService;

    @Autowired
    public IndexController(UserService userService, DiscussPostService discussPostService) {
        this.userService = userService;
        this.discussPostService = discussPostService;
    }

    /**
     * 首页获取api
     *
     * @param model 视图渲染对象
     * @return 首页
     */
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        //默认渲染前10条帖文数据
        List<DiscussPost> list = discussPostService.selectDiscussPosts(0, 0, 10);
        //将帖文与作者信息对映起来
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                User user = userService.selectById(post.getUserId());
                HashMap<String, Object> map = new HashMap<>();
                map.put("post", post);
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "/index";
    }
}
