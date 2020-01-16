package com.example.viewpager_fragmet2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment  extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttach3 = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreate3 = ","called");

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateView3 = ","called");

        /*FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fm, new MyFragment());
        ft.commit();*/
        View v = inflater.inflate(R.layout.third_fragment, container, false);
        Button btn1 = (Button)v.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.root_frame, new StaticFragment());
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }
        });
        return v;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStart3 = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResume3 = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPause3 = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStop3 = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyView3 = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroy3 = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetach3 = ","called");

    }
}

