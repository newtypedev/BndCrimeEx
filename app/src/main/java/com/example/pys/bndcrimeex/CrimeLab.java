package com.example.pys.bndcrimeex;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by pys on 2017. 8. 31..
 */

public class CrimeLab {

    private static CrimeLab crimeLab;
    private List<Crime> crimes;

    public static CrimeLab get(Context context){
        if(crimeLab == null){
            crimeLab = new CrimeLab(context);
        }
        return crimeLab;
    }

    private CrimeLab(Context context){
        crimes = new ArrayList<>();
        for(int i=0;i<3;i++){
            Crime crime = new Crime();
            crime.setTitle("상담일지"+i);
            crime.setSolved(i%2 ==0 );
            crimes.add(crime);
        }
    }
    public void deleteItem(UUID id){

        for(Crime crime:crimes){
            if(crime.getId().equals(id)){
                crimes.remove(crime);
                Log.v("삭제",crimes.size()+"");
                return;
            }
    }

    }

    public List<Crime> getCrimes(){
        return crimes;
    }
    public Crime getCrime(UUID id){
        for(Crime crime:crimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

}
