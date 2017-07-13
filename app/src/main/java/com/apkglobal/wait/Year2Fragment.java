package com.apkglobal.wait;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaredrummler.materialspinner.MaterialSpinner;


public class Year2Fragment extends Fragment {
    private MaterialSpinner spinner_sem3,spinner_sem4;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.year2fragment,container,false);



        spinner_sem3=(MaterialSpinner)view.findViewById(R.id.spinner_sem3);
        spinner_sem3.setItems("Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Subject 6","Subject 7");
        spinner_sem3.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });

        spinner_sem4=(MaterialSpinner)view.findViewById(R.id.spinner_sem4);
        spinner_sem4.setItems("Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Subject 6","Subject 7");
        spinner_sem4.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });


        return view;
    }

}
