package br.com.theoldpinkeye.reactiveandroidch1app;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Just Us on 29/01/2018.
 */

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.stock_item_symbol)
    TextView stockSymbol;
    public StockUpdateViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }
}