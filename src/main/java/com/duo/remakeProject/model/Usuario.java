package com.duo.remakeProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3 , max =100)
    @NotEmpty
    @NotNull
    private String nomeCompleto;

    @Size(min = 3 , max =300)
    private String fotoPerfil;

    @Email
    @NotEmpty
    @NotNull
    @Size(min = 3 , max =100)
    private String email;

    @NotEmpty
    @NotNull
    private String tipoAdimin;

    @NotEmpty
    @NotNull
    @Size( max =11)
    private String telefone;


    @NotEmpty
    @NotNull
    @Size(max =255)
    private String sobreMim;

}
