package com.example.myschool.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myschool.Adapter.Find_tab_Adapter;
import com.example.myschool.FirstFragment.First_1;
import com.example.myschool.FirstFragment.First_2;
import com.example.myschool.FirstFragment.First_3;
import com.example.myschool.FirstFragment.First_4;
import com.example.myschool.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {
    private TabLayout tab_FindFragment_title;                            //定义TabLayout
    private ViewPager vp_FindFragment_pager;                             //定义viewPager
    private FragmentPagerAdapter fAdapter;                               //定义adapter

    private List<Fragment> list_fragment;                                //定义要装fragment的列表
    private List<String> list_title;                                     //tab名称列表

    private First_1 hotRecommendFragment;              //热门推荐fragment
    private First_2 hotCollectionFragment;            //热门收藏fragment
    private First_3 hotMonthFragment;                      //本月热榜fragment
    private First_4 hotToday;                                      //今日热榜fragment

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg2, container, false);

        initControls(view);

        return view;
    }

    /**
     * 初始化各控件
     * @param view
     */
    private void initControls(View view) {

        tab_FindFragment_title = (TabLayout)view.findViewById(R.id.tab_FindFragment_title);
        vp_FindFragment_pager = (ViewPager)view.findViewById(R.id.vp_FindFragment_pager);

        //初始化各fragment
        hotRecommendFragment = new First_1();
        hotCollectionFragment = new First_2();
        hotMonthFragment = new First_3();
        hotToday = new First_4();

        //将fragment装进列表中
        list_fragment = new ArrayList<>();
        list_fragment.add(hotRecommendFragment);
        list_fragment.add(hotCollectionFragment);
        list_fragment.add(hotMonthFragment);
        list_fragment.add(hotToday);

        //将名称加载tab名字列表，正常情况下，我们应该在values/arrays.xml中进行定义然后调用
        list_title = new ArrayList<>();
        list_title.add("热门推荐");
        list_title.add("热门收藏");
        list_title.add("本月热榜");
        list_title.add("今日热榜");

        //设置TabLayout的模式
        tab_FindFragment_title.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(0)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(1)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(2)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(3)));

        fAdapter = new Find_tab_Adapter(getActivity().getSupportFragmentManager(),list_fragment,list_title);

        //viewpager加载adapter
        vp_FindFragment_pager.setAdapter(fAdapter);
        //tab_FindFragment_title.setViewPager(vp_FindFragment_pager);
        //TabLayout加载viewpager
        tab_FindFragment_title.setupWithViewPager(vp_FindFragment_pager);
        //tab_FindFragment_title.set
    }

}
