package com.example.pys.bndcrimeex;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {


    public static final String CRIME_ID ="";

    public static Intent newIntent(Context packageContext, UUID crimeid){

        Intent intent = new Intent(packageContext,CrimeActivity.class);
        intent.putExtra(CRIME_ID,crimeid);
        return intent;


    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
