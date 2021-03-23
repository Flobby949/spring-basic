package top.flobby.boot.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.flobby.boot.web.controller.dto.AjaxResponse;
import top.flobby.boot.web.entity.Article;
import top.flobby.boot.web.entity.ArticleReader;

import javax.annotation.Resource;
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

    @PostMapping()
    @ApiOperation("json对象新增文章")
    public AjaxResponse addArticle(@RequestBody Article article) {
        log.info("saveArticle: " + article);
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

    @PutMapping()
    @ApiOperation("url传参修改部分信息")
    public AjaxResponse changeArticle(@RequestParam int id, @RequestParam String title) {
        Article article = Article.builder()
                .id(123)
                .title("title")
                .content("content")
                .author("author")
                .updateTime(new Date())
                .build();
        article.setId(id);
        article.setTitle(title);
        return AjaxResponse.success(article);
    }

    @PutMapping("body")
    @ApiOperation("json对象修改信息")
    public AjaxResponse changeArticleByJson(@RequestBody Article article) {
        Article originArticle = Article.builder()
                .id(123)
                .title("title")
                .content("content")
                .author("author")
                .updateTime(new Date())
                .build();
        originArticle.setId(article.getId());
        originArticle.setTitle(article.getTitle());
        return AjaxResponse.success(originArticle);
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

    @ApiOperation("多文件上传")
    @PostMapping("files")
    public AjaxResponse uploadFiles(@RequestParam("files") MultipartFile[] files, HttpServletRequest request) {
        List<String> fileNames = new ArrayList<>();
        // 创建文件存放路径
        String realPath = request.getServletContext().getRealPath("/upload");
        log.info(realPath);
        File fileDir = new File(realPath);
        if (!fileDir.exists()) {
            boolean flag = fileDir.mkdirs();
            log.info("flag: " + flag);
        }
        for (MultipartFile file : files) {
            // 生成文件在服务器的名称前缀
            String prefixName = UUID.randomUUID().toString();
            // 取得原文件名
            String originalFilename = file.getOriginalFilename();
            // 从文件夹中分离后缀
            assert originalFilename != null;
            String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
            // 拼接文件名
            String fileName = prefixName + suffixName;
            log.info(fileName);
            fileNames.add(fileName);
            // 创建上传文件对象
            File saveFile = new File(realPath + "/" + fileName);
            // 上传
            try {
                file.transferTo(saveFile);
            } catch (IOException e) {
                e.printStackTrace();
                log.info(e.getMessage());
                AjaxResponse.failure("上传失败");
            }
        }
        return AjaxResponse.success(fileNames);
    }

    @ApiOperation("多文件上传,时间分类")
    @PostMapping("filesByTime")
    public AjaxResponse uploadFilesByTime(@RequestParam("files") MultipartFile[] files, HttpServletRequest request) {
        List<String> fileNames = new ArrayList<>();
        String ldt = LocalDateTime.now().toString();
        String date = ldt.split("T")[0];
        System.out.println(date);
        // 创建文件存放路径
        for (MultipartFile file : files) {
            // 生成文件在服务器的名称前缀
            String prefixName = UUID.randomUUID().toString();
            // 取得原文件名
            String originalFilename = file.getOriginalFilename();
            // 从文件夹中分离后缀
            assert originalFilename != null;
            String suffixName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            // 拼接文件名
            String fileName = prefixName + "." + suffixName;
            log.info(fileName);
            fileNames.add(fileName);
            // 创建上传文件对象
            String realPath = request.getServletContext().getRealPath("/upload/" + date + "/" + suffixName);
            log.info(realPath);
            File fileDir = new File(realPath);
            if (!fileDir.exists()) {
                boolean flag = fileDir.mkdirs();
                log.info("flag: " + flag);
            }
            File saveFile = new File(realPath + "/" + fileName);
            // 上传
            try {
                file.transferTo(saveFile);
            } catch (IOException e) {
                e.printStackTrace();
                log.info(e.getMessage());
                AjaxResponse.failure("上传失败");
            }
        }
        return AjaxResponse.success(fileNames);
    }
}
