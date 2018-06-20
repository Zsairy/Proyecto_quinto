/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rnegocio.impl;

import accesodatos.Conexion;
import accesodatos.Parametro;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import rnegocio.dao.IPeriodos;
import rnegocio.entidades.Periodos;

/**
 *
 * @author DiegoPatricio
 */
public class PeriodosImpl implements IPeriodos{
    
     @Override
     
    public int insertar(Periodos periodos) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into periodos  values "
                + "(?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, periodos.getCodigo()));
        lstPar.add(new Parametro(2, periodos.getNombre()));
        lstPar.add(new Parametro(3, periodos.getFecha_inicio()));
        lstPar.add(new Parametro(4, periodos.getFecha_fin()));
        lstPar.add(new Parametro(5, periodos.getTipo()));
        lstPar.add(new Parametro(6, periodos.getObservaciones()));
        lstPar.add(new Parametro(7, periodos.getCodigo_sicoa()));
        lstPar.add(new Parametro(8, periodos.getEstado()));
     
        
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
    public int modificar(Periodos periodos) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE periodos"
                + "   SET codigo=?, nombre=?,  "
                + "fecha_inicio=? ,fecha_fin=?, tipo=?,"
                + "observaciones=?, codiggo_sicoa=?, estado=?  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, periodos.getCodigo()));
        lstPar.add(new Parametro(2, periodos.getNombre()));
        lstPar.add(new Parametro(3, periodos.getFecha_inicio()));
        lstPar.add(new Parametro(4, periodos.getFecha_fin()));
        lstPar.add(new Parametro(5, periodos.getTipo()));
        lstPar.add(new Parametro(6, periodos.getObservaciones()));
        lstPar.add(new Parametro(7, periodos.getCodigo_sicoa()));
        lstPar.add(new Parametro(8, periodos.getEstado()));
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
    public int eliminar(Periodos periodos) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM periodos  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, periodos.getCodigo()));       
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
    public Periodos obtener(int codigo) throws Exception {
      Periodos periodos = null;
        String sql = "SELECT codigo, nombre, fecha_inicio, fecha_fin"
                + "tipo , observaciones, codigo_sicoa, estado FROM periodos where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                periodos = new Periodos();
                periodos.setCodigo(rst.getInt(1));
                periodos.setNombre(rst.getString(2));
                periodos.setFecha_inicio(rst.getDate(3));
                periodos.setFecha_fin(rst.getDate(4));
                periodos.setTipo(rst.getInt (5));
                periodos.setObservaciones(rst.getString(6));
                periodos.setCodigo_sicoa(rst.getInt(7));
                periodos.setEstado(rst.getInt(8));
                 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return periodos;
    }

    @Override
    public List<Periodos> obtener() throws Exception {
        List<Periodos> lista = new ArrayList<>();
         String sql = "SELECT codigo, nombre, fecha_inicio, fecha_fin, tipo, observaciones, codigo_sicoa, estado"
                 + " FROM periodos";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Periodos periodos=null;
            while (rst.next()) {
                periodos = new Periodos();
                periodos.setCodigo(rst.getInt(1));
                periodos.setNombre(rst.getString(2));
                periodos.setFecha_inicio(rst.getDate(3));
                periodos.setFecha_fin(rst.getDate(4));
                periodos.setTipo(rst.getInt (5));
                periodos.setObservaciones(rst.getString(6));
                periodos.setCodigo_sicoa(rst.getInt(7));
                periodos.setEstado(rst.getInt(8));
                 
                lista.add(periodos);
               
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
