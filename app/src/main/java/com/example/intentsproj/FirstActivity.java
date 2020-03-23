package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    EditText et1,et2;
    String v1,v2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goBtn = findViewById(R.id.button);

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);



                Context context = getApplicationContext();
                {
                    CharSequence message = "You just clicked the OK button";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, message, duration);
                    toast.show();
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);


                    et1 = findViewById(R.id.editText);
                    et2 = findViewById(R.id.editText2);
                    button = findViewById(R.id.button);

                    button.setOnClickListener((new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    }));
                    v1 = et1.getText().toString();
                    v2 = et2.getText().toString();


                    intent.putExtra("Value1",v1);
                    intent.putExtra("Value2",v2);

                    startActivity(intent);







        }





        }
    });

}



}

