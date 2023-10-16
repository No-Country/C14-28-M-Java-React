package com.nocountry.BilleteraVirtual.Entities.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class TarjetaCreditoDTO {

    private Long idTarjeta;
    private String nombreTitular;
    private Long idUsuario;
    private int numeroTarjeta;
    private Date fechaVencimiento;
    private int cvv;
    private String nombreEmisor;
    private String firmaTitular;
    private Long limiteCredito;

    public TarjetaCreditoDTO() {}

    public TarjetaCreditoDTO(String nombreTitular, Long idUsuario, int numeroTarjeta, Date fechaVencimiento,
                             int cvv, String nombreEmisor, String firmaTitular, Long limiteCredito) {
        this.nombreTitular = nombreTitular;
        this.idUsuario = idUsuario;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.nombreEmisor = nombreEmisor;
        this.firmaTitular = firmaTitular;
        this.limiteCredito = limiteCredito;
    }

}