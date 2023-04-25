package com.example.smarthome;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthome.R;

import java.util.List;

public class AdapterDevices  extends RecyclerView.Adapter<AdapterDevices.devicesViewHolder>{
    //private Context mContext;
    private List<devices> list_devices ;
    private onItemClickListener listener;


    public AdapterDevices( onItemClickListener listener) {
        this.listener = listener;
    }
    public void SetData(List<devices> l){
        this.list_devices = l;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public devicesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_devices,parent,false);
        return new devicesViewHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull devicesViewHolder holder, int position) {
        devices d = list_devices.get(position);

        holder.img_devices.setImageResource(d.getResource());
        holder.tv_index.setText(d.getIndex() + "°" );
        holder.img_status.setImageResource(R.drawable.normal);
        holder.tv_status.setText("Normal");
    }

    @Override
    public int getItemCount() {
        return list_devices.size();
    }

    public class devicesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView img_devices,img_status;
        private TextView tv_index,tv_status;
        private onItemClickListener listener;

        public devicesViewHolder(@NonNull View itemView, onItemClickListener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            img_status = itemView.findViewById(R.id.img_warning);
            tv_status = itemView.findViewById(R.id.tv_status);
            img_devices = itemView.findViewById(R.id.img_devices);
            tv_index = itemView.findViewById(R.id.tv_index);
        }

        @Override
        public void onClick(View view) {
            listener.onItemClick(getAdapterPosition());
        }
    }
}
