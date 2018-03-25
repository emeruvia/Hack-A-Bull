package fgcu.hackabull;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText email;
    Button createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    name =findViewById(R.id.name_edit_text);
    phone = findViewById(R.id.phone_edit_text);
    email = findViewById(R.id.email_edit_text);
    createAccount = findViewById(R.id.create_account_button);
    createAccount.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name1 = name.getText().toString();
            String phone1 = phone.getText().toString();
            String email = phone.getText().toString();
            if(!name1.isEmpty() && !phone1.isEmpty() && !email.isEmpty()){
                Intent intent = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(CreateAccount.this,"Account Created", Toast.LENGTH_LONG).show();
                finish();

            }
        }
    });
    }


}
