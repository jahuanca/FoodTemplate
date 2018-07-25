package com.example.win8.foodtemplate.Adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.win8.foodtemplate.R;
import com.example.win8.foodtemplate.clases.Categoria;
import com.example.win8.foodtemplate.interfaces.AccionesClic;

import java.util.ArrayList;

/**
 * Created by WIN8 on 25/07/2018.
 */

public class TuOrdenAdapter extends RecyclerView.Adapter<TuOrdenAdapter.ViewHolder> {
    private ArrayList<Categoria> lista;
    private AccionesClic onAcciones;
    private Context contexto;

    public void setOnAcciones(AccionesClic onAcciones) {
        this.onAcciones = onAcciones;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(View itemView, final AccionesClic onAcciones) {
            super(itemView);
        }
    }

    public TuOrdenAdapter(ArrayList<Categoria> lista, Context contexto) {
        this.lista = lista;
        this.contexto=contexto;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_tu_orden, parent,false);
        ViewHolder viewHolder=new ViewHolder(view, onAcciones);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

}
