package com.example.codeToon.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "episodes")
public class Episode extends BaseTimeEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "webtoon_id", nullable = false)
    private Webtoon webtoon;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "episode_number", nullable = false)
    private int episodeNumber;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "is_free")
    private boolean isFree;

    @Column(name = "price", nullable = false)
    private int price;
}
