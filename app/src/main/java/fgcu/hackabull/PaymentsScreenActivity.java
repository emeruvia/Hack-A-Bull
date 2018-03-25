package fgcu.hackabull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fgcu.hackabull.DataObjects.Payment;
import fgcu.hackabull.RecyclerAdpaters.PaymentRecyclerAdapter;
import fgcu.hackabull.RecyclerAdpaters.RecyclerViewOnClick;

//TODO For drawer in drawer activity
public class PaymentsScreenActivity extends AppCompatActivity implements RecyclerViewOnClick {
    RecyclerView recyclerView;
    PaymentRecyclerAdapter paymentRecyclerAdapter;
    List<Payment> payments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments_screen);
        recyclerView = findViewById(R.id.payment_recyclerview);
        payments.add(new Payment("Bob Billibo Bob", "Joe Johnson","02/15/2018","$24"));
        payments.add(new Payment("Bob Billibo Bob", "Joe Johnson","02/15/2018","$24"));
        payments.add(new Payment("Bob Billibo Bob", "Joe Johnson","02/15/2018","$24"));
        payments.add(new Payment("Bob Billibo Bob", "Joe Johnson","02/15/2018","$24"));
        paymentRecyclerAdapter = new PaymentRecyclerAdapter(payments,this);
        recyclerView.setAdapter(paymentRecyclerAdapter);
    }

    @Override
    public void rowSelected(int row) {

    }
}
