package com.nocountry.BilleteraVirtual.Entities.DTO;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private double saldo;

    public UsuarioDTO() {}

    public UsuarioDTO(String name, String email, String password, long saldo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.saldo = saldo;
    }

}