package com.NicolasRodriguez.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV= new ArrayList<>();

    private RecyclerView myRecyclerAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecyclerAccount = findViewById(R.id.rv_list_account);
        AccountAdapter  myAdaptador = new AccountAdapter(listAccountRV);
        myRecyclerAccount.setAdapter(myAdaptador);
        myRecyclerAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));

    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros",10002402.0);
        Account myAccount2 = new Account("Davivienda", "Cuenta debito",10002402.0);
        Account myAccount3 = new Account("Efecto", "Efectivo",10002402.0);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);

    }
}