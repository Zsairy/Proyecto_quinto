/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;

import java.util.List;
import rnegocio.entidades.Periodos;

/**
 *
 * @author DiegoPatricio
 */
public interface IPeriodos {
     
    public int insertar(Periodos periodos) throws Exception;
    public int modificar(Periodos periodos) throws Exception;
    public int eliminar(Periodos periodos) throws Exception;
    public Periodos obtener(int codigo) throws Exception;
    public List<Periodos> obtener() throws Exception;   
}
    

