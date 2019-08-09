package com.example.learningenglish.lesson1;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.learningenglish.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context context;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return TheoryFragment.newInstance(position + 1);
        else
            return TestFragment.newInstance(position+1,context);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}