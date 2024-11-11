package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "game")
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    private UUID id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
}
