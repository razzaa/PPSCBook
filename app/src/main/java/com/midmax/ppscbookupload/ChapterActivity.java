package com.midmax.ppscbookupload;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChapterActivity extends AppCompatActivity {
    TextView questionText;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        questionText =  findViewById(R.id.txt);
        questionText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = questionText.getText().toString();
//                Toast.makeText(getApplicationContext(),content.toString(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(ChapterActivity.this,McqsListActivity.class);
                Bundle extras=new Bundle();
                extras.putString("NAME",name);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

    }
}