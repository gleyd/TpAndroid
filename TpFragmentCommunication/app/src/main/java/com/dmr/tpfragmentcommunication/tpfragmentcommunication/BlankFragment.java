package com.dmr.tpfragmentcommunication.tpfragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dmr.tpfragmentcommunication.tpfragmentcommunication.dummy.DummyContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    TextView detail;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_blank,container,false);
        String description = getArguments().getString("DESCRIPTION");
        detail = layout.findViewById(R.id.detail);

        if(description != null){
            detail.setText(description);
        }
        return layout;
    }

    public void setTheDetail(DummyContent.DummyItem item){
        detail.setText(item.toString());
    }
}
