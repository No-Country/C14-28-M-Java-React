package com.nocountry.BilleteraVirtual.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "historial_sesion")
public class HistorialSesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_inicio_sesion", nullable = false)
    private Date fechaHoraInicioSesion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_cierre_sesion", nullable = false)
    private Date fechaHoraCierreSesion;

}