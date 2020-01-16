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

public class StaticFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttachstatic = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreatestatic = ","called");

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateViewstatic=","called");

        /*FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fm, new MyFragment());
        ft.commit();*/
        View v = inflater.inflate(R.layout.static_fragment, container, false);
        return v;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStartstatic = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResumestatic = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPausestatic = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStopstatic = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyViewstatic = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroystatic = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetachstatic = ","called");

    }
}

