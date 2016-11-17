package com.example.administrator.myapplication.BaseFragment;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.widget.RadioButton;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2016/10/21 0021.
 */


public class FragmentFactory {
    private AtmeFragment atmeFragment;
    private AttentionFragment attentionFragment;
    private CommentFragment commentFragment;
    private GlobalFragment globalFragment;
    private MyListFragment myListFragment;



    public static Fragment getInstanceByIndex(int index) {
        Fragment fragment =  null;
        switch (index) {
            case 1:
                fragment = new AttentionFragment();
                break;
            case 2:
                fragment = new AtmeFragment();
                break;
            case 3:
                fragment = new CommentFragment();
                break;
            case 4:
                fragment = new MyListFragment();
                break;
            case 5:
                fragment = new GlobalFragment();
                break;
            default:
                break;
        }
        return fragment;
    }
    private void clearSelection() {

    }
    private void hideFragments(FragmentTransaction transaction) {
        if (atmeFragment != null) {
            transaction.hide(atmeFragment);
        }
        if (attentionFragment != null) {
            transaction.hide(attentionFragment);
        }
        if (commentFragment != null) {
            transaction.hide(commentFragment);
        }
        if (globalFragment != null) {
            transaction.hide(globalFragment);
        }
        if (myListFragment != null) {
            transaction.hide(myListFragment);
        }
}
}
