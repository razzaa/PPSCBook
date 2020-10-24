package com.midmax.ppscbookupload;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class McqsAdapter extends FirebaseRecyclerAdapter<mcqs, McqsAdapter.McqsViewHolder> {
//    private boolean isVisible = false;
    public McqsAdapter(@NonNull FirebaseRecyclerOptions<mcqs> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(final McqsViewHolder holder, int i, @NonNull mcqs mcqs) {
        holder.Statment.setText(mcqs.getStatment());
        holder.A.setText(mcqs.getA());
        holder.B.setText(mcqs.getB());
        holder.C.setText(mcqs.getC());
        holder.D.setText(mcqs.getD());
        holder.Answer.setText(mcqs.getAnswer());
//        holder.ChapterName.setText(mcqs.getChapterName());
        holder.ID.setText(mcqs.getID());

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Toast.makeText(view.getContext(), "Item is clicked", Toast.LENGTH_SHORT).show();
//                holder.Answer.setVisibility(View.VISIBLE);
                if(holder.Answer.getVisibility() == View.VISIBLE){
                    holder.Answer.setVisibility(View.GONE);
                }else{
                    holder.Answer.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @NonNull
    @Override
    public McqsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mcqs, parent, false);
        return new McqsViewHolder(view);
    }

    public class McqsViewHolder extends RecyclerView.ViewHolder{
        TextView Statment,A,B,C,D,Answer,ChapterName,ID;
        ImageButton btn;
        public McqsViewHolder(@NonNull View itemView) {
            super(itemView);
            Statment = itemView.findViewById(R.id.Statment);
            A = itemView.findViewById(R.id.optiona);
            B = itemView.findViewById(R.id.optionb);
            C = itemView.findViewById(R.id.optionc);
            D = itemView.findViewById(R.id.optiond);
            Answer = itemView.findViewById(R.id.answer);
            ChapterName = itemView.findViewById(R.id.ChapterName);
            ID = itemView.findViewById(R.id.ID);
            btn=itemView.findViewById(R.id.btn);
        }
    }
}
