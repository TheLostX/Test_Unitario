package com.lost.mvpejercicio.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.lost.mvpejercicio.Controller;
import com.lost.mvpejercicio.databinding.FragmentFirstBinding;
import com.lost.mvpejercicio.model.DonationModel;
import com.lost.mvpejercicio.presenter.DonationPresenter;
import com.lost.mvpejercicio.presenter.DonationView;
import com.lost.mvpejercicio.presenter.MVPEjercicioDonationPresenter;

public class FirstFragment extends Fragment implements DonationView {

    private FragmentFirstBinding binding;
    private DonationPresenter donationPresenter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        donationPresenter = new MVPEjercicioDonationPresenter(this, new DonationModel());
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnIngresar.setOnClickListener( v -> {
            donationPresenter.addDonation(binding.etDonacion.getText().toString());
        });
    }


    private void displayMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void updateTotalDonation(int totalAmount) {
        binding.tvTotalAmount.setText(String.valueOf(totalAmount));
    }

    @Override
    public void displayConfirmationMessage() {
        displayMessage("Donacion Exitosa");
    }

    @Override
    public void displayErrorMessage() {
        displayMessage("No se pudo realizar la donacion");
    }

    @Override
    public void clearEditText() {
        binding.etDonacion.setText("");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}