package com.angle.day36practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.xutils.common.Callback;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
//http://m2.qiushibaike.com/article/list/video?page=1
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements Callback.CommonCallback<QsbkBean> {


    @ViewInject(R.id.recyclerView)
    private RecyclerView mRecyclerView=null;
    private QsbkAdapter adapter=null;
    private void initView(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void initAdapter(){
        adapter=new QsbkAdapter(this);
    }
    private void viewWithAdapter(){
        mRecyclerView.setAdapter(adapter);
    }

    private void loadData(){
        QsbkParams qsbkParams=new QsbkParams();
        qsbkParams.page="1";
        x.http().get(qsbkParams,this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
        initView();
        initAdapter();
        viewWithAdapter();
        loadData();
    }

    //数据加载成功
    @Override
    public void onSuccess(QsbkBean result) {
        adapter.setQsbkBean(result);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
