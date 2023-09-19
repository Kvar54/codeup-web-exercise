package edu.codeup.codeupspringblog.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts")
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(nullable = false, length = 200)
private String title;


@Column(nullable = false, length = 200)
private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
