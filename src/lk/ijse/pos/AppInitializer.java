/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c)GDSE-55-Batch. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.pos;
/**
 * @author Sudhara Sathyavi <sudarasathyavi6436@gmail.com>sudhara sathyavi
 * @since 10/9/2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass()
                .getResource("view/DashBoar.fxml"))));
        primaryStage.show();
    }
}
