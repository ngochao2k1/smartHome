package com.example.smarthome.room;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smarthome.AdapterDevices;
import com.example.smarthome.LampActivity;
import com.example.smarthome.R;
import com.example.smarthome.devices;
import com.example.smarthome.onItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class BedRoomFragment extends Fragment implements onItemClickListener {
    private List<devices> lstRoom;
    private RecyclerView rcv_devices;
    private AdapterDevices adapterDevices;

    public BedRoomFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        rcv_devices = view.findViewById(R.id.recyclerview);
        rcv_devices.setHasFixedSize(true);

        adapterDevices = new AdapterDevices(this);

        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getContext(), 2);
        rcv_devices.setLayoutManager(linearLayoutManager);

        getData();

        adapterDevices.SetData(lstRoom);
        rcv_devices.setAdapter(adapterDevices);

        return view;
    }

    private void getData() {
        lstRoom = new ArrayList<>();

        lstRoom.add(new devices(R.drawable.temperature,"NhietDo",25));
        lstRoom.add(new devices(R.drawable.humidity,"NhietDo",12));
        lstRoom.add(new devices(R.drawable.gas_detector,"Gas",90));
        lstRoom.add(new devices(R.drawable.lamp_on,"Lamp",0));
    }

    @Override
    public void onItemClick(int position) {
        Log.i("intent", "onItemClick: ");
        if(lstRoom.get(position).getName().equals("Lamp")){
            Intent intent = new Intent(getActivity(), LampActivity.class);
            startActivity(intent);
        }
    }
}