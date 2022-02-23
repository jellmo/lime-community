package com.lime.community.controller;

import com.lime.community.model.entity.DiscussPost;
import com.lime.community.model.entity.User;
import com.lime.community.model.vo.PageVo;
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
     * <p>
     * 注：函数调用之前，springMVC的DispatcherServlet前端控制器会自动实例化参数列表（model和page），并将
     * page注入到model中，因此函数中可以略去model注入page这一步，并且thymeleaf可以直接访问page对象中的数据。
     * (默认按照类名注入对象，thymeleaf调用需要用pageVo，所以我们这里还是注入一下，这样后续调用即可用page)
     *
     * @param model 视图渲染对象
     * @param page  分页对象
     * @return 首页
     */
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, PageVo page) {
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/index");
        //默认渲染前10条帖文数据
        List<DiscussPost> list = discussPostService.selectDiscussPosts(0, page.getOffset(), page.getLimit());
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
        model.addAttribute("page", page);
        return "/index";
    }
}
