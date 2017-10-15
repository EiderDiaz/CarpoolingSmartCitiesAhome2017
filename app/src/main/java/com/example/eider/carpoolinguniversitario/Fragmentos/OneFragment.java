package com.example.eider.carpoolinguniversitario.Fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eider.carpoolinguniversitario.Modelos.DatosViaje;
import com.example.eider.carpoolinguniversitario.R;
import java.util.ArrayList;

public class OneFragment extends Fragment {

    private ArrayList<DatosViaje> listaReporte;
    /*private AdaptadorReporte ReporteAdapter;
    private RecyclerView recyclerView;
    AdminSQLiteOpenHelper admin;*/

    View mview;
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview=  inflater.inflate(R.layout.fragment_one, container, false);
        return mview;
    }


}