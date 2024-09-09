package com.filtro.filtro_app.Domain.Entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "repuestos")
public class Repuesto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nombre;
    private String descripcion;
    private Long precio;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable=false)
    public Proveedor getProveedor;
    
    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable=false)
    public Modelo getModelo;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable=false)
    public Marca getMarca;
}
