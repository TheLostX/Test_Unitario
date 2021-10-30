package com.lost.mvpejercicio.presenter;

public interface DonationView {

    void updateTotalDonation(int totalAmount);
    void displayConfirmationMessage();
    void displayErrorMessage();
    void clearEditText();
}
