package com.midmax.ppscbookupload;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText Statment,A,B,C,D,Answer,ChapterName,ID;
    private Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Statment=findViewById(R.id.Statment);
        A=findViewById(R.id.optiona);
        B=findViewById(R.id.optionb);
        C=findViewById(R.id.optionc);
        D=findViewById(R.id.optiond);
        Answer=findViewById(R.id.answer);
        ChapterName=findViewById(R.id.ChapterName);
        ID=findViewById(R.id.ID);
        Submit=findViewById(R.id.save);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,Object> map = new HashMap<>();
                map.put("Statment",Statment.getText().toString());
                map.put("A",A.getText().toString());
                map.put("B",B.getText().toString());
                map.put("C",C.getText().toString());
                map.put("D",D.getText().toString());
                map.put("Answer",Answer.getText().toString());
                map.put("ID",ID.getText().toString());
                FirebaseDatabase.getInstance().getReference().child(ChapterName.getText().toString()).push()
                        .setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Log.i("jfbvkj", "onComplete: ");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("jfbvkj", "onFailure: "+e.toString());
                            }
                        }).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Statment.setText("");
                        A.setText("");
                        B.setText("");
                        C.setText("");
                        D.setText("");
                        Answer.setText("");
                        ID.setText("");
                        Log.i("jfbvkj", "onSuccess: ");
                    }
                });


            }
        });

    }
}