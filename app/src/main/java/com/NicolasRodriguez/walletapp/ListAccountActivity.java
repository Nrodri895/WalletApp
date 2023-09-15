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
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros",10002402.0,"https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito",10002402.0,"https://s3.amazonaws.com/lacabinadavivienda.com/projects/assets_generales/img/logo-davivienda.png");
        Account myAccount3 = new Account("Efecto", "Efectivo",10002402.0,"https://mir-s3-cdn-cf.behance.net/projects/404/9a5a41101165577.Y3JvcCwxMjI3LDk2MCwyNyww.jpg");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);

    }
}