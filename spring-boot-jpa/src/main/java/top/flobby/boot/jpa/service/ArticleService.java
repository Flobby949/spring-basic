package top.flobby.boot.jpa.service;


import top.flobby.boot.jpa.entity.Article;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */

public interface ArticleService {
    /**
     * xinzeng
     * @param article
     * @return
     */
    Article save(Article article);

    /**
     * cahxun
     * @return
     */
    List<Article> getList();
}
