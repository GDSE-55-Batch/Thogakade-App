/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c)GDSE-55-Batch. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Sudhara Sathyavi <sudarasathyavi6436@gmail.com>sudhara sathyavi
 * @since 10/9/2021
 */
public class DashBoardController {

public void openSaveCustomerOnAction(ActionEvent actionEvent) throws IOException {
    setUi("CustomerForm");
}

    public void openSaveItemOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ItemrForm");

    }

    void setUi(String location) throws IOException {

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml")));
        Stage PrimaryStage = new Stage();
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
}