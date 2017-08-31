package com.example.pys.bndcrimeex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pys on 2017. 8. 31..
 */

public class CrimeListFragment extends Fragment{

    private RecyclerView crimeRecyclerView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crime_list,container,false);
        crimeRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        crimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));




        return view;
    }

    private class CrimeHolder extends RecyclerView.ViewHolder{
        public CrimeHolder(View itemView) {
            super(itemView);
        }
    }


}