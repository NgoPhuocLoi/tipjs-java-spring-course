package com.nploi.tipjs_course.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nploi.tipjs_course.entity.user.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);

    // UserEntity findById(Long id);

    UserEntity findByEmail(String email);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Page<UserEntity> findAll(Pageable pageable);
}
