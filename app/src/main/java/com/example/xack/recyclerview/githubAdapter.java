package com.example.xack.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

/**
 * Created by Xack on 10/5/2017.
 */

public class githubAdapter extends RecyclerView.Adapter<githubAdapter.githubViewHolder> {

    private Context context;
    private Book[] data;

    public githubAdapter (Context context , Book[] data){
        this.context = context;
        this.data = data;
    }

    @Override
    public githubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user_layout, parent, false);
        return new githubViewHolder(view);

    }

    @Override
    public void onBindViewHolder(githubViewHolder holder, int position) {

        Book book = data[position];
        holder.txtUser.setText(book.getName());
        holder.txtIsbn.setText(book.getISBN());
        holder.txtEdition.setText(book.getEdition());
        holder.txtPrice.setText(book.getPrice());
        Glide.with(holder.imgUser.getContext()).load(book.getImage()).into(holder.imgUser);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class githubViewHolder extends RecyclerView.ViewHolder{

        ImageView imgUser;
        TextView  txtUser;
        TextView  txtIsbn;
        TextView  txtEdition;
        TextView  txtPrice;


        public githubViewHolder(View itemView) {
            super(itemView);

            imgUser = (ImageView) itemView.findViewById(R.id.imguser);
            txtUser = (TextView) itemView.findViewById(R.id.txtuser);
            txtIsbn = (TextView) itemView.findViewById(R.id.txtisbn);
            txtEdition = (TextView) itemView.findViewById(R.id.txtedition);
            txtPrice = (TextView) itemView.findViewById(R.id.txtprice);
        }
    }
}
