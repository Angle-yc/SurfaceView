package com.angle.day36practice;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by XaChya on 2016/10/24.
 */

public class MyImageCacheSoftReference implements ImageLoader.ImageCache{
    //软引用集合
    private Map<String,SoftReference<Bitmap>> softMap=null;
    private static MyImageCacheSoftReference myImageCacheSoftReference=null;
    private MyImageCacheSoftReference(){
        //实例软引用集合
        softMap=new HashMap<String,SoftReference<Bitmap>>();
    }
    public static MyImageCacheSoftReference getInstance(){
        if(myImageCacheSoftReference==null){
            myImageCacheSoftReference=new MyImageCacheSoftReference();
        }
        return myImageCacheSoftReference;
    }
    private int maxSize = (int) (Runtime.getRuntime().maxMemory()/1024/8);
    private MyLruCache myLruCache=new MyLruCache(maxSize);
    @Override
    public Bitmap getBitmap(String url) {
        Bitmap bitmap=myLruCache.get(url);
        if(bitmap!=null){
            return bitmap;
        }else{
            //去软引用中寻找
            //首先在软引用集合中找到软引用
            SoftReference<Bitmap> softReference=softMap.get(url);
            if(softReference!=null){
                //获取软引用中的bitmap
                bitmap=softReference.get();
                //bitmap的软引用没有被回收
                if(bitmap!=null){
                    //把bitmap放入lrucache中
                    myLruCache.put(url,bitmap);
                    softMap.remove(url);
                    return bitmap;
                }
            }
        }



        //没找到，在lrucache和软引用中都没找到
        return null;
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        myLruCache.put(url,bitmap);
    }

    class MyLruCache extends LruCache<String,Bitmap>{

        /**
         * @param maxSize for caches that do not override {@link #sizeOf}, this is
         *                the maximum number of entries in the cache. For all other caches,
         *                this is the maximum sum of the sizes of the entries in this cache.
         */
        public MyLruCache(int maxSize) {
            super(maxSize);
        }

        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getByteCount()/1024;
        }

        //区别：
        //当有对象被移除的时候回调此方法
        //当有对象被移除的时候，分为两种情况（替换 或者 满）
        //当evicted为真时，对应lrucache满的情况

        @Override
        protected void entryRemoved(boolean evicted, String key, Bitmap oldValue, Bitmap newValue) {
            super.entryRemoved(evicted, key, oldValue, newValue);
            if(evicted){
                //oldValue->软引用里
                SoftReference<Bitmap> softReference=new SoftReference<Bitmap>(oldValue);
                //把软引用放在软引用集合里
                softMap.put(key,softReference);

            }
        }
    }

}
