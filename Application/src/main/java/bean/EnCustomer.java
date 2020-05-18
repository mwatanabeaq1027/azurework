package bean;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="[SalesLT].[Address]")
public class EnCustomer implements Serializable {
  @Id @NotNull // Null禁止。ビーン・バリデーションも指定できる
  private  Integer  AddressID;
  private  String   AddressLine1;
  private  String   AddressLine2;
  private  String   City;
  private  String   StateProvince;
  private  String   CountryRegion;
  private  String   PostalCode;
  private  String   rowguid;
  private  String   ModifiedDate;


  public   EnCustomer(){}

  public EnCustomer(Integer AddressID, 
                    String AddressLine1,
                    String AddressLine2,
                    String City,
                    String StateProvince,
                    String CountryRegion,
                    String PostalCode,
                    String rowguid,
                    String ModifiedDate){
    super();
    this.AddressID = AddressID;
    this.AddressLine1 = AddressLine1;
    this.AddressLine2 = AddressLine2;
    this.City = City;
    this.StateProvince = StateProvince;
    this.CountryRegion = CountryRegion;
    this.PostalCode = PostalCode;
    this.rowguid = rowguid;
    this.ModifiedDate = ModifiedDate;
  }

  public Integer getAddressID() {
    return this.AddressID;
  }

  public void setAddressID(final Integer AddressID) {
    this.AddressID = AddressID;
  }
  public String getAddressLine1() {
    return this.AddressLine1;
  }

  public void setAddressLine1(final String AddressLine1) {
    this.AddressLine1 = AddressLine1;
  }
  public String getAddressLine2() {
    return this.AddressLine2;
}

public void setAddressLine2(final String AddressLine2) {
    this.AddressLine2 = AddressLine2;
}
public String getCity() {
    return this.City;
}

public void setCity(final String City) {
    this.City = City;
}
public String getStateProvince() {
    return this.StateProvince;
}

public void setStateProvince(final String StateProvince) {
    this.StateProvince = StateProvince;
}
public String getCountryRegion() {
    return this.CountryRegion;
}

public void setCountryRegion(final String CountryRegion) {
    this.CountryRegion = CountryRegion;
}
public String getPostalCode() {
    return this.PostalCode;
}

public void setPostalCode(final String PostalCode) {
    this.PostalCode = PostalCode;
}
public String getrowguid() {
    return this.rowguid;
}

public void setrowguid(final String rowguid) {
    this.rowguid = rowguid;
}
public String getModifiedDate() {
    return this.ModifiedDate;
}

public void setModifiedDate(final String ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
}
  // setter/getterメソッド。NetBeansなどのIDEを使うと自動生成できる
}