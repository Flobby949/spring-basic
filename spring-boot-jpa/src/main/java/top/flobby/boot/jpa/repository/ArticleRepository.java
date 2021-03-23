package top.flobby.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.flobby.boot.jpa.entity.Article;

/**
 * @author      :Flobby
 * @date        :2021/3/18
 * @version     :1.0 
 * @description   :
 */
 
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
