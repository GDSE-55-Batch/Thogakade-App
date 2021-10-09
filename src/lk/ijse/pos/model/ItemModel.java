/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c)GDSE-55-Batch. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.pos.model;

/**
 * @author Sudhara Sathyavi <sudarasathyavi6436@gmail.com>sudhara sathyavi
 * @since 10/9/2021
 */
public class ItemModel {

        private String code;
        private String description;
        private double unitPrice;
        private int qtyOnHand;

        public ItemModel() {
        }

        public ItemModel(String code, String description, double unitPrice, int qtyOnHand) {
            this.code = code;
            this.description = description;
            this.unitPrice = unitPrice;
            this.qtyOnHand = qtyOnHand;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public int getQtyOnHand() {
            return qtyOnHand;
        }

        public void setQtyOnHand(int qtyOnHand) {
            this.qtyOnHand = qtyOnHand;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "code='" + code + '\'' +
                    ", description='" + description + '\'' +
                    ", unitPrice=" + unitPrice +
                    ", qtyOnHand=" + qtyOnHand +
                    '}';
        }
    }

