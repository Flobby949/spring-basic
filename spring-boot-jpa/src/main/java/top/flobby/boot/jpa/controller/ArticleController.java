package top.flobby.boot.jpa.controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.flobby.boot.jpa.entity.Article;
import top.flobby.boot.jpa.service.ArticleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */
@Controller
@RequestMapping(value = "/")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @GetMapping()
    public String bookPage(Model model){
        model.addAttribute("message","Hello SpringBoot");
        List<Article> articleList =articleService.getList();
        model.addAttribute("articleList",articleList);
        return "article";
    }

    @GetMapping("/ArticleNoQuery")
    public Page<Article> findBookNoCriteria(@RequestParam Integer page, @RequestParam Integer size) {
        return articleService.findBookNoCriteria(page, size);
    }

    @GetMapping("/ArticleQuery")
    public Page<Article> findBookCriteria(
            @RequestParam Integer page,
            @RequestParam Integer size,
            Integer id,
            String cover,
            String name){
        Article article = Article.builder()
                .id(id)
                .cover(cover)
                .title(name)
                .build();
        return articleService.findBookCriteria(page, size, article);
    }
}