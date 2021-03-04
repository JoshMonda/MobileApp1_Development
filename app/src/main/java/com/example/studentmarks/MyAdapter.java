/*package com.example.studentmarks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

	Context context;
	List<Marks> listMarks;

	public MyAdapter(Context context, int list_marks, List<Marks> listMarks) {
		this.context = context;
		this.listMarks = listMarks;
	}
	//public MyAdapter(MainActivity mainActivity, List<Marks> list) {
//    }


	@Override
	public int getCount() {
		//return listMarks.size();
		return listMarks.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		view = LayoutInflater.from(context).inflate(R.layout.activity_list__marks, parent,false);
		TextView txtPosition = view.findViewById(R.id.txtPosition);
		TextView txtAdmno = view.findViewById(R.id.txtAdmno);
		TextView txtName = view.findViewById(R.id.txtName);
		TextView txtMaths = view.findViewById(R.id.txtMaths);
		TextView txtEnglish = view.findViewById(R.id.txtEng);
		TextView txtKiswahili = view.findViewById(R.id.txtKisw);
		TextView txtChemistry = view.findViewById(R.id.txtChem);
		TextView txtHistory = view.findViewById(R.id.txtHist);
		TextView txtPhysics = view.findViewById(R.id.txtPys);
		TextView txtBiology = view.findViewById(R.id.txtBio);
		TextView txtAgriculture = view.findViewById(R.id.txtAgri);
		TextView txtCRE = view.findViewById(R.id.txtCRE);
		TextView txtGeography = view.findViewById(R.id.txtGeo);
		TextView txtHomeScience = view.findViewById(R.id.txtHs);
		TextView txtComputer = view.findViewById(R.id.txtComp);
		TextView txtTotal = view.findViewById(R.id.txtTotal);

		txtPosition.setText(listMarks.get(position).getPosition());
		txtAdmno.setText(listMarks.get(position).getAdmNo());
		txtName.setText(listMarks.get(position).getName());
		txtMaths.setText(listMarks.get(position).getMaths());
		txtEnglish.setText(listMarks.get(position).getEng());
		txtKiswahili.setText(listMarks.get(position).getKisw());
		txtChemistry.setText(listMarks.get(position).getChem());
		txtHistory.setText(listMarks.get(position).getHist());
		txtPhysics.setText(listMarks.get(position).getPhys());
		txtBiology.setText(listMarks.get(position).getBio());
		txtAgriculture.setText(listMarks.get(position).getAgri());
		txtCRE.setText(listMarks.get(position).getCre());
		txtGeography.setText(listMarks.get(position).getGeo());
		txtHomeScience.setText(listMarks.get(position).getHs());
		txtComputer.setText(listMarks.get(position).getComp());
		txtTotal.setText(listMarks.get(position).calcTotal());

		return view;
	}
}

 */
