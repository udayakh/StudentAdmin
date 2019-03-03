package com.uday.admin;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

        private String email;
        private String password;

        public LoginBean() {
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void signIn() {
            if("uday".equalsIgnoreCase(email) && "uday".equalsIgnoreCase(password)) {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Valid User"));
            }
            else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("InValid User"));
            }
        }

}
