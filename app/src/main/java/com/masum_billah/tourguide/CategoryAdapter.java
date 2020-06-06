package com.masum_billah.tourguide;

import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private int[] tabIcons = {
            R.drawable.baseline_pin_drop_white_18,
            R.drawable.baseline_restaurant_white_18,
            R.drawable.baseline_shopping_basket_white_18,
            R.drawable.baseline_hotel_white_18,
    };

    public CategoryAdapter(@NonNull FragmentManager fm, int behavior, Context mContext) {
        super(fm, behavior);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new PlacesFragment();
        }else if(position == 1){
            return new RestaurantsFragment();
        }else if(position == 2){
            return new ShopsFragment();
        }else{
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    /*Added icon on each tabs*/
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void setupTabIcons(TabLayout categoryTabs) {
        Objects.requireNonNull(categoryTabs.getTabAt(0)).setIcon(tabIcons[0]);
        Objects.requireNonNull(categoryTabs.getTabAt(1)).setIcon(tabIcons[1]);
        Objects.requireNonNull(categoryTabs.getTabAt(2)).setIcon(tabIcons[2]);
        Objects.requireNonNull(categoryTabs.getTabAt(3)).setIcon(tabIcons[3]);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.category_places);
        }else if(position == 1){
            return mContext.getString(R.string.category_restaurants);
        }else if(position == 2){
            return mContext.getString(R.string.category_shops);
        }else{
            return mContext.getString(R.string.category_hotel);
        }
    }

}
