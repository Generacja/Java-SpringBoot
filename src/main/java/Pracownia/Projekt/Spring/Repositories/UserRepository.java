package Pracownia.Projekt.Spring.Repositories;
import Pracownia.Projekt.Spring.Entities.Address;
import Pracownia.Projekt.Spring.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}

