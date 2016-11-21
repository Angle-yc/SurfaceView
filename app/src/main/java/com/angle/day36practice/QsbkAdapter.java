package com.angle.day36practice;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class QsbkAdapter extends RecyclerView.Adapter<QsbkAdapter.QsbkViewHolder> implements View.OnClickListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    private Context context=null;
    //数据源是一个模型类
    private QsbkBean mQsbkBean=null;

    private ImageLoader mImageLoader=null;
    private RequestQueue mRequestQueue=null;
    //播放的媒体对象
    private MediaPlayer mMediaPlayer=null;

    public QsbkAdapter(Context context) {
        this.context = context;
        mRequestQueue= Volley.newRequestQueue(context);
        mImageLoader=new ImageLoader(mRequestQueue,MyImageCacheSoftReference.getInstance());
        mMediaPlayer=new MediaPlayer();
    }

    public void setQsbkBean(QsbkBean qsbkBean){
        this.mQsbkBean = qsbkBean;
        notifyDataSetChanged();
    }

    @Override
    public QsbkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        QsbkViewHolder holder=new QsbkViewHolder(view);
        holder.pic.setOnClickListener(this);
        //吧holder对象放到holder里面
//        点击参数里面的view，也就是pic，而holder就在pic上
//        点击之后要操作surfaceview、pic、progress、play
        holder.pic.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(QsbkViewHolder holder, int position) {
        //重置holder里面view的显示状态
        resetHolder(holder);

        QsbkBean.ItemsBean itemsBean=mQsbkBean.getItems().get(position);
        holder.content.setText(itemsBean.getContent());
        holder.pic.setImageUrl(itemsBean.getPic_url(),mImageLoader);
    }
    //重置holder里面view的显示状态
    private void resetHolder(QsbkViewHolder holder){
        holder.pic.setVisibility(View.VISIBLE);
        holder.play.setVisibility(View.VISIBLE);
        holder.progress.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
//        if (mQsbkBean==null){
//            return 0;
//        }else {
//            return mQsbkBean.getItems().size();
//        }
        return mQsbkBean==null?0:mQsbkBean.getItems().size();
    }

    @Override
    public void onClick(View v) {
        if (lastHolder!=null){
            resetHolder(lastHolder);
        }
        QsbkViewHolder holder= (QsbkViewHolder) v.getTag();
        lastHolder=holder;
        mMediaPlayer.reset();
        //在适配器中可以通过mQsbkBean.getItems().get(holder.getAdapterPosition()).getLow_url()方法获取holder的序号
        try {
            mMediaPlayer.setDataSource(mQsbkBean.getItems().get(holder.getAdapterPosition()).getLow_url());
            mMediaPlayer.setDisplay(holder.video.getHolder());
            mMediaPlayer.prepareAsync();

            mMediaPlayer.setOnPreparedListener(this);
            mMediaPlayer.setOnCompletionListener(this);

            holder.play.setVisibility(View.INVISIBLE);
            holder.progress.setVisibility(View.VISIBLE);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private QsbkViewHolder lastHolder=null;
    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
        lastHolder.progress.setVisibility(View.INVISIBLE);
        lastHolder.pic.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        mp.seekTo(0);
        mp.start();
    }

    @Override
    public void onViewDetachedFromWindow(QsbkViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        //判断滑出去的itemview是否是正在播放的itemView
        if (lastHolder!=null&&lastHolder.equals(holder)){
            mMediaPlayer.reset();
            lastHolder=null;
            resetHolder(holder);
        }
    }

    class QsbkViewHolder extends RecyclerView.ViewHolder{
        @ViewInject(R.id.textView_item_content)
        private TextView content;
        @ViewInject(R.id.networkImageView_item_pic)
        private NetworkImageView pic;
        @ViewInject(R.id.surfaceView_item_video)
        private SurfaceView video;
        @ViewInject(R.id.imageView_item_play)
        private ImageView play;
        @ViewInject(R.id.progressBar_item_progress)
        private ProgressBar progress;
        public QsbkViewHolder(View itemView) {
            super(itemView);
            x.view().inject(this,itemView);
        }
    }
}
