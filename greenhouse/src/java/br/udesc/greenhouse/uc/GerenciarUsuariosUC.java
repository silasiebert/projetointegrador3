/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.greenhouse.uc;

import br.udesc.greenhouse.modelo.dao.core.FactoryDAO;
import br.udesc.greenhouse.modelo.dao.core.UsuarioDAO;
import br.udesc.greenhouse.modelo.entidade.Usuario;
import java.util.List;

/**
 *
 * @author ignoi
 */
public class GerenciarUsuariosUC {

    private UsuarioDAO usuarioDAO;

    public GerenciarUsuariosUC() {
        this.usuarioDAO = FactoryDAO.getFactoryDAO().getUsuarioDAO();

    }

    public boolean inserir(Usuario u) {
        try {
            usuarioDAO.inserir(u);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean editar(Usuario u) {
        try {
            usuarioDAO.editar(u);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean remover(int id) {
        try {
            usuarioDAO.remover(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Usuario pesquisar(int id) {
        return usuarioDAO.pesquisar(id);
    }

    public List<Usuario> listar() {
        return usuarioDAO.listar();
    }

}