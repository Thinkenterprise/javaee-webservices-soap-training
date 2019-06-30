package org.openmes.jws.jaxb.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="ProductsType")
public class Products {

       protected List<Product> product;

   
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
    }

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
