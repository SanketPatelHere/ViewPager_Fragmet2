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

public class FirstFragment<onCreateDialog> extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttach1 = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreate1 = ","called");

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateView1 = ","called");

        /*FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fm, new MyFragment());
        ft.commit();*/
        View v = inflater.inflate(R.layout.first_fragment, container, false);
        Button btn2 = (Button)v.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.root_frame, new SecondFragment(), "aaa");
                    //ft.add(R.id.root_frame, new SecondFragment(), "aaa"); //target tag
                    ft.addToBackStack("aaaa"); //source tag
                    ft.commit();
                }
                catch (Exception e)
                {
                    Log.i("My Error1 = ",e+"");
                }


            }
        });
        return v;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStart1 = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResume1 = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPause1 = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStop1 = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyView1 = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroy1 = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetach1 = ","called");

    }
}

