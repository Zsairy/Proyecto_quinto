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
import rnegocio.dao.ITutor;
import rnegocio.entidades.Tutor;

/**
 *
 * @author DiegoPatricio
 */
public class TutorImpl implements ITutor{
    
     @Override
     
    public int insertar(Tutor tutor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into tutor  values "
                + "(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, tutor.getCodigo()));
        lstPar.add(new Parametro(2, tutor.getCodigo_nivel()));
        lstPar.add(new Parametro(3, tutor.getCodigo_periodo()));
        lstPar.add(new Parametro(4, tutor.getCodigo_usuario_rol()));
       
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
    public int modificar(Tutor tutor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE tutor"
                + "   SET codigo=?, codigo_nivel=?,  "
                + "codigo_periodo=?, codigo_usuario_rol=? where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, tutor.getCodigo()));
        lstPar.add(new Parametro(2, tutor.getCodigo_nivel()));
        lstPar.add(new Parametro(3, tutor.getCodigo_periodo()));
        lstPar.add(new Parametro(4, tutor.getCodigo_usuario_rol()));
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
    public int eliminar(Tutor tutor) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM tutor  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, tutor.getCodigo()));       
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
    public Tutor obtener(int codigo) throws Exception {
      Tutor tutor = null;
        String sql = "SELECT codigo, codigo_nivel, codigo_periodo, "
                   + "codigo_usuario_rol FROM tutor where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                tutor = new Tutor();
                tutor.setCodigo(rst.getInt(1));
                tutor.setCodigo_nivel(rst.getInt(2));
                tutor.setCodigo_periodo(rst.getInt(3));
                tutor.setCodigo_usuario_rol(rst.getInt(4));
                
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return tutor;
    }

    @Override
    public List<Tutor> obtener() throws Exception {
        List<Tutor> lista = new ArrayList<>();
         String sql = "SELECT codigo, codigo_nivel, codigo_periodo, "
                   + "codigo_usuario_rol FROM tutor";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Tutor tutor=null;
            while (rst.next()) {
                tutor = new Tutor();
                tutor.setCodigo(rst.getInt(1));
                tutor.setCodigo_nivel(rst.getInt(2));
                tutor.setCodigo_periodo(rst.getInt(3));
                tutor.setCodigo_usuario_rol(rst.getInt(4));
                lista.add(tutor);
               
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
