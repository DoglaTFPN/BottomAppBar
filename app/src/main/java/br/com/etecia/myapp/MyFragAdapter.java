package br.com.etecia.myapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragAdapter extends FragmentPagerAdapter {]

    private Context myContext;
    int totalTabs;

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
