package com.oudia.gestiondestock.repository;

import com.oudia.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

    @Query("select a from Article a where a.code=:code and a.designation=:designation")
    List<Article> findByCustomQuery(@Param("code") String c,@Param("designation") String d);

    @Query(value="select * from article where code= :code",nativeQuery = true)
    List<Article> findByCustomNativeQuery(@Param("code")String c);

    List<Article> findByCodeByAndDesignation(String code,String designation);
}
