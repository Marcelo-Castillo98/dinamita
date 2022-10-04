package com.nttdata.cursofullstack.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioParaCrear {
    private String nombre_usuario;
    private String clave;
    private String nombre;
    private String apelllido;
}
