package com.nocountry.BilleteraVirtual.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tarjeta_credito")
public class TarjetaCredito {

    @Id
    @Column(name = "id_tarjeta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarjeta;

    @Column(name = "nombre_titular", nullable = false)
    private String nombreTitular;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "numero_tarjeta", nullable = false)
    private int numeroTarjeta;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_vencimiento", nullable = false)
    private Date fechaVencimiento;

    @Column(nullable = false)
    private int cvv;

//     nombre del banco
    @Column(name = "nombre_emisor", nullable = false)
    private String nombreEmisor;

    @Column(name = "firma_titular", nullable = false)
    private String firmaTitular;

//    este campo se establece por el banco no por la persona
    @Column(name = "limite_credito")
    private Long limiteCredito;

}