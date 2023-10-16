package com.nocountry.BilleteraVirtual.Entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class HistorialSesionDTO {

    private Long id;
    private Long usuarioId;
    private Date fechaHoraInicioSesion;
    private Date fechaHoraCierreSesion;

}