package com.spring.spring_concept;

public class college {
    private int id;
    private String name;
    private String branch;

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getbranch(){
        return branch;
    }
    public void setbranch(String branch){
        this.branch = branch;
    }

    public college(int id,String name,String branch){
        super();
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public college(){
        super();
    }

    public String toString(){
        return "college [ college id = " +id+ " college name=" +name+ " branch = " +branch+ "]";
    }
}
