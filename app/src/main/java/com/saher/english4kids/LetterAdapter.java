package com.saher.english4kids;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LetterAdapter extends RecyclerView.Adapter<LetterAdapter.LetterViewHolder> {
    ArrayList<Letter>letters;
    onRecyclerViewItemClickListener listener;

    public LetterAdapter(ArrayList<Letter> letters,onRecyclerViewItemClickListener listener) {
        this.letters = letters;
        this.listener=listener;
    }

    @NonNull
    @Override
    public LetterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.letter_layout,null,false);
        LetterViewHolder viewholder=new LetterViewHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull LetterViewHolder holder, int position) {
        Letter l=letters.get(position);
        holder.tv_big_letter.setText(l.getBl());
        holder.tv_small_letter.setText(l.getSl());
        holder.tv_big_letter.setTag(position);

    }



    @Override
    public int getItemCount() {
        return letters.size();
    }

    class LetterViewHolder extends RecyclerView.ViewHolder{
        TextView tv_small_letter,tv_big_letter;

        public LetterViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_big_letter=itemView.findViewById(R.id.big_letter);
            tv_small_letter=itemView.findViewById(R.id.small_letter);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id=(int)tv_big_letter.getTag();
                    listener.onItemClick(id);
                }
            });

        }
    }
}
