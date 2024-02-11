package com.swadesh.blogshot.blogshot.comments;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

import com.swadesh.blogshot.blogshot.users.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "comments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class CommentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    @Nullable
    private String title;
    
    @Column(nullable = false)
    @NonNull
    private String body;

    @Column(nullable = false)
    @CreatedDate
    @NonNull
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "commenterId", nullable = false)
    @NonNull
    private UserEntity commenter;

    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    @NonNull
    private UserEntity article;
}
