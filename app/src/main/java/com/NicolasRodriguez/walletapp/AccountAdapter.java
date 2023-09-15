package com.NicolasRodriguez.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AccountAdapter  extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

    private ArrayList<Account> dataset;

    public AccountAdapter(ArrayList<Account> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_accounts_list,parent,false);
        return new ViewHolder(myView);
    }
    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount = dataset.get(position);
        holder.loadInfo(myAccount);

    }
    @Override
    public int getItemCount() {
        return dataset.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameAccount,tvTypeAccount,tvCurrentValue;

        private ImageView ivprincipal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameAccount = itemView.findViewById(R.id.tv_item_name_account);
            tvTypeAccount = itemView.findViewById(R.id.tv_item_type_balance);
            tvCurrentValue = itemView.findViewById(R.id.tv_item_balance_account);
            ivprincipal = itemView.findViewById(R.id.iv_item_account);
        }

        public void loadInfo(Account myAccount) {
            tvNameAccount.setText(myAccount.getName());
            tvTypeAccount.setText(myAccount.getType());
            tvCurrentValue.setText(String.valueOf(myAccount.getCurrentvalue()));

            Picasso.get().load(myAccount.getImageUrl()).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(ivprincipal);
        }
    }



}
