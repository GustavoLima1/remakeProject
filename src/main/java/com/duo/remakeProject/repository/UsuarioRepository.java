package com.duo.remakeProject.repository;


import com.duo.remakeProject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findById (Long id);
}
