package com.example.solierboix.calculator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.solierboix.calculator.R;

import java.util.List;

/**
 * Created by Solierboix on 18.03.2017.
 */

public class TabFragment1 extends Fragment {

    private ListView playersList;
    private ArrayAdapter playerAdapter;
    private String[] items;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment1, container, false);

        items = getActivity().getResources().getStringArray(R.array.players_array);
        playersList = (ListView)view.findViewById(R.id.saveListView);

        playerAdapter = new ArrayAdapter<String>(view.getContext(), R.layout.tab_fragment1, items);

        playersList.setAdapter(playerAdapter);
        return view;


    }
}
