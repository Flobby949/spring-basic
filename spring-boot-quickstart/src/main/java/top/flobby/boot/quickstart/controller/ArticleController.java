package top.flobby.boot.quickstart.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.flobby.boot.quickstart.controller.dto.AjaxResponse;
import top.flobby.boot.quickstart.entity.Article;
import top.flobby.boot.quickstart.entity.ArticleReader;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/4
 * @description :book接口
 */

@RestController
@RequestMapping(value = "/api/books")
@Slf4j
@Validated
@Api(tags = "文章管理接口")
public class ArticleController {

    @GetMapping(value = "all")
    @ApiOperation("获取文章信息列表")
    public AjaxResponse bookList() {
        ArticleReader[] readers = {
                ArticleReader.builder()
                        .name("aaa")
                        .age(20)
                        .build(),
                ArticleReader.builder()
                        .name("bbb")
                        .age(17)
                        .build()
        };
        List<ArticleReader> readerList = Arrays.asList(readers);
        Article article1 = Article.builder()
                .id(123)
                .author("jcx")
                .title("《高 档》")
                .content("spring学习")
                .updateTime(new Date())
                .readers(readerList)
                .build();
        Article article2 = Article.builder()
                .id(321)
                .author("jcx")
                .title("《格 局》")
                .content("spring再学习")
                .updateTime(new Date())
                .readers(readerList)
                .build();

        Article[] articles = {article1, article2};
        List<Article> articleList = Arrays.asList(articles);
        return AjaxResponse.success(articleList);
    }

    @GetMapping("{id}")
    @ApiOperation("根据id,路径传参获取文章信息")
    public AjaxResponse getBook(@PathVariable int id) {
        Article article = Article.builder()
                .id(id)
                .author("jcx")
                .title("《spring》")
                .content("spring学不下去")
                .updateTime(new Date())
                .build();
        return AjaxResponse.success(article);
    }

    @GetMapping()
    @ApiOperation("根据id，url传参查询文章")
    public AjaxResponse selectBook(
            @ApiParam("文章id")
            @RequestParam int id
    ) {
        Article article = Article.builder()
                .id(id)
                .author("jcx")
                .title("《spring》")
                .content("spring学不下去")
                .updateTime(new Date())
                .build();
        return AjaxResponse.success(article);
    }

    @PostMapping("param")
    @ApiOperation("URL传参新增文章")
    public AjaxResponse saveArticle(
            @ApiParam("文章id")
            @RequestParam(value = "id", defaultValue = "111", required = false) int id,
            @ApiParam("作者")
            @RequestParam(value = "author", defaultValue = "jcx", required = false) String author,
            @ApiParam("标题")
            @Length(min = 5, max = 12)
            @RequestParam String title,
            @ApiParam("内容")
            @RequestParam String content,
            @ApiParam("创建时间")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
            @RequestParam(value = "createTime", defaultValue = "2021-03-07 23:20:00") Date createTime
    ) {
        Article article = Article.builder()
                .id(id)
                .title(title)
                .content(content)
                .author(author)
                .updateTime(createTime)
                .build();
        log.info("saveArticle: " + article);
        return AjaxResponse.success(article);
    }

    @PutMapping("article")
    @ApiOperation("URL传参修改文章")
    public AjaxResponse updateArticle(
            @ApiParam("待修改文章id")
            @RequestParam(value = "id", defaultValue = "111", required = false) int id,
            @ApiParam("作者")
            @RequestParam(value = "author", defaultValue = "jcx", required = false) String author,
            @ApiParam("标题")
            @RequestParam String title,
            @ApiParam("内容")
            @RequestParam String content,
            @ApiParam("创建时间")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
            @RequestParam(value = "createTime", defaultValue = "2021-03-07 23:20:00") Date createTime
    ) {
        Article article = Article.builder()
                .id(id)
                .title(title)
                .content(content)
                .author(author)
                .updateTime(createTime)
                .build();
        return AjaxResponse.success(article);
    }

    @DeleteMapping("{id}")
    @ApiOperation("根据id，路径传参删除文章")
    public AjaxResponse deleteArticle(@PathVariable int id) {
        log.info("id:" + id);
        return AjaxResponse.success(id);
    }

    @DeleteMapping()
    @ApiOperation("URL传参删除文章")
    public AjaxResponse removeArticle(
            @ApiParam("文章id")
            @RequestParam int id
    ) {
        log.info("id:" + id);
        return AjaxResponse.success(id);
    }


//    @DeleteMapping()
//    public AjaxResponse deleteArticle(@RequestBody Param param) {
//        log.info("id:" + param.getId());
//        log.info("title:" + param.getTitle());
//        return AjaxResponse.success();
//    }

}
