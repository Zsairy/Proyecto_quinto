/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.entidades;

import java.sql.Timestamp;

/**
 *
 * @author franc
 */
public class Usuario {
    private long codigo;
    private String nombres;
    private String identificacion;
    private String nombre_corto;
    private String clave;
    private String clave_pregunta;
    private String clave_respuesta;
    private String mail;
    private int estado;
    private Timestamp primer_acceso;
    private Timestamp ultimo_acceso;
    private String ultima_ip;
    private Timestamp fecha_modificacion;
    private String codigo_salt;
    private String ruta_firm;

    public Usuario(long codigo, String nombres, String identificacion, String nombre_corto, String clave, String clave_pregunta, String clave_respuesta, String mail, int estado, Timestamp primer_acceso, Timestamp ultimo_acceso, String ultima_ip, Timestamp fecha_modificacion, String codigo_salt, String ruta_firm) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.nombre_corto = nombre_corto;
        this.clave = clave;
        this.clave_pregunta = clave_pregunta;
        this.clave_respuesta = clave_respuesta;
        this.mail = mail;
        this.estado = estado;
        this.primer_acceso = primer_acceso;
        this.ultimo_acceso = ultimo_acceso;
        this.ultima_ip = ultima_ip;
        this.fecha_modificacion = fecha_modificacion;
        this.codigo_salt = codigo_salt;
        this.ruta_firm = ruta_firm;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre_corto() {
        return nombre_corto;
    }

    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave_pregunta() {
        return clave_pregunta;
    }

    public void setClave_pregunta(String clave_pregunta) {
        this.clave_pregunta = clave_pregunta;
    }

    public String getClave_respuesta() {
        return clave_respuesta;
    }

    public void setClave_respuesta(String clave_respuesta) {
        this.clave_respuesta = clave_respuesta;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Timestamp getPrimer_acceso() {
        return primer_acceso;
    }

    public void setPrimer_acceso(Timestamp primer_acceso) {
        this.primer_acceso = primer_acceso;
    }

    public Timestamp getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(Timestamp ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public String getUltima_ip() {
        return ultima_ip;
    }

    public void setUltima_ip(String ultima_ip) {
        this.ultima_ip = ultima_ip;
    }

    public Timestamp getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Timestamp fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getCodigo_salt() {
        return codigo_salt;
    }

    public void setCodigo_salt(String codigo_salt) {
        this.codigo_salt = codigo_salt;
    }

    public String getRuta_firm() {
        return ruta_firm;
    }

    public void setRuta_firm(String ruta_firm) {
        this.ruta_firm = ruta_firm;
    }
    
    
    
    
    
    
}
