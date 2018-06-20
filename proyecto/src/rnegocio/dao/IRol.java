/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;
import rnegocio.entidades.Rol;
import java.util.List;

/**
 *
 * @author franc
 */
public interface IRol {
     public int insertar(Rol rol) throws Exception;
    public int modificar(Rol rol) throws Exception;
    public int eliminar(Rol rol) throws Exception;
    public Rol obtener(int codigo) throws Exception;
    public List<Rol> obtener() throws Exception;   
}
