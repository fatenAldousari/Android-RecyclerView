package com.joincoded.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import adapter.currencyAccountAdapter;

public class MainActivity extends AppCompatActivity {
RecyclerView currenciesRecyclerView;
ArrayList<Currency> currencyAccount = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addcurrencyAccount();

        currenciesRecyclerView = findViewById(R.id.currenciesRecyclerView);
        currenciesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        currencyAccountAdapter currencyaccountadapter = new currencyAccountAdapter(currencyAccount);
        currenciesRecyclerView.setAdapter(currencyaccountadapter);

    }
    private void addcurrencyAccount(){
       // for(int i=0; i<10 ;i++){
            Currency currency = new Currency("USD",3.25,"US dollar");
            Currency eurcurrency = new Currency("EUR",0.9132,"Europe Euro");
        Currency kuweurcurrency = new Currency("KWD",4.9132,"Kuwaiti Dinar");
        Currency gbpeurcurrency = new Currency("GBP",1.43,"British Pound");
            currencyAccount.add(currency);
            currencyAccount.add(eurcurrency);
        currencyAccount.add(kuweurcurrency);
        currencyAccount.add(gbpeurcurrency);

        //}

    }
}