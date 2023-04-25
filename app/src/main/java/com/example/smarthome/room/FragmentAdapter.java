package com.example.smarthome.room;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.smarthome.R;
import com.example.smarthome.room.AllRoomFragment;
import com.example.smarthome.room.BedRoomFragment;
import com.example.smarthome.room.LivingRoomFragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentStateAdapter {


    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position  == 0) return new AllRoomFragment(getDataRoom());
        else if(position == 1) return new BedRoomFragment();
        else if(position == 2) return new LivingRoomFragment();
        else if(position == 3) return new BedRoomFragment();
        else if(position == 4) return new BedRoomFragment();
        else if(position == 5) return new LivingRoomFragment();
        else if(position == 6) return new BedRoomFragment();
        else  return new AllRoomFragment(getDataRoom());

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public List<Room> getDataRoom(){
        List<Room> lst = new ArrayList<>();
        lst.add(new Room(R.drawable.bedroom,1, "Bedroom",3));
        lst.add(new Room(R.drawable.bathroom,0, "Bathroom",2));
        lst.add(new Room(R.drawable.diningroom,0, "Dinning room",1));
        lst.add(new Room(R.drawable.livingroom,0, "Living room",1));
        lst.add(new Room(R.drawable.bedroom,1, "Bedroom",3));
        lst.add(new Room(R.drawable.bathroom,0, "Bathroom",2));
        lst.add(new Room(R.drawable.diningroom,0, "Dinning room",1));
        lst.add(new Room(R.drawable.livingroom,0, "Living room",1));
                return lst;
    }
}
