package project01am.day08;
import java.util.*;

public class Product{
    public long id;
    public String prodName;
    public String prodDesc;
    public String prodCategory;
    public Float price;
    public Date createdDate;


    

    public Product(long id, String prodName, String prodDesc, String prodCategory, Float price, Date createdDate) {
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCategory = prodCategory;
        this.price = price;
        this.createdDate = createdDate;
    }








    @Override
    public String toString() {
        return "Product [id=" + id + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCategory="
                + prodCategory + ", price=" + price + ", createdDate=" + createdDate + "]";
    }





    public Float getPrice() {
        return price;
    }


    public void setPrice(Float price) {
        this.price = price;
    }





    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public String getProdDesc() {
        return prodDesc;
    }
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
    public String getProdCategory() {
        return prodCategory;
    }
    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }



}