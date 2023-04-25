package com.example.smarthome.room;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smarthome.R;

import java.util.List;

public class AllRoomFragment extends Fragment {
    private List<Room> lstRoom;
    private RecyclerView rcv_room;
    private RoomAdapter roomAdapter;
    public AllRoomFragment(List<Room> lstRoom) {
        // Required empty public constructor
        this.lstRoom = lstRoom;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        //binding listener
        rcv_room = view.findViewById(R.id.recyclerview);
        rcv_room.setHasFixedSize(true);

        roomAdapter = new RoomAdapter(getContext());

        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getContext(), 2);
        rcv_room.setLayoutManager(linearLayoutManager);

        roomAdapter.setDataRoom(lstRoom);
        rcv_room.setAdapter(roomAdapter);

        return view;
    }
}