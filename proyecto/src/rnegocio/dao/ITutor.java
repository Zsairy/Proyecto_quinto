/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;

import java.util.List;
import rnegocio.entidades.Tutor;

/**
 *
 * @author DiegoPatricio
 */
public interface ITutor {
    public int insertar(Tutor tutor) throws Exception;
    public int modificar(Tutor tutor) throws Exception;
    public int eliminar(Tutor tutor) throws Exception;
    public Tutor obtener(int codigo) throws Exception;
    public List<Tutor> obtener() throws Exception;   
}
