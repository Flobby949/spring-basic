package top.flobby.boot.jpa.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.flobby.boot.jpa.entity.Article;
import top.flobby.boot.jpa.repository.ArticleRepository;
import top.flobby.boot.jpa.service.ArticleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> getList() {
        return articleRepository.findAll();
    }
}