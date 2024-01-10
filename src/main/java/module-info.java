module com.spring.spring_concept {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;


    opens com.spring.spring_concept to javafx.fxml;
    exports com.spring.spring_concept;
}