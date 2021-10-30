package com.lost.mvpejercicio.model;

import com.lost.mvpejercicio.model.Donation;

public class DonationModel {

    private int totalAmount;

    public DonationModel(){
        this.totalAmount = 0;
    }

    public boolean saveDonation(Donation donation){
        this.totalAmount += donation.getAmount();
        return true;
    }

    public int getTotalAmount(){
        return totalAmount;
    }


}
