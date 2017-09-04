package com.example.pys.bndcrimeex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by pys on 2017. 8. 31..
 */

public class CrimeListActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment() {

        return new CrimeListFragment();
    }


}
