package com.sraap.sistemasraap.controller;

import com.sraap.sistemasraap.model.entidades.Administrador;
import com.sraap.sistemasraap.model.entidades.Aluno;
import com.sraap.sistemasraap.model.entidades.Professor;
import com.sraap.sistemasraap.model.entidades.Usuario;
import com.sraap.sistemasraap.model.model.UsuarioModel;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;

@ManagedBean
@ViewScoped
public class UsuarioController {

    private UsuarioModel usuarioModel;
    private Usuario usuario;

    public UsuarioController() {
        usuario = new Usuario();
        usuarioModel = new UsuarioModel();
    }

    public void cadastrar() {
        try {
            usuarioModel.inserir(getUsuario());

        } catch (HibernateException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deletar() {
        try {
            usuarioModel.excluir(getUsuario());

        } catch (HibernateException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() {
        try {
            usuarioModel.atualizar(getUsuario());

        } catch (HibernateException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Usuario buscarID() {
        try {
            return usuarioModel.buscarID(getUsuario());

        } catch (HibernateException e) {
            e.printStackTrace();
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String Login() throws Exception {
        usuario = usuarioModel.login(usuario.getEmail(), usuario.getSenha());

        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.setAttribute("usuario", usuario);
        
        if (usuario instanceof Aluno) {
            return "sraap/aluno/home.xhtml?faces-redirect=true";

        } else if (usuario instanceof Professor) {
            return "sraap/professor/home.xhtml?faces-redirect=true";

        } else if (usuario instanceof Administrador) {
            return "sraap/administrador/home.xhtml?faces-redirect=true";

        } else {
            return null;
        }
    }
    
    public String logout () {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/seguranca/login?faces-redirect=true";
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
