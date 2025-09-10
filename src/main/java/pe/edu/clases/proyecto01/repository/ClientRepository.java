package pe.edu.clases.proyecto01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.clases.proyecto01.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
