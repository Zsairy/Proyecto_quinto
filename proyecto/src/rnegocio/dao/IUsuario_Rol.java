/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;

import java.util.List;
import rnegocio.entidades.Usuario_Rol;

/**
 *
 * @author franc
 */
public interface IUsuario_Rol {
     public int insertar(Usuario_Rol usuario_rol) throws Exception;
    public int modificar(Usuario_Rol usuario_rol) throws Exception;
    public int eliminar(Usuario_Rol usuario_rol) throws Exception;
    public Usuario_Rol obtener(int codigo) throws Exception;
    public List<Usuario_Rol> obtener() throws Exception;
    
}
