package top.flobby.boot.jpa.service.Impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.flobby.boot.jpa.entity.Article;
import top.flobby.boot.jpa.repository.ArticleRepository;
import top.flobby.boot.jpa.service.ArticleService;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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

    @Override
    public Page<Article> findBookNoCriteria(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return articleRepository.findAll(pageable);
    }

    @Override
    public Page<Article> findBookCriteria(Integer page, Integer size, Article article) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "id");
        Page<Article> articlePage = articleRepository.findAll(new Specification<Article>(){
            @Override
            public Predicate toPredicate(Root<Article> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();

                if(null!=article.getId()&&!"".equals(article.getId())){
                    list.add(criteriaBuilder.equal(root.get("id").as(String.class), article.getId()));
                }
                if(null!=article.getTitle()&&!"".equals(article.getTitle())){
                    list.add(criteriaBuilder.equal(root.get("title").as(String.class), article.getTitle()));
                }
                if(null!=article.getCover()&&!"".equals(article.getCover())){
                    list.add(criteriaBuilder.equal(root.get("cover").as(String.class), article.getCover()));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        },pageable);
        return articlePage;
    }
}