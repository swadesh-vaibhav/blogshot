package com.swadesh.blogshot.blogshot.articles;

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

@Entity(name = "articles")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class ArticleEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    @NonNull
    private String title;
    
    @Column(unique = true, nullable = false)
    @NonNull
    private String slug;
    
    @Column(nullable = false)
    @Nullable
    private String subtitle;

    @Column(nullable = true)
    @NonNull
    private String body;

    @Column(nullable = false)
    @CreatedDate
    @NonNull
    private Date createdAt;

    @Column(nullable = true)
    @Nullable
    private String image;

    @ManyToOne
    @JoinColumn(name = "authorId", nullable = false)
    @NonNull
    private UserEntity author;
}
