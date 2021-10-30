package com.lost.mvpejercicio;

import com.lost.mvpejercicio.model.Donation;
import com.lost.mvpejercicio.model.DonationModel;

public class Controller {

    private DonationModel model;

    public Controller(){
        model = new DonationModel();
    }

    public boolean save(int amount){

        if(amount <=0){
            return false;
        }
        else{
            model.saveDonation(new Donation(amount));
        }
        return true;
    }

    public int getTotalAmount(){
        return model.getTotalAmount();
    }
}
