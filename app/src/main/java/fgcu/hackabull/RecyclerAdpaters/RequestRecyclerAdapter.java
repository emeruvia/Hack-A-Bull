package fgcu.hackabull.RecyclerAdpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fgcu.hackabull.DataObjects.Request;
import fgcu.hackabull.R;

/**
 * Created by jeffr on 3/25/2018.
 */

public class RequestRecyclerAdapter extends RecyclerView.Adapter<RequestRecyclerAdapter.RequestRecyclerViewHolder> {
    RecyclerViewOnClick recyclerViewOnClick;
    List<Request> requestList = new ArrayList<>();

    public RequestRecyclerAdapter(List<Request> requestList, RecyclerViewOnClick recyclerViewOnClick) {
        this.recyclerViewOnClick = recyclerViewOnClick;
        this.requestList = requestList;
    }

    @Override
    public RequestRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.request_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new RequestRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RequestRecyclerViewHolder holder, int position) {


        holder.helpType.setText(requestList.get(position).getTypeOfHelp());
        holder.helpTime.setText(requestList.get(position).getTime());
        holder.helpLocation.setText(requestList.get(position).getLocation());
        holder.helpDate.setText(requestList.get(position).getDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerViewOnClick.rowSelected(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return requestList.size();
    }

    public class RequestRecyclerViewHolder extends RecyclerView.ViewHolder {
            TextView helpType;
            TextView helpDate;
            TextView helpTime;
            TextView helpLocation;


        public RequestRecyclerViewHolder(View view) {
            super(view);
        helpDate = view.findViewById(R.id.help_date_textview);
        helpLocation = view.findViewById(R.id.help_location_textview);
        helpTime = view.findViewById(R.id.help_time_textview);
        helpType = view.findViewById(R.id.help_type_textview);
        }
    }
}