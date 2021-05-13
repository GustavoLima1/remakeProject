package com.duo.remakeProject.service;

import com.duo.remakeProject.model.Usuario;
import com.duo.remakeProject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public ResponseEntity<Usuario> findById(Long id) {
        return usuarioRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    public List<Usuario> findAll(){
        return  usuarioRepository.findAll();
    }


}
