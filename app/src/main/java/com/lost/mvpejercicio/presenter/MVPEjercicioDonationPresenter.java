package com.lost.mvpejercicio.presenter;

import com.lost.mvpejercicio.model.Donation;
import com.lost.mvpejercicio.model.DonationModel;

public class MVPEjercicioDonationPresenter implements DonationPresenter {

    private DonationView donationView;
    private DonationModel donationModel;


    public MVPEjercicioDonationPresenter(DonationView donationView, DonationModel donationModel) {
        this.donationView = donationView;
        this.donationModel = donationModel;
    }

    @Override
    public void addDonation(String donation) {

        int value = stringToIntValue(donation);
        if (value >0){
            boolean isSaveDonation = donationModel.saveDonation(new Donation(value));

            if(isSaveDonation){
                donationView.displayConfirmationMessage();
                donationView.updateTotalDonation(donationModel.getTotalAmount());
                donationView.clearEditText();
            }
            else{
                donationView.displayErrorMessage();
            }
        }else{
            donationView.displayErrorMessage();
        }

    }

    @Override
    public int stringToIntValue(String value) {

        if (value.trim().isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }
}
