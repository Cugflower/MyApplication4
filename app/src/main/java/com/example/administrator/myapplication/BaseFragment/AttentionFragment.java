package com.example.administrator.myapplication.BaseFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.fdfdg;

/**
 * Created by Administrator on 2016/10/21 0021.
 */


public class AttentionFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attentionfragment, null);
        Button btn = (Button)view.findViewById(R.id.btn_enter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),fdfdg.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public String getContent() {
        return null;
    }
}
