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

public class RootFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttachroot = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreateroot = ","called");

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateViewroot = ","called");

        /*FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fm, new MyFragment());
        ft.commit();*/
        View v = inflater.inflate(R.layout.root_fragment, container, false);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.root_frame, new FirstFragment());
                ft.commit();

        return v;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStartroot = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResumeroot = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPauseroot = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStoproot = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyViewroot = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroyroot = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetachroot = ","called");

    }
}

