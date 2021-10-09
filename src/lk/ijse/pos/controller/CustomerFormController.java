/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c)GDSE-55-Batch. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.pos.controller;

import lk.ijse.pos.model.CustomerModel;

import java.sql.SQLException;

/**
 * @author Sudhara Sathyavi <sudarasathyavi6436@gmail.com>sudhara sathyavi
 * @since 10/9/2021
 */
public class CustomerFormController {

    public boolean saveCustomer(CustomerModel c) throws ClassNotFoundException, SQLException {
        return ("INSERT INTO Customer VALUES (?,?,?,?)"c.getId(), c.getName(), c.getAddress(), c.getSalary());
    }
}



