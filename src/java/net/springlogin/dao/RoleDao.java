package net.springlogin.dao;

import net.springlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long>{
}
