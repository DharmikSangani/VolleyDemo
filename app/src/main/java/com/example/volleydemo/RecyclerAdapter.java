package com.example.volleydemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycleHolder> {

    MainActivity2 mainActivity2;
    ArrayList<Data_Model> dataModelList=new ArrayList<>();

    public RecyclerAdapter(MainActivity2 mainActivity2, ArrayList<Data_Model> dataModelList) {
        this.mainActivity2 = mainActivity2;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity2).inflate(R.layout.activity_main2_item,parent,false);
        RecycleHolder holder=new RecycleHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecycleHolder holder, int position) {

        holder.nameitem.setText(""+dataModelList.get(position).getName());
        holder.usernameitem.setText(""+dataModelList.get(position).getUsername());
        holder.phoneitem.setText(""+dataModelList.get(position).getPhone());
        holder.emailitem.setText(""+dataModelList.get(position).getEmail());
        holder.websiteitem.setText(""+dataModelList.get(position).getWebsite());

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public class RecycleHolder extends RecyclerView.ViewHolder {
        EditText nameitem,usernameitem,phoneitem,emailitem,websiteitem;
        public RecycleHolder(@NonNull View itemView) {
            super(itemView);


            nameitem = itemView.findViewById(R.id.item_name);
            usernameitem = itemView.findViewById(R.id.item_username);
            phoneitem = itemView.findViewById(R.id.item_phone);
            emailitem = itemView.findViewById(R.id.item_email);
            websiteitem = itemView.findViewById(R.id.item_website);

        }
    }
}
