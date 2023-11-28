package com.example.onlineshoping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    MyCostumAdapter myCostumAdapter;
    MyCostumAdapter1 myCostumAdapter1;
    RecyclerView recyclerView ,recyclerView1;
    List<RowModelList> rowModelList;
    List<RowModelList1>  rowModelList1;
    StaggeredGridLayoutManager manager ,manager1;

   // GridLayoutManager manager,manager1;




    int[] images=new int[]{
            R.drawable.tomato,
            R.drawable.cap,
            R.drawable.carrot,
            R.drawable.cauliflower,


    };

    int[] nonImages=new int[]{
            R.drawable.food1,
            R.drawable.food1,
            R.drawable.food1,
            R.drawable.cauliflower,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView1 = findViewById(R.id.recyclerview1);
        rowModelList1 = new ArrayList<>();
        myCostumAdapter1 = new MyCostumAdapter1(this, rowModelList1);
        manager1 = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
        //manager1=new GridLayoutManager(this,2);
        recyclerView1.setLayoutManager(manager1);
        recyclerView1.setAdapter(myCostumAdapter1);
        InitializeNonVegeData();

        recyclerView = findViewById(R.id.recyclerview);
        rowModelList = new ArrayList<>();
        myCostumAdapter = new MyCostumAdapter(this, rowModelList);
       manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //manager=new GridLayoutManager(this,GridLayoutManager.HORIZONTAL);

       // GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myCostumAdapter);
        InitializeData();





    }

    private void InitializeData(){

            RowModelList rowModel = new RowModelList(images[0],"Tom");
            rowModelList.add(rowModel);

            RowModelList rowModel1 = new RowModelList(images[1],"cap");
            rowModelList.add(rowModel1);

            RowModelList rowModel2 = new RowModelList(images[2],"carrot");
            rowModelList.add(rowModel2);

            RowModelList rowModel3 = new RowModelList(images[3],"cauli");
            rowModelList.add(rowModel3);

            myCostumAdapter.notifyDataSetChanged();


    }

    private void InitializeNonVegeData(){

        RowModelList1 rowModel = new RowModelList1("120","Chicken",nonImages[0]);
        rowModelList1.add(rowModel);

        RowModelList1 rowModel1 = new RowModelList1("120","Chicken",nonImages[1]);
        rowModelList1.add(rowModel1);

        RowModelList1 rowModel2 = new RowModelList1("120","Chicken",nonImages[2]);
        rowModelList1.add(rowModel2);

        RowModelList1 rowModel3 = new RowModelList1("120","Chicken",nonImages[3]);
        rowModelList1.add(rowModel3);

        myCostumAdapter1.notifyDataSetChanged();



    }
}