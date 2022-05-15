package com.example.ustamyanimda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UstaAdapter extends RecyclerView.Adapter<UstaAdapter.CarddViewTasarimNesneleriniTutucu> {

    private Context mContext;
    private List<Ustalar> ustalarList;

    public UstaAdapter(Context mContext, List<Ustalar> ustalarList) {
        this.mContext = mContext;
        this.ustalarList = ustalarList;
    }

    @NonNull
    @Override
    public CarddViewTasarimNesneleriniTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_tasarim,parent,false);

        return new CarddViewTasarimNesneleriniTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarddViewTasarimNesneleriniTutucu holder, int position) {

        final Ustalar usta=ustalarList.get(position);

        holder.textView_usta_bilgi1.setText(usta.getUsta_bilgi());

        holder.imageView_usta1.setImageResource(R.drawable.usta);

        holder.button_konum_gstr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button tıklanılma özelliği

            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class CarddViewTasarimNesneleriniTutucu extends RecyclerView.ViewHolder{
        public ImageView imageView_usta1;
        public TextView textView_usta_bilgi1;
        public Button button_konum_gstr1;
        public Button button_hmn_ara1;

        public CarddViewTasarimNesneleriniTutucu(@NonNull View itemView) {
            super(itemView);
            imageView_usta1=itemView.findViewById(R.id.imageview_usta1);
            textView_usta_bilgi1=itemView.findViewById(R.id.textView_usta_bilgi1);
            button_konum_gstr1=itemView.findViewById(R.id.button_konum_gstr1);
            button_hmn_ara1=itemView.findViewById(R.id.button_hmn_ara1);
        }
    }
}
