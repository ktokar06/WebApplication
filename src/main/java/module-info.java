module com.example.myfirsta {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.myfirsta to javafx.fxml;
    exports com.example.myfirsta;
    exports Animation;
    opens Animation to javafx.fxml;
}