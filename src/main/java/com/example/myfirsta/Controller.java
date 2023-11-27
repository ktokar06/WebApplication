package com.example.myfirsta;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Animation.Shake;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSinginButton;

    @FXML
    private TextField login_f;

    @FXML
    private PasswordField password_f;

    @FXML
    private Button LoginSingUp;

    @FXML
    void initialize() {

        authSinginButton.setOnAction(event ->
        {
            String loginText = login_f.getText().trim();
            String loginpassword = password_f.getText().trim();

            if (!loginText.equals("") && !loginpassword.equals(""))
                loginUser(loginText, loginpassword);
            else
                System.out.println("Error");
        });

        LoginSingUp.setOnAction(actionEvent ->{
            openNewScene("SingUp.fxml");
        });
    }




    private void  loginUser(String loginText, String loginPassword)
    {
        DataBase dbHandler = new DataBase();

        Users users = new Users();
        users.setUserName(loginText);
        users.setPassword(loginPassword);
        dbHandler.getUsers(users);
        ResultSet resultSet = dbHandler.getUsers(users);

        int counter = 0;

        try {
            while (resultSet.next())
            {
                counter++;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        if(counter >= 1)
        {
            openNewScene("h2-view.fxml");
        }
        else
        {
            Shake userLoginAnim = new Shake(login_f);
            Shake userPassAnim = new Shake(password_f);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();
        }
    }
    public  void  openNewScene(String window)
    {
        LoginSingUp.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
}

