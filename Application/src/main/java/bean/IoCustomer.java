package bean;

import javax.ejb.Stateless;
@Stateless
public class IoCustomer extends EntityIO<EnCustomer>{
    public IoCustomer(){
        super(EnCustomer.class);
    }
}
