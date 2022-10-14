package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DataList> list = new ArrayList<>();
        list.add(new DataList("Anubhav","Hi there how are you..."));
        list.add(new DataList("Abhilas","Hi there how are you..."));
        list.add(new DataList("Sneha","Hi there how are you..."));
        list.add(new DataList("Bhakti","Hi there how are you..."));
        list.add(new DataList("Anand","Hi there how are you..."));
        list.add(new DataList("Mangal","Hi there how are you..."));
        list.add(new DataList("Mahima","Hi there how are you..."));
        list.add(new DataList("Jagat","Hi there how are you..."));
        list.add(new DataList("Akshay","Hi there how are you..."));
        list.add(new DataList("Mohan","Hi there how are you..."));
        list.add(new DataList("Shobha","Hi there how are you..."));
        list.add(new DataList("Pallav","Hi there how are you..."));
        list.add(new DataList("Anubhav","Hi there how are you..."));
        list.add(new DataList("Abhilas","Hi there how are you..."));
        list.add(new DataList("Sneha","Hi there how are you..."));
        list.add(new DataList("Bhakti","Hi there how are you..."));
        list.add(new DataList("Anand","Hi there how are you..."));
        list.add(new DataList("Mangal","Hi there how are you..."));
        list.add(new DataList("Mahima","Hi there how are you..."));
        list.add(new DataList("Jagat","Hi there how are you..."));
        list.add(new DataList("Akshay","Hi there how are you..."));
        list.add(new DataList("Mohan","Hi there how are you..."));
        list.add(new DataList("Shobha","Hi there how are you..."));
        list.add(new DataList("Pallav","Hi there how are you..."));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        CustomAdapter customAdapter = new CustomAdapter(list);
        recyclerView.setAdapter(customAdapter);


    }

    // class for data list Object
    public class DataList{
        String name;
        String description;

        public DataList(String name, String description){
            this.name=name;
            this.description=description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    // class for custom adapter class
    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{
        public class CustomViewHolder extends RecyclerView.ViewHolder{
            TextView tv1;
            TextView tv2;
            public CustomViewHolder(View itemView){
                super(itemView);
                tv1 = itemView.findViewById(R.id.textView);
                tv2 = itemView.findViewById(R.id.textView2);
            }
        }

        ArrayList<DataList> list;
        public CustomAdapter(ArrayList<DataList> list){
            this.list=list;
        }

        public CustomViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
            return new CustomViewHolder(view);
        }

        public void onBindViewHolder(CustomViewHolder holder, int position){
            holder.tv1.setText(list.get(position).getName());
            holder.tv2.setText(list.get(position).getDescription());
        }

        public int getItemCount(){
            return list.size();
        }
    }
}