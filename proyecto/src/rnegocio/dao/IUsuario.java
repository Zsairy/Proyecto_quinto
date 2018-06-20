/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;

import java.util.List;
import rnegocio.entidades.Usuario;

/**
 *
 * @author franc
 */
public interface IUsuario {
     public int insertar(Usuario usuario) throws Exception;
    public int modificar(Usuario usuario) throws Exception;
    public int eliminar(Usuario usuario) throws Exception;
    public Usuario obtener(int codigo) throws Exception;
    public List<Usuario> obtener() throws Exception;
    
}
