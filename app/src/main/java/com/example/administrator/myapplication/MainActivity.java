package com.example.administrator.myapplication;

import android.annotation.TargetApi;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.app.Fragment;

import android.app.FragmentManager;

import android.app.FragmentTransaction;


import com.example.administrator.myapplication.BaseFragment.AtmeFragment;
import com.example.administrator.myapplication.BaseFragment.FragmentFactory;


public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        FragmentFactory.getInstanceByIndex(1);


        fragmentManager = getFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.rg_tab);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragment fragment = FragmentFactory.getInstanceByIndex(checkedId);
                transaction.replace(R.id.content, fragment);
                transaction.commit();
            }
        });
    }

}

