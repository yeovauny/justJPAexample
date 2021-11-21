package com.tyr.service.ls.pagingsorting.domain.model;


import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductModel.ProductModelRequestBuilder builder(){
        return new ProductModel.ProductModelRequestBuilder();
    }

    public static class ProductModelRequestBuilder{
        private String name;

        private double price;

        private String description;

        public ProductModelRequestBuilder withName(String name){
            this.name = name;
            return this;
        }

        public ProductModelRequestBuilder withPrice(double price){
            this.price = price;
            return this;
        }

        public ProductModelRequestBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public ProductModel build(){
            ProductModel productModel = new ProductModel();
            productModel.setName(name);
            productModel.setDescription(description);
            productModel.setPrice(price);
            return productModel;
        }


    }

}
