package com.example.lap.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShopAdapter  extends  RecyclerView.Adapter<ShopAdapter.ViewHolder>{
    ArrayList<DataShop> dataShops;
    Context context;

    public ShopAdapter(ArrayList<DataShop> dataShops, Context context) {
        this.dataShops = dataShops;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtName.setText(dataShops.get(i).getmTen());
        viewHolder.imgHinh.setImageResource(dataShops.get(i).getmHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dataShops.size();
    }


    public void removeItem(int position){
        dataShops.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView imgHinh;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtName=(TextView) itemView.findViewById(R.id.txtName);
            imgHinh=(ImageView)itemView.findViewById(R.id.imgHinh);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   removeItem(getAdapterPosition());
                    Toast.makeText(itemView.getContext(), "Remove" + txtName.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
