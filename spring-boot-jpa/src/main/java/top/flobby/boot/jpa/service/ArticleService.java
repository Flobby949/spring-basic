package top.flobby.boot.jpa.service;


import org.springframework.data.domain.Page;
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

    /**
     * 不带条件查询书
     * @param page 页码
     * @param size 每页数量
     * @return Page<Article>
     */
    Page<Article> findBookNoCriteria(Integer page, Integer size);

    /**
     * 不带条件查询书
     * @param page 页码
     * @param size 每页数量
     * @param article 查询条件
     * @return page
     */
    Page<Article> findBookCriteria(Integer page,Integer size,Article article);
}
