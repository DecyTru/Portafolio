package com.portafolio.portafolio.persistence.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "logros")
public class Logro {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_logros")
        private Integer idLogro;

        @Column(name = "titulo_logros")
        private String tituloLogro;

        @Column(name = "descripcion_logros")
        private String descripcionLogro;

        @Column(name = "imagen_logros")
        private String imagenLogro;

        public Integer getIdLogro() {
                return idLogro;
        }

        public void setIdLogro(Integer idLogro) {
                this.idLogro = idLogro;
        }

        public String getTituloLogro() {
                return tituloLogro;
        }

        public void setTituloLogro(String tituloLogro) {
                this.tituloLogro = tituloLogro;
        }

        public String getDescripcionLogro() {
                return descripcionLogro;
        }

        public void setDescripcionLogro(String descripcionLogro) {
                this.descripcionLogro = descripcionLogro;
        }

        public String getImagenLogro() {
                return imagenLogro;
        }

        public void setImagenLogro(String imagenLogro) {
                this.imagenLogro = imagenLogro;
        }
}
