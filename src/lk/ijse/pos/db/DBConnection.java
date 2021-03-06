/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c)GDSE-55-Batch. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Sudhara Sathyavi <sudarasathyavi6436@gmail.com>sudhara sathyavi
 * @since 10/9/2021
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "9999");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            return dBConnection = new DBConnection();
        } else {
            return dBConnection;
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
