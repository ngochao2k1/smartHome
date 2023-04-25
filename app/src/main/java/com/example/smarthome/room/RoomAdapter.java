package com.example.smarthome.room;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthome.R;

import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {
    private Context mContext;
    private List<Room> lstRoom;

    public RoomAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setDataRoom(List<Room> l){
        this.lstRoom = l;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_room,parent,false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        Room currRoom = lstRoom.get(position);
        if(currRoom == null) return;

        switch (currRoom.getNameRoom()){
            case "Bedroom" :
                holder.tvNameRoom.setText("Bedroom");
                holder.imgRoom.setImageResource(R.drawable.bedroom);
                break;
            case "Living room" :
                holder.tvNameRoom.setText("Living Room");
                holder.imgRoom.setImageResource(R.drawable.livingroom);
                break;
            case "Bathroom" :
                holder.tvNameRoom.setText("Bathroom");
                holder.imgRoom.setImageResource(R.drawable.bathroom);
                break;
            default:
                holder.tvNameRoom.setText("Dinning Room");
                holder.imgRoom.setImageResource(R.drawable.diningroom);
                break;
        }
        holder.tvDevices.setText(currRoom.getNumberDevices() + " Devices");
        int checkSwitch = currRoom.getSwitchRoom();
        if(checkSwitch ==1){
            holder.aSwitch.setChecked(true);
            holder.aSwitch.setText("On");
        }else{
            holder.aSwitch.setChecked(false);
            holder.aSwitch.setText("Off");
        }


        holder.aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    holder.aSwitch.setText("On");
                }else{
                    holder.aSwitch.setText("Off");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstRoom.size();
    }

    public class RoomViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgRoom;
        private TextView tvNameRoom,tvDevices;
        private Switch aSwitch;

        public RoomViewHolder(@NonNull View itemView) {
            super(itemView);
            imgRoom = itemView.findViewById(R.id.image_room);
            tvNameRoom = itemView.findViewById(R.id.room_name);
            tvDevices = itemView.findViewById(R.id.number_devices);
            aSwitch = itemView.findViewById(R.id.switch_room);
        }
    }
}
