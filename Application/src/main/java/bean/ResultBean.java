package bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@ManagedBean
@RequestScoped
public class ResultBean{

    private String Address1 = "";

    @EJB(beanName="IoCustomer")
    private IoCustomer db = new IoCustomer();

    @PostConstruct
    public void find() {
        EnCustomer rt = this.db.find(9);
        System.out.println("Successful JPA: " + rt.getAddressLine1());
        Address1 = rt.getAddressLine1();
    }
    
    public String getAddress1() {
        return this.Address1;
    }

    public void setAddress1(final String Address1) {
        this.Address1 = Address1;
    }
}