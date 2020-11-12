package com.example.StuffyCare.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

import com.example.StuffyCare.R;
import com.example.StuffyCare.ShopNowResult;
import com.example.StuffyCare.items.Suggestions;

public class RecyclerViewAdapterSuggestions extends RecyclerView.Adapter<RecyclerViewAdapterSuggestions.ExampleViewHolder> {
    private ArrayList<Suggestions> mExampleList;
    private ArrayList<Suggestions> mExampleListFull;

    private RecyclerViewAdapterSuggestions.OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onProductClick(int position);
        void onDeleteClick(int position);
    }
    public void setOnItemClickListener(RecyclerViewAdapterSuggestions.OnItemClickListener listener) {
        mListener = listener;
    }
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView1;
        public ImageView mImageView;


        public ExampleViewHolder(final View itemView, final RecyclerViewAdapterSuggestions.OnItemClickListener listener) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.suggestion);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), ShopNowResult.class);
                    itemView.getContext().startActivity(intent);
                }
            });


        }
    }

    public RecyclerViewAdapterSuggestions(ArrayList<Suggestions> exampleList) {
        mExampleList = exampleList;
        mExampleListFull=new ArrayList<>(exampleList);

    }
    @Override
    public RecyclerViewAdapterSuggestions.ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_suggestion, parent, false);
        return new RecyclerViewAdapterSuggestions.ExampleViewHolder(v, mListener);
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapterSuggestions.ExampleViewHolder holder, int position) {
        Suggestions currentItem = mExampleList.get(position);
        holder.mTextView1.setText(currentItem.getSuggestion());

    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<Suggestions> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
//    @Override
//    public Filter getFilter() {
//        return exampleFilter;
//    }
//    private Filter exampleFilter= new Filter() {
//        @Override
//        protected FilterResults performFiltering(CharSequence constraint) {
//            ArrayList<Suggestions> filteredList = new ArrayList<>();
//            if(constraint == null || constraint.length()==0){
//                filteredList.addAll(mExampleListFull);
//            }else{
//                String filterPattern = constraint.toString().toLowerCase().trim();
//                for( Suggestions item : mExampleListFull){
//                    if(item.getSuggestion().toLowerCase().contains(filterPattern)){
//                        filteredList.add(item);
//                    }
//                }
//            }
//            FilterResults results = new FilterResults();
//            results.values = filteredList;
//            return  results;
//        }
//        @Override
//        protected void publishResults(CharSequence constraint, FilterResults results) {
//            mExampleList.clear();
//            mExampleList.addAll((ArrayList) results.values);
//            notifyDataSetChanged();
//        }
//    };


}
