/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */
package com.codename1.payment;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulates a receipt for an in-app purchase.
 * @author shannah
 */
public class Receipt implements Externalizable {

    /**
     * @param aExternalizableRegistered the externalizableRegistered to set
     */
    private static void setExternalizableRegistered(boolean aExternalizableRegistered) {
        externalizableRegistered = aExternalizableRegistered;
    }
    private String sku;
    private Date expiryDate;
    private Date cancellationDate;
    private Date purchaseDate;
    private int quantity;
    private String transactionId;
    private String orderData;
    
    
    private static boolean externalizableRegistered;

    public Receipt() {

    }
    
    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the expiryDate
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getVersion() {
        return 1;
    }

    public void externalize(DataOutputStream out) throws IOException {
        Map m = new HashMap();
        m.put("sku", getSku());
        m.put("expiryDate", getExpiryDate());
        m.put("cancellationDate", getCancellationDate());
        m.put("purchaseDate", getPurchaseDate());
        m.put("orderData", getOrderData());
        m.put("transactionId", getTransactionId());
        m.put("quantity", getQuantity());

        Util.writeObject(m, out);
        
    }

    public void internalize(int version, DataInputStream in) throws IOException {
        Map m = (Map)Util.readObject(in);
        setSku((String)m.get("sku"));
        setExpiryDate((Date)m.get("expiryDate"));
        cancellationDate = (Date)m.get("cancellationDate");
        purchaseDate = (Date)m.get("purchaseDate");
        quantity = (Integer)m.get("quantity");
        transactionId = (String)m.get("transactionId");
        orderData = (String)m.get("orderData");
        

    }

    public String getObjectId() {
        return "com.codename1.payment.Receipt";
    }
    
    static boolean isExternalizableRegistered() {
        return externalizableRegistered;
    }
    
    static void registerExternalizable() {
        if (!isExternalizableRegistered()) {
            Util.register("com.codename1.payment.Receipt", Receipt.class);
            setExternalizableRegistered(true);
        }
        
    }

    /**
     * @return the cancellationDate
     */
    public Date getCancellationDate() {
        return cancellationDate;
    }

    /**
     * @param cancellationDate the cancellationDate to set
     */
    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    /**
     * @return the purchaseDate
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param originalPurchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(Date originalPurchaseDate) {
        this.purchaseDate = originalPurchaseDate;
    }



    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * @return the orderData
     */
    public String getOrderData() {
        return orderData;
    }

    /**
     * @param orderData the orderData to set
     */
    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    
}
