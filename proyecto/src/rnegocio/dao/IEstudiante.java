/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.dao;

import java.util.List;
import rnegocio.entidades.Estudiante;

/**
 *
 * @author DiegoPatricio
 */
public interface IEstudiante {
    
    public int insertar(Estudiante estudiante) throws Exception;
    public int modificar(Estudiante estudiante) throws Exception;
    public int eliminar(Estudiante estudiante) throws Exception;
    public Estudiante obtener(int codigo) throws Exception;
    public List<Estudiante> obtener() throws Exception;   
}
