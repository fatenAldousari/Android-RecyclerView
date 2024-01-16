package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.androidrecyclerview.Currency;
import com.joincoded.androidrecyclerview.R;

import java.util.ArrayList;

public class currencyAccountAdapter extends RecyclerView.Adapter<currencyAccountAdapter.currencyAccountviewholder> {
 ArrayList<Currency>accountlist;

    public currencyAccountAdapter(ArrayList<Currency>accountlist){
        this.accountlist = accountlist;
    }
    @NonNull
    @Override
    public currencyAccountviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currencyaccountitem,
                parent,false);


        return new currencyAccountviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull currencyAccountviewholder holder, int position) {
        Currency currency = accountlist.get(position);
        holder.nametextview.setText(currency.getCurrencyName());
        holder.currencycodetextview.setText(currency.getCurrencyCode());
        holder.ratetextview.setText(String.valueOf(currency.getExchangeRate()));

    }

    @Override
    public int getItemCount() {
        return accountlist.size();
    }


   public static class currencyAccountviewholder extends RecyclerView.ViewHolder{
        TextView nametextview;
       TextView currencycodetextview;
       TextView ratetextview;

        public currencyAccountviewholder(@NonNull View itemView) {
            super(itemView);
            nametextview = itemView.findViewById(R.id.accountnametextview);
            currencycodetextview = itemView.findViewById(R.id.currencycodetextview);
            ratetextview = itemView.findViewById(R.id.ratetextview);
        }
    }
}
