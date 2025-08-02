package com.app.backend.repository;

import com.app.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        Optional<Usuario> findByEmail(String email); // 
    Optional<Usuario> findByEmailAndPassword(String email, String password);
}
