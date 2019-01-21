package com.gb.retrofitjsonparsingdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by bhavin on 10/9/2018.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    private Context mContext;
    private List<Hero> heroList;

    public MovieListAdapter(Context mContext, List<Hero> heroList) {
        this.mContext = mContext;
        this.heroList = heroList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.movie_item,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {


        Glide.with(mContext).load(heroList.get(position).getImageurl()).into(holder.ivMovie);
        holder.tvName.setText(heroList.get(position).getName());
        holder.tvRealName.setText(heroList.get(position).getRealname());
        holder.tvTeam.setText(heroList.get(position).getTeam());
        holder.tvYear.setText(heroList.get(position).getFirstappearance());
        holder.tvCreatedBy.setText(heroList.get(position).getCreatedby());
        holder.tvPublisher.setText(heroList.get(position).getPublisher());
        holder.tvBio.setText(heroList.get(position).getBio());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivMovie;
        private TextView tvName,tvRealName,tvTeam,tvYear,tvCreatedBy,tvPublisher,tvBio;
        public MovieViewHolder(View itemView) {
            super(itemView);

            ivMovie = (ImageView) itemView.findViewById(R.id.iv_movie);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvRealName = (TextView) itemView.findViewById(R.id.tv_real_name);
            tvTeam = (TextView) itemView.findViewById(R.id.tv_team);
            tvYear = (TextView) itemView.findViewById(R.id.tv_year);
            tvCreatedBy = (TextView) itemView.findViewById(R.id.tv_created_by);
            tvPublisher = (TextView) itemView.findViewById(R.id.tv_publisher);
            tvBio = (TextView) itemView.findViewById(R.id.tv_bio);
        }
    }
}
