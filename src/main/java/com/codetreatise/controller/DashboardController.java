package com.codetreatise.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.codetreatise.config.StageManager;
import com.codetreatise.view.FxmlView;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

@Controller
public class DashboardController {

	@FXML
    private Button btnLogout;
	
	@Lazy
    @Autowired
    private StageManager stageManager;
	
	@FXML
	private void exit(ActionEvent event) {
		Platform.exit();
    }

	/**
	 * Logout and go to the login page
	 */
    @FXML
    private void logout(ActionEvent event) throws IOException {
    	stageManager.switchScene(FxmlView.LOGIN);    	
    }

}
