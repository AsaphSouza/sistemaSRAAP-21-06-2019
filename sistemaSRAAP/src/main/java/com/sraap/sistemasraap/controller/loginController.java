package com.sraap.sistemasraap.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.sraap.sistemasraap.model.entidades.LoginEntity;

@ManagedBean(name = "loginController")
@SessionScoped
public class loginController implements Serializable{
    private LoginEntity login;
    
    public loginController () {
        login = new LoginEntity();
    }
    
    public String logarNoSistema() {
        if (login.getLogin().equals("admin") && login.getSenha().equals("admin")){
            HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            session.setAttribute("usuario", login);
            
            return "/app/index?faces-redirect=true";
        } else {
            return "/seguranca/login?faces-redirect=true";
        }
    }
    
    public String logout () {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/seguranca/login?faces-redirect=true";
    }

    public LoginEntity getLogin() {
        return login;
    }

    public void setLogin(LoginEntity login) {
        this.login = login;
    }
    
    
}
