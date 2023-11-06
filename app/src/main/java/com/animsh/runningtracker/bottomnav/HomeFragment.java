package com.animsh.runningtracker.bottomnav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.animsh.runningtracker.R;


public class HomeFragment extends Fragment {

    TextView tv1, tv2, tv3, tv4, tv5;
    FindFragment findFragment;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tv1 = view.findViewById(R.id.tv_1);
        tv2 = view.findViewById(R.id.tv_2);
        tv3 = view.findViewById(R.id.tv_3);
        tv4 = view.findViewById(R.id.tv_4);
        tv5 = view.findViewById(R.id.tv_5);
        tv1.setOnClickListener(view1 -> callFindFragment());
        tv2.setOnClickListener(view1 -> callFindFragment());
        tv3.setOnClickListener(view1 -> callFindFragment());
        tv4.setOnClickListener(view1 -> callFindFragment());
        tv5.setOnClickListener(view1 -> callFindFragment());
        return view;
    }

    private void callFindFragment(){
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_up, 0, 0, R.anim.slide_down);
        findFragment = new FindFragment();
        fragmentTransaction.add(R.id.layout_fragment_main, findFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}