package com.nocountry.BilleteraVirtual.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity(name = "transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_transaccion", nullable = false, unique = true)
    private String numeroTransaccion;

    @ManyToOne
    @JoinColumn(name = "parte_emisora_id")
    private Usuario parteEmisora;

    @ManyToOne
    @JoinColumn(name = "parte_receptora_id")
    private Usuario parteReceptora;

    @Column(name = "tipo_transaccion", nullable = false)
    private String tipoTransaccion;

    @Column(name = "monto", nullable = false)
    private double monto;

    @Column(name = "descripcion")
    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora", nullable = false)
    private Date fechaHora;

    @Column(name = "estado_transaccion", nullable = false)
    private String estadoTransaccion;

}