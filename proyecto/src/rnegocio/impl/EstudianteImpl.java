/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.impl;

import accesodatos.Conexion;
import accesodatos.Parametro;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import rnegocio.entidades.Estudiante;
import rnegocio.dao.IEstudiante;

/**

/**
 *
 * @author DiegoPatricio
 */
public class EstudianteImpl implements IEstudiante{
    
     @Override
     
    public int insertar(Estudiante estudiante) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into estudiante  values "
                + "(?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, estudiante.getCodigo()));
        lstPar.add(new Parametro(2, estudiante.getNombre()));
        lstPar.add(new Parametro(3, estudiante.getApellido()));
        lstPar.add(new Parametro(4, estudiante.getCedula()));
        lstPar.add(new Parametro(5, estudiante.getCodigo_sicoa()));
        lstPar.add(new Parametro(6, estudiante.getCodigo_periodo()));
        lstPar.add(new Parametro(7, estudiante.getCodigo_nivel()));
     
        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public int modificar(Estudiante estudiante) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE estudiante"
                + "   SET codigo=?, nombre=?,  "
                + "apellido=? ,cedula=?, codigo_sicoa=?,"
                + "codigo_periodo=?, codigo_nivel=? where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
       lstPar.add(new Parametro(1, estudiante.getCodigo()));
       lstPar.add(new Parametro(2, estudiante.getNombre()));
       lstPar.add(new Parametro(3, estudiante.getApellido()));
       lstPar.add(new Parametro(4, estudiante.getCedula()));
       lstPar.add(new Parametro(5, estudiante.getCodigo_sicoa()));
       lstPar.add(new Parametro(6, estudiante.getCodigo_periodo()));
       lstPar.add(new Parametro(7, estudiante.getCodigo_nivel()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public int eliminar(Estudiante estudiante) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM estudiante  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, estudiante.getCodigo()));       
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public Estudiante obtener(int codigo) throws Exception {
      Estudiante estudiante = null;
        String sql = "SELECT codigo, nombre,"
                + "apellido , cedula, codigo_sicoa, codigo_periodo, codigo_nivel FROM estudiante where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                estudiante = new Estudiante();
                estudiante.setCodigo(rst.getInt(1));
                estudiante.setNombre(rst.getString(2));
                estudiante.setApellido(rst.getString(3));
                estudiante.setCedula(rst.getString(4));
                estudiante.setCodigo_sicoa(rst.getInt(5));
                estudiante.setCodigo_periodo(rst.getInt(6));
                estudiante.setCodigo_nivel(rst.getInt(7));
                 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return estudiante;
    }

    @Override
    public List<Estudiante> obtener() throws Exception {
        List<Estudiante> lista = new ArrayList<>();
         String sql = "SELECT codigo, nombre,apellido, cedula, codigo_sicoa, codigo_periodo, codigo_nivel  "
                 + " FROM estudiante";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Estudiante estudiante=null;
            while (rst.next()) {
                estudiante = new Estudiante();
                estudiante.setCodigo(rst.getInt(1));
                estudiante.setNombre(rst.getString(2));
                estudiante.setApellido(rst.getString(3));
                estudiante.setCedula(rst.getString(4));
                estudiante.setCodigo_sicoa(rst.getInt(5));
                estudiante.setCodigo_periodo(rst.getInt(6));
                estudiante.setCodigo_nivel(rst.getInt(7));
                
                lista.add(estudiante);
               
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }
}
