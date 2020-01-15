package com.example.myschool.FirstFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myschool.R;

public class First_1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fg1_1,container,false);
        return view;
    }
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState){
//        super.onActivityCreated(savedInstanceState);
//       btn_robot.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//              startActivity(new Intent(getActivity(),RobotActivity.class));
//           }
//       });
//       btn_remark.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               startActivity(new Intent(getActivity(),MeetingActivity.class));
//           }
//       });
//    }
}
