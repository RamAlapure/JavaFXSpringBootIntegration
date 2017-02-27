package com.codetreatise.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.codetreatise.config.StageManager;
import com.codetreatise.service.UserService;
import com.codetreatise.view.FxmlView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author Ram Alapure
 * @since 05-02-2016
 */

@Controller
public class LoginController {

	@FXML
    private Button btnLogin;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label lblLogin;
    
    @Autowired
    private UserService userService;
    
    @Lazy
    @Autowired
    private StageManager stageManager;
        
	@FXML
    private void login(ActionEvent event) throws IOException{
    	if(userService.authenticate(getUsername(), getPassword())){
    		//lblLogin.setText("Login successful.");
    		
    		stageManager.switchScene(FxmlView.MAIN);
    		
    	}else{
    		lblLogin.setText("Login Failed");
    	}
    }
	
	public String getPassword() {
		return password.getText();
	}

	public String getUsername() {
		return username.getText();
	}


}
