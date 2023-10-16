package com.nocountry.BilleteraVirtual.Entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TransaccionDTO {

    private Long id;
    private String numeroTransaccion;
    private Long parteEmisoraId;
    private Long parteReceptoraId;
    private String tipoTransaccion;
    private double monto;
    private String descripcion;
    private Date fechaHora;
    private String estadoTransaccion;

}