package com.example.solierboix.calculator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.solierboix.calculator.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Solierboix on 18.03.2017.
 */

public class TabFragment1 extends Fragment {


    private View view = null;
    private ArrayAdapter playerAdapter;
    private String[] items;
    @BindView(R.id.ButterKnifeTextView) TextView ButterText;
    @BindView(R.id.saveListView) ListView playersList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tab_fragment1, container, false);
        ButterKnife.bind(this, view);
        setAdapterToListView();

        ButterText.setText("TestTest");
        return view;


    }

    private void setAdapterToListView() {
        items = getActivity().getResources().getStringArray(R.array.players_array);
        playerAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        playersList.setAdapter(playerAdapter);
    }
}
