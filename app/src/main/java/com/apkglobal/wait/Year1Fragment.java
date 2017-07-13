package com.apkglobal.wait;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jaredrummler.materialspinner.MaterialSpinner;


public class Year1Fragment extends Fragment {

    private MaterialSpinner spinner_sem1,spinner_sem2;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.year1fragment,container,false);



        spinner_sem1=(MaterialSpinner)view.findViewById(R.id.spinner_sem1);
        spinner_sem1.setItems("Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Subject 6","Subject 7");
        spinner_sem1.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });

        spinner_sem2=(MaterialSpinner)view.findViewById(R.id.spinner_sem2);
        spinner_sem2.setItems("Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Subject 6","Subject 7");
        spinner_sem2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });


        return view;


    }

}
