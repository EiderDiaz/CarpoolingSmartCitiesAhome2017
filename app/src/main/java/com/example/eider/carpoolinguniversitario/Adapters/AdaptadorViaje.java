package com.example.eider.carpoolinguniversitario.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eider.carpoolinguniversitario.Modelos.DatosViaje;
import com.example.eider.carpoolinguniversitario.R;

import java.util.ArrayList;

/**
 * Created by Eider on 14/10/2017.
 */
/*
public class AdaptadorViaje extends RecyclerView.Adapter<AdaptadorViaje.MyViewHolder> {

    private ArrayList<DatosViaje> datosDeVueloList;



    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView pilot,fecha, agricol, lote,fechaHoraInicio,fechaHoraFin,dronID,camara,baterias;

        public MyViewHolder(View view) {
            super(view);
            pilot = (TextView) view.findViewById(R.id.pilotReporte);
            fecha = (TextView) view.findViewById(R.id.fechaReporte);
            agricol = (TextView) view.findViewById(R.id.agricolaReporte);
            lote = (TextView) view.findViewById(R.id.loteReporte);
            fechaHoraInicio = (TextView) view.findViewById(R.id.fechaHoraInicioReporte);
            fechaHoraFin = (TextView) view.findViewById(R.id.fechaHoraFinReporte);
            dronID = (TextView) view.findViewById(R.id.dronidReporte);
            camara = (TextView) view.findViewById(R.id.camarasREPORTE);
            baterias = (TextView) view.findViewById(R.id.bateriasREPORTE);


        }


    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.renglonreporte, parent, false);
        return new MyViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        DatosVuelo datosvuelo = datosDeVueloList.get(position);
        holder.pilot.setText("Piloto: " + datosvuelo.getPiloto());
        holder.fecha.setText("Fecha: " + datosvuelo.getFecha());
        holder.agricol.setText("Agricola: " + datosvuelo.getagricola());
        holder.lote.setText("Lote: " + datosvuelo.getlote());
        holder.fechaHoraInicio.setText("Despegue:" + datosvuelo.getFechaHoraInicio());
        holder.fechaHoraFin.setText("Aterrizaje: " + datosvuelo.getFechaHoraFin());
        holder.dronID.setText("Drone: " + datosvuelo.getdronID());
        holder.camara.setText("Camara: " + datosvuelo.getcamara());
        holder.baterias.setText("Baterias: " + datosvuelo.getBaterias());

    }

    @Override
    public int getItemCount() {
        return datosDeVueloList.size();
    }
    @Override
    public void onViewRecycled(MyViewHolder holder) {
        holder.itemView.setOnClickListener(null);
        super.onViewRecycled(holder);
    }
}
*/