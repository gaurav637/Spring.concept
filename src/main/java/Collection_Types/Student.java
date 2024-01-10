package Collection_Types;

import java.util.List;
import java.util.Set;
import java.util.Map;
public class Student {

    private String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String,String> course;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Student(String name,List phone,Set address,Map course){
        super();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
    }

    public Student(){
        super();
    }

    public String toString(){
        return " Student [ student name= " + name + " student phone = "
                + phone + " student address "  + address + " course = " + course + "]";
    }
}
