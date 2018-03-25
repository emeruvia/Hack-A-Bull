package fgcu.hackabull.RecyclerAdpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fgcu.hackabull.DataObjects.Payment;
import fgcu.hackabull.R;

/**
 * Created by jeffr on 3/
 * 25/2018.
 */

public class PaymentRecyclerAdapter extends RecyclerView.Adapter<PaymentRecyclerAdapter.PaymentRecyclerViewHolder> {
    RecyclerViewOnClick recyclerViewOnClick;
    List<Payment> paymentList = new ArrayList<>();

    public PaymentRecyclerAdapter(List<Payment> paymentList, RecyclerViewOnClick recyclerViewOnClick) {
        this.recyclerViewOnClick = recyclerViewOnClick;
        this.paymentList = paymentList;
    }

    @Override
    public PaymentRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.payment_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new PaymentRecyclerAdapter.PaymentRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PaymentRecyclerAdapter.PaymentRecyclerViewHolder holder, int position) {
        //TODO add data to views

        holder.handyman.setText(paymentList.get(position).getHandymanName());
        holder.client1Name.setText(paymentList.get(position).getClientName());
        holder.paymentAmount.setText(paymentList.get(position).getAmount());
        holder.date.setText(paymentList.get(position).getDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerViewOnClick.rowSelected(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return paymentList.size();
    }

    public class PaymentRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView date;
        TextView paymentAmount;
        ImageView arrowDirection;
        TextView client1Name;
        TextView handyman;
        public PaymentRecyclerViewHolder(View view) {
            super(view);
            date = view.findViewById(R.id.transaction_date_textview);
            paymentAmount= view.findViewById(R.id.transaction_amount_textview);
            arrowDirection = view.findViewById(R.id.arrow_direction_image);
            client1Name = view.findViewById(R.id.client_name);
            handyman = view.findViewById(R.id.handy_man);

        }
    }
}