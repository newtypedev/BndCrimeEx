package com.example.pys.bndcrimeex;

import android.support.v4.app.Fragment;

/**
 * Created by pys on 2017. 8. 31..
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
