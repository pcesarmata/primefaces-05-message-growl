package mx.com.gamasoft.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Cesar
 */
@ManagedBean
public class GrowlBean {
    private String mensajeBean;

    public String getMensajeBean() {
        return mensajeBean;
    }

    public void setMensajeBean(String mensajeBean) {
        this.mensajeBean = mensajeBean;
    }
    
    public void enviarMesaje(){
        FacesContext objContext = FacesContext.getCurrentInstance();
        objContext.addMessage(null, new FacesMessage("Exitoso, " + mensajeBean));
    }
}