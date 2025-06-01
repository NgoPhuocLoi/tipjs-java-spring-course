package com.nploi.tipjs_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nploi.tipjs_course.entity.FeedEntity;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {

    public List<FeedEntity> findAll();

}
