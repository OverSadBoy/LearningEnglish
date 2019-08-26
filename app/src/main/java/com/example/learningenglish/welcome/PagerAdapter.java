package com.example.learningenglish.welcome;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {

    private Context context;

    PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position < 4)
            return FirstPoolFragment.newInstance(position + 1);
        else if (position < 6)
            return SecondPoolFragment.newInstance(position + 1);
        else if (position == 6)
            return ThreePoolFragment.newInstance(position + 1);
        else
            return MeetFragment.newInstance(position + 1, context);
    }

    @Override
    public int getCount() {
        return 8;
    }
}