package fgcu.hackabull;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import fgcu.hackabull.DataObjects.Payment;
import fgcu.hackabull.DataObjects.Request;
import fgcu.hackabull.RecyclerAdpaters.PaymentRecyclerAdapter;
import fgcu.hackabull.RecyclerAdpaters.RecyclerViewOnClick;
import fgcu.hackabull.RecyclerAdpaters.RequestRecyclerAdapter;

public class RequestListActivity extends AppCompatActivity implements RecyclerViewOnClick {

    RecyclerView recyclerView;
    RequestRecyclerAdapter requestRecyclerAdapter;
    List<Request> requests = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        recyclerView = findViewById(R.id.requests_recyclerview);
        requestRecyclerAdapter = new RequestRecyclerAdapter(requests,this);
        recyclerView.setAdapter(requestRecyclerAdapter);
    }

    @Override
    public void rowSelected(int row) {

    }
}
