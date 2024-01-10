package com.spring.spring_concept;

public class customer {

    private String name;
    private String city;
    private long mobile;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public customer(String name,String city,long mobile){
        super();
        this.name = name;
        this.city = city;
        this.mobile = mobile;
    }
    public customer(){
        super();
    }

    public String toString(){
        return "customer [ customer name = "+name+ "customer city = " +city+ "customer mobile = " +mobile+ "]";
    }
}
