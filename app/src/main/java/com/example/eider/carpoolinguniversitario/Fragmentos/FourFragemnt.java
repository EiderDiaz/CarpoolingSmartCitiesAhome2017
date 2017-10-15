package com.example.eider.carpoolinguniversitario.Fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eider.carpoolinguniversitario.R;

import org.json.JSONObject;

import java.net.URL;


public class FourFragemnt extends Fragment {
    public FourFragemnt() {
    }

    TextView welcome;
    ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Rootview= inflater.inflate(R.layout.fragment_four_fragemnt, container, false);
        welcome = (TextView) Rootview.findViewById(R.id.welcome);

                return Rootview;
    }
}