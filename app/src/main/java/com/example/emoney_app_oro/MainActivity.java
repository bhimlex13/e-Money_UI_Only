package com.example.emoney_app_oro;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView;

public class MainActivity extends AppCompatActivity {

    SpeedDialView speedDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speedDial = findViewById(R.id.speedDial);

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_deposit, R.drawable.ic_deposit)
                .setLabel("In-store Deposit")
                .create());

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_send, R.drawable.ic_send)
                .setLabel("Send/Transfer")
                .create());

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_scanqr, R.drawable.ic_scan_qr)
                .setLabel("Scan QR")
                .create());

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_withdraw, R.drawable.ic_withdraw)
                .setLabel("Withdraw")
                .create());

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_paybills, R.drawable.ic_pay_bills)
                .setLabel("Pay Bills")
                .create());

        speedDial.addActionItem(new SpeedDialActionItem.Builder(R.id.fab_buyload, R.drawable.ic_buy_load)
                .setLabel("Buy Load")
                .create());

        // Handle clicks on FAB menu items
        speedDial.setOnActionSelectedListener(actionItem -> {
            switch (actionItem.getId()) {
                case R.id.fab_deposit:
                    Toast.makeText(this, "In-store Deposit Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab_send:
                    Toast.makeText(this, "Send/Transfer Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab_scanqr:
                    Toast.makeText(this, "Scan QR Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab_withdraw:
                    Toast.makeText(this, "Withdraw Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab_paybills:
                    Toast.makeText(this, "Pay Bills Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab_buyload:
                    Toast.makeText(this, "Buy Load Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;  // close FAB menu after click
        });
    }
}