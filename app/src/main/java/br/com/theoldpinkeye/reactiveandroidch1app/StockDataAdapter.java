package br.com.theoldpinkeye.reactiveandroidch1app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Just Us on 29/01/2018.
 */

public class StockDataAdapter extends RecyclerView.Adapter<StockUpdateViewHolder> {
    private final List<StockUpdate> data = new ArrayList<>();
    @Override
    public StockUpdateViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.stock_update_item, parent, false);
        StockUpdateViewHolder vh = new StockUpdateViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(StockUpdateViewHolder holder, int position) {
        StockUpdate stockUpdate = data.get(position);
        holder.setStockSymbol(stockUpdate.getStockSymbol());
        holder.setPrice(stockUpdate.getPrice());
        holder.setDate(stockUpdate.getDate());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public void add(StockUpdate stockSymbol) {
        this.data.add(stockSymbol);
        notifyItemInserted(data.size() - 1);
    }
}