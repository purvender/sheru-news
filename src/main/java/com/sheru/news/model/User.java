package com.sheru.news.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users") // 'user' is a reserved keyword in some SQL dialects
@EntityListeners(AuditingEntityListener.class)
@Schema(description = "Entity representing a user in the system")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the user", example = "1")
    private Long id;

    @Column(nullable = false, length = 100)
    @Schema(description = "Name of the user", example = "John Doe", required = true)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    @Schema(description = "Email address of the user", example = "john.doe@example.com", required = true)
    private String email;
}
