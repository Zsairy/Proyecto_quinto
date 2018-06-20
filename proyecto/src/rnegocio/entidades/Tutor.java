/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.entidades;

/**
 *
 * @author DiegoPatricio
 */
public class Tutor {
    private int codigo;
    private int codigo_nivel;
    private int codigo_periodo;
    private int codigo_usuario_rol;

    public Tutor() {
    }

    public Tutor(int codigo, int codigo_nivel, int codigo_periodo, int codigo_usuario_rol) {
        this.codigo = codigo;
        this.codigo_nivel = codigo_nivel;
        this.codigo_periodo = codigo_periodo;
        this.codigo_usuario_rol = codigo_usuario_rol;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_nivel() {
        return codigo_nivel;
    }

    public void setCodigo_nivel(int codigo_nivel) {
        this.codigo_nivel = codigo_nivel;
    }

    public int getCodigo_periodo() {
        return codigo_periodo;
    }

    public void setCodigo_periodo(int codigo_periodo) {
        this.codigo_periodo = codigo_periodo;
    }

    public int getCodigo_usuario_rol() {
        return codigo_usuario_rol;
    }

    public void setCodigo_usuario_rol(int codigo_usuario_rol) {
        this.codigo_usuario_rol = codigo_usuario_rol;
    }
    
    
}
