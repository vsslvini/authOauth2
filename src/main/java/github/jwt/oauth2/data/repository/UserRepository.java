package github.jwt.oauth2.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.jwt.oauth2.data.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
    
}
