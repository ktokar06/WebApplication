package com.example.myfirsta;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingUpApplication {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SingUPButton;

    @FXML
    private TextField SingUPCountry;

    @FXML
    private CheckBox SingUpCheckBoxFame;

    @FXML
    private CheckBox SingUpCheckBoxMale;

    @FXML
    private TextField SingUpLastName;

    @FXML
    private TextField SingUpName;

    @FXML
    private TextField login_f1;

    @FXML
    private PasswordField password_f;
    private Object singUpNewUsers;

    @FXML
    void initialize() throws SQLException {
        DataBase dataBase = new DataBase();

        SingUPButton.setOnAction(event ->
        {
            singUpNewUsers();
        });
    }

    /**
     *
     */
    private void singUpNewUsers() {
        DataBase dbHandler = new DataBase();

        String Name = SingUpName.getText();
        String LastName =SingUpLastName.getText();
        String UserName = login_f1.getText();
        String Password = password_f.getText();
        String Laocation = SingUPCountry.getText();
        String Gender   = "";
        if(SingUpCheckBoxMale.isSelected())
            Gender = "Мужской";
        else
            Gender = "Женский";


        Users users = new Users(Name, LastName, UserName, Password, Laocation, Gender);

        dbHandler.SingUpUsers(users);
    }

}

