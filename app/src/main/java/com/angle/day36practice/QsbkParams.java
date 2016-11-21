package com.angle.day36practice;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;
import org.xutils.http.annotation.HttpResponse;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
@HttpRequest(host = "http://m2.qiushibaike.com",
path = "article/list/video")
public class QsbkParams extends RequestParams{
    public String page;
}
