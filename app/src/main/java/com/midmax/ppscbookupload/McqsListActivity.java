package com.midmax.ppscbookupload;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class McqsListActivity extends AppCompatActivity {
    private String name;
    private RecyclerView recyclerView;
    private McqsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcqs_list);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Bundle extras=new Bundle();
        extras=getIntent().getExtras();
        name=extras.getString("NAME");
        FirebaseRecyclerOptions<mcqs> options =
                new FirebaseRecyclerOptions.Builder<mcqs>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child(name), mcqs.class)
                        .build();

        adapter = new McqsAdapter(options);
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}