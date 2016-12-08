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

/**
 * Represents a product within the system
 *
 * @author Shai Almog
 */
public class Product {

    
    public static enum SubscriptionPeriodUnit {
        DAYS,
        WEEKS,
        MONTHS,
        YEARS
    }
    
    private String displayName;
    private String description;
    private String localizedPrice;
    private String sku;
    private boolean subscription;
    private int subscriptionPeriod;
    private SubscriptionPeriodUnit subscriptionPeriodUnits;

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the localizedPrice
     */
    public String getLocalizedPrice() {
        return localizedPrice;
    }

    /**
     * @param localizedPrice the localizedPrice to set
     */
    public void setLocalizedPrice(String localizedPrice) {
        this.localizedPrice = localizedPrice;
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
     * @return the subscription
     */
    private boolean isSubscription() {
        return subscription;
    }

    /**
     * @param subscription the subscription to set
     */
    private void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    /**
     * @return the subscriptionPeriod
     */
    private int getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    /**
     * @param subscriptionPeriod the subscriptionPeriod to set
     */
    private void setSubscriptionPeriod(int subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    /**
     * @return the subscriptionPeriodUnits
     */
    private SubscriptionPeriodUnit getSubscriptionPeriodUnits() {
        return subscriptionPeriodUnits;
    }

    /**
     * @param subscriptionPeriodUnits the subscriptionPeriodUnits to set
     */
    private void setSubscriptionPeriodUnits(SubscriptionPeriodUnit subscriptionPeriodUnits) {
        this.subscriptionPeriodUnits = subscriptionPeriodUnits;
    }
    
}
