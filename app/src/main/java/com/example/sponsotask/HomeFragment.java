package com.example.sponsotask;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private ViewPager myViewpager;
    private TabLayout myTabLayout;
    private TabsAccessorAdapter myTabAccessorAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View output  = inflater.inflate(R.layout.fragment_home, container, false);

        myViewpager = output.findViewById(R.id.main_tabs_pager);
        myTabAccessorAdapter = new TabsAccessorAdapter(getFragmentManager());
        myViewpager.setAdapter(myTabAccessorAdapter);

        myTabLayout = output.findViewById(R.id.main_tabs);
        myTabLayout.setupWithViewPager(myViewpager);

        return output;
    }

}
