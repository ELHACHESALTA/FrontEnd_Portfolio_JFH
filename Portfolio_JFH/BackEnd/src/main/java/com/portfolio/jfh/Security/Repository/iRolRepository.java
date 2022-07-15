package com.portfolio.jfh.Security.Repository;

import com.portfolio.jfh.Security.Entity.Rol;
import com.portfolio.jfh.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
