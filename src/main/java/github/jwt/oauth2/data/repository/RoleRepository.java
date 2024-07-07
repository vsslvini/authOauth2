package github.jwt.oauth2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.jwt.oauth2.data.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
