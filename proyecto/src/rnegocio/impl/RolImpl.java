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
import rnegocio.dao.IRol;
import rnegocio.entidades.Rol;

/**
 *
 * @author franc
 */
public class RolImpl implements IRol{
    
     @Override
    public int insertar(Rol rol) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into rol  values "
                + "(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, rol.getCodigo()));
        lstPar.add(new Parametro(2, rol.getNombre()));
        lstPar.add(new Parametro(3, rol.getDescripcion()));
        lstPar.add(new Parametro(4, rol.getEstado()));
        lstPar.add(new Parametro(5, rol.getCodigo_modulo()));
     
        
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
    public int modificar(Rol rol) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE rol"
                + "   SET codigo=?, nombre=?,  "
                + "descripcion=? ,estado=?, codigo_modulo=? where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
       lstPar.add(new Parametro(1, rol.getCodigo()));
        lstPar.add(new Parametro(2, rol.getNombre()));
        lstPar.add(new Parametro(3, rol.getDescripcion()));
        lstPar.add(new Parametro(4, rol.getEstado()));
        lstPar.add(new Parametro(5, rol.getCodigo_modulo()));
         
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
    public int eliminar(Rol rol) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM rol  where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, rol.getCodigo()));       
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
    public Rol obtener(int codigo) throws Exception {
      Rol rol = null;
        String sql = "SELECT codigo, nombre,"
                + "descripcion , estado, codigo_modulo FROM rol where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                rol = new Rol();
                rol.setCodigo(rst.getInt(1));
                rol.setNombre(rst.getString(2));
                rol.setDescripcion(rst.getString(3));
                rol.setEstado(rst.getInt(4));
                rol.setCodigo_modulo(rst.getInt(5));
                 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return rol;
    }

    @Override
    public List<Rol> obtener() throws Exception {
        List<Rol> lista = new ArrayList<>();
         String sql = "SELECT codigo, nombre,descripcion, estado, codigo_modulo  "
                 + " FROM rol";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Rol rol=null;
            while (rst.next()) {
                rol = new Rol();
                rol.setCodigo(rst.getInt(1));
                rol.setNombre(rst.getString(2));
                rol.setDescripcion(rst.getString(3));
                rol.setEstado(rst.getInt(4));
                rol.setCodigo_modulo(rst.getInt(5));
                lista.add(rol);
               
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
