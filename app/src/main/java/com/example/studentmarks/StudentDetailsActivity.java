package com.example.studentmarks;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class StudentDetailsActivity extends AppCompatActivity {
	ListView listView;
	List<Marks> list;
	//MyAdapter myAdapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_details);
		listView = findViewById(R.id.resultsItems);
		//listShow();
		//myAdapter = new MyAdapter(this, R.layout.activity_list__marks,list);
		//listView.setAdapter(myAdapter);



	}


}
