package com.learning.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "urls")
public class Urls {
    @Id
    @Column(name = "long_url")
    private String longUrl;

    @Column(name="short_url")
    private String shortUrl;

}
