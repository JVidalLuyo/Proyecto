package pe.edu.clases.proyecto01.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Clients")
@Data   
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    private String gender;

    @Column(length = 1)
    private String status = "A";
}
