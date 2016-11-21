package com.angle.day36practice;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
@HttpResponse(parser = Qsbkparser.class)
public class QsbkBean {

    /**
     * count : 30
     * err : 0
     * items : [{"high_url":"http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE.mp4","format":"video","image":null,"published_at":1477610102,"tag":"null","user":{"avatar_updated_at":1448524420,"uid":13178436,"last_visited_at":1388629650,"created_at":1388629650,"state":"active","last_device":"android_2.6.4","role":"","login":"短腿儿欧巴，！","id":13178436,"icon":"20151126155340.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117850687,"votes":{"down":-11,"up":334},"created_at":1477574201,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE.jpg","content":"叫你讨厌。活埋了你","state":"publish","comments_count":18,"low_url":"http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE_3g.mp4","allow_comment":true,"share_count":41,"loop":35454},{"high_url":"http://qiubai-video.qiushibaike.com/GU8QMDMIG7D1GF2H.mp4","format":"video","image":null,"published_at":1477545902,"tag":"null","user":{"avatar_updated_at":1452083135,"uid":30896813,"last_visited_at":1451802802,"created_at":1451802802,"state":"active","last_device":"android_9.0.0","role":"","login":"艾特.随风","id":30896813,"icon":"20160106202535.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117847421,"hot_comment":{"status":"publish","user_id":31777661,"score":null,"floor":11,"ip":"112.37.241.5","created_at":"2016-10-27 13:44:58","comment_id":367385656,"pos":0,"content":"沙滩黑狗耍流氓，尿尿刨土怼姑娘，当年风骚狠又浪，现在坟头草以长。","source":"android","like_count":220,"parent_id":0,"anonymous":0,"neg":0,"article_id":117847421,"user":{"avatar_updated_at":1474769194,"uid":31777661,"last_visited_at":1463146563,"created_at":1463146563,"state":"active","last_device":"android_9.4.1","role":"","login":"趙讲究","id":31777661,"icon":"2016092510063441.JPEG"}},"votes":{"down":-135,"up":3017},"created_at":1477544284,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/GU8QMDMIG7D1GF2H.jpg","content":"人贱则无敌","state":"publish","comments_count":138,"low_url":"http://qiubai-video.qiushibaike.com/GU8QMDMIG7D1GF2H_3g.mp4","allow_comment":true,"share_count":605,"type":"hot","loop":309108},{"high_url":"http://qiubai-video.qiushibaike.com/Z9DKL745J53G2OUK.mp4","format":"video","image":null,"published_at":1477562701,"tag":"null","user":{"avatar_updated_at":1476862584,"uid":27461222,"last_visited_at":1428573573,"created_at":1428573573,"state":"active","last_device":"ios_6.4.2","role":"","login":"孤单a殇情","id":27461222,"icon":"2016101915362427.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117848626,"votes":{"down":-124,"up":2633},"created_at":1477556588,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/Z9DKL745J53G2OUK.jpg","content":"别人家的喵","state":"publish","comments_count":141,"low_url":"http://qiubai-video.qiushibaike.com/Z9DKL745J53G2OUK_3g.mp4","allow_comment":true,"share_count":324,"type":"hot","loop":264995},{"high_url":"http://qiubai-video.qiushibaike.com/4ZEGEC51B4OZHVDV.mp4","format":"video","image":null,"published_at":1477544701,"tag":"null","user":{"avatar_updated_at":1346548012,"uid":3383483,"last_visited_at":1346547938,"created_at":1346547938,"state":"active","last_device":"android_2.0.5","role":"","login":"百大笑视频","id":3383483,"icon":"20120902170650.jpg"},"image_size":{"s":[480,480,6],"m":[480,480,6]},"id":117846669,"votes":{"down":-70,"up":2182},"created_at":1477538074,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/4ZEGEC51B4OZHVDV.jpg","content":"哎呦我去，腿抽筋了\u2026","state":"publish","comments_count":69,"low_url":"http://qiubai-video.qiushibaike.com/4ZEGEC51B4OZHVDV_3g.mp4","allow_comment":true,"share_count":310,"type":"hot","loop":224598},{"high_url":"http://qiubai-video.qiushibaike.com/9TS0962BC95NRL1G.mp4","format":"video","image":null,"published_at":1477611602,"tag":"null","user":{"avatar_updated_at":1474547975,"uid":32681737,"last_visited_at":1474547974,"created_at":1474547974,"state":"active","last_device":"android_10.3.2","role":"","login":"落笔划忧愁","id":32681737,"icon":"201609222039352.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117850482,"votes":{"down":-18,"up":117},"created_at":1477572525,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/9TS0962BC95NRL1G.jpg","content":"世界真奇妙","state":"publish","comments_count":14,"low_url":"http://qiubai-video.qiushibaike.com/9TS0962BC95NRL1G_3g.mp4","allow_comment":true,"share_count":24,"type":"fresh","loop":7527},{"high_url":"http://qiubai-video.qiushibaike.com/3PR348YMBHMKMSE9.mp4","format":"video","image":null,"published_at":1477614301,"tag":"null","user":{"avatar_updated_at":1401351121,"uid":9367395,"last_visited_at":1370246959,"created_at":1370246959,"state":"active","last_device":"android_2.4","role":"","login":"好像是被睡的感觉","id":9367395,"icon":"20140530001202.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117850315,"votes":{"down":-7,"up":85},"created_at":1477571053,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/3PR348YMBHMKMSE9.jpg","content":"这么好的，真实，贴近生活的段子怎么就不给播了呢","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/3PR348YMBHMKMSE9_3g.mp4","allow_comment":true,"share_count":2,"type":"fresh","loop":4580},{"high_url":"http://qiubai-video.qiushibaike.com/1AOKAP6U3WWMSFOF.mp4","format":"video","image":null,"published_at":1477610401,"tag":"null","user":{"avatar_updated_at":1473040369,"uid":23075771,"last_visited_at":1416777697,"created_at":1416777697,"state":"active","last_device":"android_3.4.3","role":"","login":"只有1个我","id":23075771,"icon":"2016090509524913.JPEG"},"image_size":{"s":[480,480,10],"m":[480,480,10]},"id":117850316,"votes":{"down":-7,"up":129},"created_at":1477571055,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/1AOKAP6U3WWMSFOF.jpg","content":"永远的经典","state":"publish","comments_count":12,"low_url":"http://qiubai-video.qiushibaike.com/1AOKAP6U3WWMSFOF_3g.mp4","allow_comment":true,"share_count":3,"type":"fresh","loop":9504},{"high_url":"http://qiubai-video.qiushibaike.com/CHKOOL1ORDBBRJGC.mp4","format":"video","image":null,"published_at":1477611001,"tag":"null","user":{"avatar_updated_at":1443454080,"uid":11943680,"last_visited_at":1382223802,"created_at":1382223802,"state":"bonding","last_device":"android_2.6.1","role":"","login":"村里有个姑娘叫黑蛋！","id":11943680,"icon":"20150928232800.jpg"},"image_size":{"s":[480,480,14],"m":[480,480,14]},"id":117850597,"votes":{"down":-13,"up":132},"created_at":1477573596,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/CHKOOL1ORDBBRJGC.jpg","content":"我读书少，你别骗我原来是出自这里！","state":"publish","comments_count":3,"low_url":"http://qiubai-video.qiushibaike.com/CHKOOL1ORDBBRJGC_3g.mp4","allow_comment":true,"share_count":2,"type":"fresh","loop":8439},{"high_url":"http://qiubai-video.qiushibaike.com/BIMHDS0CEYYWAG5J.mp4","format":"video","image":null,"published_at":1477611301,"tag":"null","user":{"avatar_updated_at":1424908916,"uid":25990228,"last_visited_at":1424908914,"created_at":1424908914,"state":"active","last_device":"ios_6.2.1","role":"","login":"鸟找鸟窝","id":25990228,"icon":"20150226160155.jpg"},"image_size":{"s":[480,480,14],"m":[480,480,14]},"id":117850852,"votes":{"down":-10,"up":114},"created_at":1477575609,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/BIMHDS0CEYYWAG5J.jpg","content":"视频来了,要生的回去找你婆娘生","state":"publish","comments_count":5,"low_url":"http://qiubai-video.qiushibaike.com/BIMHDS0CEYYWAG5J_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":6297},{"high_url":"http://qiubai-video.qiushibaike.com/P7B48QZ9VGZIDJ06.mp4","format":"video","image":null,"published_at":1477609802,"tag":"null","user":{"avatar_updated_at":1477581249,"uid":32716850,"last_visited_at":1475073743,"created_at":1475073743,"state":"active","last_device":"ios_10.3.12","role":"","login":"无為（自然）","id":32716850,"icon":"2016102723140882.JPEG"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117851678,"votes":{"down":-9,"up":129},"created_at":1477581569,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/P7B48QZ9VGZIDJ06.jpg","content":"孫悟空跟俺混","state":"publish","comments_count":0,"low_url":"http://qiubai-video.qiushibaike.com/P7B48QZ9VGZIDJ06_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":9851},{"high_url":"http://qiubai-video.qiushibaike.com/W5A3ATJWB0S00FYG.mp4","format":"video","image":null,"published_at":1477612501,"tag":"null","user":{"avatar_updated_at":1428174497,"uid":20477249,"last_visited_at":1410244851,"created_at":1410244851,"state":"active","last_device":"android_3.3.0","role":"","login":"呵呵我又呵呵","id":20477249,"icon":"20150405110817.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117850628,"votes":{"down":-8,"up":98},"created_at":1477573891,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/W5A3ATJWB0S00FYG.jpg","content":"你懂吗？我懂","state":"publish","comments_count":2,"low_url":"http://qiubai-video.qiushibaike.com/W5A3ATJWB0S00FYG_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":5822},{"high_url":"http://qiubai-video.qiushibaike.com/OWQ824X0QWNQN1W2.mp4","format":"video","image":null,"published_at":1477611901,"tag":"null","user":{"avatar_updated_at":1462721649,"uid":31750725,"last_visited_at":1462721648,"created_at":1462721648,"state":"bonded","last_device":"android_9.4.1","role":"","login":"我就瞅你咋地","id":31750725,"icon":"20160508233408.jpg"},"image_size":{"s":[480,480,7],"m":[480,480,7]},"id":117849979,"votes":{"down":-8,"up":148},"created_at":1477568673,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/OWQ824X0QWNQN1W2.jpg","content":"大哥你这是想不开吗？？？","state":"publish","comments_count":5,"low_url":"http://qiubai-video.qiushibaike.com/OWQ824X0QWNQN1W2_3g.mp4","allow_comment":true,"share_count":34,"type":"fresh","loop":13443},{"high_url":"http://qiubai-video.qiushibaike.com/S5TVVF3GG0ZRFN8G.mp4","format":"video","image":null,"published_at":1477614002,"tag":"null","user":{"avatar_updated_at":1462254848,"uid":1673960,"last_visited_at":1336288046,"created_at":1336288046,"state":"bonded","last_device":"web","role":"","login":"紅鯉魚綠鯉魚與驢","id":1673960,"icon":"20160503135406.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117849870,"votes":{"down":-6,"up":87},"created_at":1477567758,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/S5TVVF3GG0ZRFN8G.jpg","content":"问猫为什么救这条小丑鱼。\n1:怕主人怀疑猫杀。\n2:养大了在吃。","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/S5TVVF3GG0ZRFN8G_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":3239},{"high_url":"http://qiubai-video.qiushibaike.com/R8MIW5H2ADKOG71Z.mp4","format":"video","image":null,"published_at":1477610701,"tag":"null","user":{"avatar_updated_at":1457101846,"uid":30540924,"last_visited_at":1446198718,"created_at":1446198718,"state":"active","last_device":"android_8.2.1","role":"","login":"雨(^_^)","id":30540924,"icon":"20160304223045.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117850527,"votes":{"down":-15,"up":179},"created_at":1477572812,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/R8MIW5H2ADKOG71Z.jpg","content":"坟头蹦迪啊","state":"publish","comments_count":24,"low_url":"http://qiubai-video.qiushibaike.com/R8MIW5H2ADKOG71Z_3g.mp4","allow_comment":true,"share_count":10,"type":"fresh","loop":14214},{"high_url":"http://qiubai-video.qiushibaike.com/EQLAW5KL9D7Z8C7E.mp4","format":"video","image":null,"published_at":1477609502,"tag":"null","user":{"avatar_updated_at":1446009624,"uid":18808675,"last_visited_at":1407185335,"created_at":1407185335,"state":"active","last_device":"android_3.0.4","role":"","login":"昵称越长鸡巴越长","id":18808675,"icon":"20151028132023.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117851611,"votes":{"down":-14,"up":134},"created_at":1477581015,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/EQLAW5KL9D7Z8C7E.jpg","content":"男朋友都给你吃了，闻啥，还问别人闻什么","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/EQLAW5KL9D7Z8C7E_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":13285},{"high_url":"http://qiubai-video.qiushibaike.com/IZAMA3CQVDCQML39.mp4","format":"video","image":null,"published_at":1477612202,"tag":"null","user":{"avatar_updated_at":1477585759,"uid":32882916,"last_visited_at":1477585758,"created_at":1477585758,"state":"active","last_device":"android_10.4.0","role":"","login":"余维轩","id":32882916,"icon":"2016102800291894.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117852069,"votes":{"down":-10,"up":101},"created_at":1477586313,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/IZAMA3CQVDCQML39.jpg","content":"才15秒 。","state":"publish","comments_count":2,"low_url":"http://qiubai-video.qiushibaike.com/IZAMA3CQVDCQML39_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":5075},{"high_url":"http://qiubai-video.qiushibaike.com/00Y9KYWM6SDR1GQO.mp4","format":"video","image":null,"published_at":1477609201,"tag":"null","user":{"avatar_updated_at":1467717986,"uid":17104527,"last_visited_at":1403298301,"created_at":1403298301,"state":"bonded","last_device":"android_2.8.5","role":"","login":"逗比，我是认真的","id":17104527,"icon":"20160705192625.jpg"},"image_size":{"s":[480,480,10],"m":[480,480,10]},"id":117852274,"votes":{"down":-48,"up":257},"created_at":1477591068,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/00Y9KYWM6SDR1GQO.jpg","content":"就想问广大的糗友们，你们能坚持几秒？？？","state":"publish","comments_count":104,"low_url":"http://qiubai-video.qiushibaike.com/00Y9KYWM6SDR1GQO_3g.mp4","allow_comment":true,"share_count":37,"loop":29089},{"high_url":"http://qiubai-video.qiushibaike.com/2QR1BJAQ3D28E1C0.mp4","format":"video","image":null,"published_at":1477568401,"tag":"null","user":{"avatar_updated_at":1477406629,"uid":32871938,"last_visited_at":1477406628,"created_at":1477406628,"state":"active","last_device":"android_10.4.0","role":"","login":"你的幸福请不要说","id":32871938,"icon":"201610252243497.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117848545,"votes":{"down":-79,"up":1006},"created_at":1477555911,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/2QR1BJAQ3D28E1C0.jpg","content":"你要逆天嘛","state":"publish","comments_count":51,"low_url":"http://qiubai-video.qiushibaike.com/2QR1BJAQ3D28E1C0_3g.mp4","allow_comment":true,"share_count":71,"loop":134990},{"high_url":"http://qiubai-video.qiushibaike.com/21DA0TNIL159VTDD.mp4","format":"video","image":null,"published_at":1477564501,"tag":"null","user":{"avatar_updated_at":1346548012,"uid":3383483,"last_visited_at":1346547938,"created_at":1346547938,"state":"active","last_device":"android_2.0.5","role":"","login":"百大笑视频","id":3383483,"icon":"20120902170650.jpg"},"image_size":{"s":[480,480,8],"m":[480,480,8]},"id":117847713,"hot_comment":{"status":"publish","user_id":19560565,"score":null,"floor":46,"ip":"223.104.94.89","created_at":"2016-10-27 20:39:32","comment_id":367403021,"pos":0,"content":"来人，把我二十米的长刀拖上来，我让这脑残先跑19米","source":"android","like_count":82,"parent_id":0,"anonymous":0,"neg":0,"article_id":117847713,"user":{"avatar_updated_at":1408220630,"uid":19560565,"last_visited_at":1408216710,"created_at":1408216710,"state":"active","last_device":"ios_3.1.2","role":"","login":"重新活过.","id":19560565,"icon":"20140817122349.jpg"}},"votes":{"down":-163,"up":1803},"created_at":1477546925,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/21DA0TNIL159VTDD.jpg","content":"能活到现在也算是个奇迹\u2026","state":"publish","comments_count":110,"low_url":"http://qiubai-video.qiushibaike.com/21DA0TNIL159VTDD_3g.mp4","allow_comment":true,"share_count":282,"type":"hot","loop":223990},{"high_url":"http://qiubai-video.qiushibaike.com/NQ6UM9HOXXNS2N4F.mp4","format":"video","image":null,"published_at":1477615202,"tag":"null","user":{"avatar_updated_at":1477585091,"uid":30697070,"last_visited_at":1448692543,"created_at":1448692543,"state":"active","last_device":"ios_8.2.15","role":"","login":"等不起的等待","id":30697070,"icon":"2016102800181138.JPEG"},"image_size":{"s":[480,480,14],"m":[480,480,14]},"id":117851482,"votes":{"down":-9,"up":70},"created_at":1477579823,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/NQ6UM9HOXXNS2N4F.jpg","content":"一个人的生活，一个人的火锅，突然觉得男人会做饭真好","state":"publish","comments_count":3,"low_url":"http://qiubai-video.qiushibaike.com/NQ6UM9HOXXNS2N4F_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":1944},{"high_url":"http://qiubai-video.qiushibaike.com/EIR342Y529Z6364K.mp4","format":"video","image":null,"published_at":1477567202,"tag":"null","user":{"avatar_updated_at":1459533349,"uid":30642606,"last_visited_at":1447858580,"created_at":1447858580,"state":"active","last_device":"android_8.3.3","role":"","login":"别撕，姐夫自己脱","id":30642606,"icon":"20160402015549.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117849127,"hot_comment":{"status":"publish","user_id":32846850,"score":null,"floor":17,"ip":"116.252.188.197","created_at":"2016-10-27 20:13:07","comment_id":367401758,"pos":0,"content":"二营长，赶快他妈的把意大利炮拉出来","source":"android","like_count":100,"parent_id":0,"anonymous":0,"neg":0,"article_id":117849127,"user":{"avatar_updated_at":1477036089,"uid":32846850,"last_visited_at":1477036089,"created_at":1477036089,"state":"active","last_device":"android_10.3.2","role":"","login":"燕赵\u2014之士","id":32846850,"icon":"2016102115480970.JPEG"}},"votes":{"down":-159,"up":1983},"created_at":1477561336,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/EIR342Y529Z6364K.jpg","content":"忍者神龟装的挺像的但我还是想揍他","state":"publish","comments_count":118,"low_url":"http://qiubai-video.qiushibaike.com/EIR342Y529Z6364K_3g.mp4","allow_comment":true,"share_count":288,"type":"hot","loop":134786},{"high_url":"http://qiubai-video.qiushibaike.com/XGD32OFQ5D4LAQVP.mp4","format":"video","image":null,"published_at":1477613701,"tag":"null","user":{"avatar_updated_at":1457539208,"uid":30162613,"last_visited_at":1440410186,"created_at":1440410186,"state":"active","last_device":"ios_6.8.4","role":"","login":"橄榄宸宸","id":30162613,"icon":"20160310000007.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117851906,"votes":{"down":-24,"up":83},"created_at":1477584054,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/XGD32OFQ5D4LAQVP.jpg","content":"都他妈有病","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/XGD32OFQ5D4LAQVP_3g.mp4","allow_comment":true,"share_count":5,"type":"fresh","loop":6433},{"high_url":"http://qiubai-video.qiushibaike.com/2UNTCUYY343C6Q97.mp4","format":"video","image":null,"published_at":1477543802,"tag":"null","user":{"avatar_updated_at":1477406629,"uid":32871938,"last_visited_at":1477406628,"created_at":1477406628,"state":"active","last_device":"android_10.4.0","role":"","login":"你的幸福请不要说","id":32871938,"icon":"201610252243497.JPEG"},"image_size":{"s":[480,480,11],"m":[480,480,11]},"id":117846358,"hot_comment":{"status":"publish","user_id":22873349,"score":null,"floor":19,"ip":"222.211.208.139","created_at":"2016-10-27 13:53:36","comment_id":367385961,"pos":0,"content":"楼主默默的脱下了裤子走过去，赶走了小孩","source":"android","like_count":104,"parent_id":0,"anonymous":0,"neg":0,"article_id":117846358,"user":{"avatar_updated_at":1416371134,"uid":22873349,"last_visited_at":1416371133,"created_at":1416371133,"state":"active","last_device":"android_3.4.3","role":"","login":"阿里路亚喂","id":22873349,"icon":"20141119202533.jpg"}},"votes":{"down":-85,"up":2052},"created_at":1477535080,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/2UNTCUYY343C6Q97.jpg","content":"你干嘛啊","state":"publish","comments_count":111,"low_url":"http://qiubai-video.qiushibaike.com/2UNTCUYY343C6Q97_3g.mp4","allow_comment":true,"share_count":251,"type":"hot","loop":196099},{"high_url":"http://qiubai-video.qiushibaike.com/NS6LVJGLDXLXFIJY.mp4","format":"video","image":null,"published_at":1477548302,"tag":"null","user":{"avatar_updated_at":1477378046,"uid":30517515,"last_visited_at":1445781128,"created_at":1445781128,"state":"active","last_device":"android_8.2.1","role":"","login":"&馨宝宝&","id":30517515,"icon":"2016102514472630.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117847148,"votes":{"down":-113,"up":1903},"created_at":1477542448,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/NS6LVJGLDXLXFIJY.jpg","content":"快来看呀，车日人啦！","state":"publish","comments_count":126,"low_url":"http://qiubai-video.qiushibaike.com/NS6LVJGLDXLXFIJY_3g.mp4","allow_comment":true,"share_count":171,"type":"hot","loop":130598},{"high_url":"http://qiubai-video.qiushibaike.com/FAWUP06UVH33APLM.mp4","format":"video","image":null,"published_at":1477544102,"tag":"null","user":{"avatar_updated_at":1470327678,"uid":24674122,"last_visited_at":1420878547,"created_at":1420878547,"state":"bonded","last_device":"android_5.0.0","role":"","login":"久念』","id":24674122,"icon":"2016080500211830.JPEG"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117845034,"votes":{"down":-35,"up":1135},"created_at":1477519905,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/FAWUP06UVH33APLM.jpg","content":"咋滴。你也想下来游会？小样","state":"publish","comments_count":32,"low_url":"http://qiubai-video.qiushibaike.com/FAWUP06UVH33APLM_3g.mp4","allow_comment":true,"share_count":47,"type":"hot","loop":144527},{"high_url":"http://qiubai-video.qiushibaike.com/HN2IKU915BFR2MA8.mp4","format":"video","image":null,"published_at":1477568102,"tag":"null","user":{"avatar_updated_at":1477368502,"uid":32760470,"last_visited_at":1475730280,"created_at":1475730280,"state":"active","last_device":"android_10.3.2","role":"","login":"心动琴弦","id":32760470,"icon":"2016102512082177.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117849369,"votes":{"down":-59,"up":839},"created_at":1477563591,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/HN2IKU915BFR2MA8.jpg","content":"气死你个萌萌","state":"publish","comments_count":26,"low_url":"http://qiubai-video.qiushibaike.com/HN2IKU915BFR2MA8_3g.mp4","allow_comment":true,"share_count":9,"loop":115431},{"high_url":"http://qiubai-video.qiushibaike.com/C63WSPKE6HTXFGR3.mp4","format":"video","image":null,"published_at":1477615501,"tag":"null","user":{"avatar_updated_at":1475032707,"uid":22906517,"last_visited_at":1416452365,"created_at":1416452365,"state":"active","last_device":"android_3.4.3","role":"","login":"笑话篓子","id":22906517,"icon":"2016092811182682.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117851255,"votes":{"down":-4,"up":67},"created_at":1477578172,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/C63WSPKE6HTXFGR3.jpg","content":"这风真是大\u2026\u2026","state":"publish","comments_count":0,"low_url":"http://qiubai-video.qiushibaike.com/C63WSPKE6HTXFGR3_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":1794},{"high_url":"http://qiubai-video.qiushibaike.com/GVCCDI9VLD4LE9UA.mp4","format":"video","image":null,"published_at":1477563002,"tag":"null","user":{"avatar_updated_at":1456581116,"uid":17341575,"last_visited_at":1404003724,"created_at":1404003724,"state":"active","last_device":"android_2.8.1","role":"","login":"武桐若_别離","id":17341575,"icon":"20160227215156.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117848573,"hot_comment":{"status":"publish","user_id":22468275,"score":null,"floor":25,"ip":"183.27.178.28","created_at":"2016-10-27 18:30:56","comment_id":367396972,"pos":0,"content":"卧槽，我以为泰迪要日她的嘴的","source":"android","like_count":268,"parent_id":0,"anonymous":0,"neg":0,"article_id":117848573,"user":{"avatar_updated_at":1452159181,"uid":22468275,"last_visited_at":1415345438,"created_at":1415345438,"state":"active","last_device":"android_3.4.2","role":"","login":"浮生若梦！！","id":22468275,"icon":"20160107173300.jpg"}},"votes":{"down":-235,"up":1691},"created_at":1477556155,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/GVCCDI9VLD4LE9UA.jpg","content":"感觉怎么样？","state":"publish","comments_count":256,"low_url":"http://qiubai-video.qiushibaike.com/GVCCDI9VLD4LE9UA_3g.mp4","allow_comment":true,"share_count":161,"type":"hot","loop":182472},{"high_url":"http://qiubai-video.qiushibaike.com/MLCVC6O3N7XLBP6C.mp4","format":"video","image":null,"published_at":1477543202,"tag":"null","user":{"avatar_updated_at":1346548012,"uid":3383483,"last_visited_at":1346547938,"created_at":1346547938,"state":"active","last_device":"android_2.0.5","role":"","login":"百大笑视频","id":3383483,"icon":"20120902170650.jpg"},"image_size":{"s":[480,480,6],"m":[480,480,6]},"id":117846700,"votes":{"down":-38,"up":1125},"created_at":1477538441,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/MLCVC6O3N7XLBP6C.jpg","content":"汪星人：敢不给我让路！","state":"publish","comments_count":21,"low_url":"http://qiubai-video.qiushibaike.com/MLCVC6O3N7XLBP6C_3g.mp4","allow_comment":true,"share_count":37,"type":"hot","loop":165363},{"high_url":"http://qiubai-video.qiushibaike.com/Y8PXEWUQOUMO7FAA.mp4","format":"video","image":null,"published_at":1477542602,"tag":"null","user":{"avatar_updated_at":1359325982,"uid":6292488,"last_visited_at":1359324108,"created_at":1359324108,"state":"bonded","last_device":"web","role":"","login":"逍遥&狂客","id":6292488,"icon":"6292488.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117846408,"votes":{"down":-72,"up":784},"created_at":1477535457,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/Y8PXEWUQOUMO7FAA.jpg","content":"玩的就是心跳！","state":"publish","comments_count":108,"low_url":"http://qiubai-video.qiushibaike.com/Y8PXEWUQOUMO7FAA_3g.mp4","allow_comment":true,"share_count":122,"loop":122629}]
     * total : 1000
     * page : 1
     * refresh : 1000
     */

    private int count;
    private int err;
    private int total;
    private int page;
    private int refresh;
    /**
     * high_url : http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE.mp4
     * format : video
     * image : null
     * published_at : 1477610102
     * tag : null
     * user : {"avatar_updated_at":1448524420,"uid":13178436,"last_visited_at":1388629650,"created_at":1388629650,"state":"active","last_device":"android_2.6.4","role":"","login":"短腿儿欧巴，！","id":13178436,"icon":"20151126155340.jpg"}
     * image_size : {"s":[480,480,15],"m":[480,480,15]}
     * id : 117850687
     * votes : {"down":-11,"up":334}
     * created_at : 1477574201
     * pic_size : [480,480]
     * pic_url : http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE.jpg
     * content : 叫你讨厌。活埋了你
     * state : publish
     * comments_count : 18
     * low_url : http://qiubai-video.qiushibaike.com/PCYQ58X3ZNW1LKJE_3g.mp4
     * allow_comment : true
     * share_count : 41
     * loop : 35454
     */

    private List<ItemsBean> items;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private String high_url;
        private String format;
        private Object image;
        private int published_at;
        private String tag;
        /**
         * avatar_updated_at : 1448524420
         * uid : 13178436
         * last_visited_at : 1388629650
         * created_at : 1388629650
         * state : active
         * last_device : android_2.6.4
         * role :
         * login : 短腿儿欧巴，！
         * id : 13178436
         * icon : 20151126155340.jpg
         */

        private UserBean user;
        private ImageSizeBean image_size;
        private int id;
        /**
         * down : -11
         * up : 334
         */

        private VotesBean votes;
        private int created_at;
        private String pic_url;
        private String content;
        private String state;
        private int comments_count;
        private String low_url;
        private boolean allow_comment;
        private int share_count;
        private int loop;
        private List<Integer> pic_size;

        public String getHigh_url() {
            return high_url;
        }

        public void setHigh_url(String high_url) {
            this.high_url = high_url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public ImageSizeBean getImage_size() {
            return image_size;
        }

        public void setImage_size(ImageSizeBean image_size) {
            this.image_size = image_size;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public VotesBean getVotes() {
            return votes;
        }

        public void setVotes(VotesBean votes) {
            this.votes = votes;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public String getLow_url() {
            return low_url;
        }

        public void setLow_url(String low_url) {
            this.low_url = low_url;
        }

        public boolean isAllow_comment() {
            return allow_comment;
        }

        public void setAllow_comment(boolean allow_comment) {
            this.allow_comment = allow_comment;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public int getLoop() {
            return loop;
        }

        public void setLoop(int loop) {
            this.loop = loop;
        }

        public List<Integer> getPic_size() {
            return pic_size;
        }

        public void setPic_size(List<Integer> pic_size) {
            this.pic_size = pic_size;
        }

        public static class UserBean {
            private int avatar_updated_at;
            private int uid;
            private int last_visited_at;
            private int created_at;
            private String state;
            private String last_device;
            private String role;
            private String login;
            private int id;
            private String icon;

            public int getAvatar_updated_at() {
                return avatar_updated_at;
            }

            public void setAvatar_updated_at(int avatar_updated_at) {
                this.avatar_updated_at = avatar_updated_at;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getLast_visited_at() {
                return last_visited_at;
            }

            public void setLast_visited_at(int last_visited_at) {
                this.last_visited_at = last_visited_at;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getLast_device() {
                return last_device;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public static class ImageSizeBean {
            private List<Integer> s;
            private List<Integer> m;

            public List<Integer> getS() {
                return s;
            }

            public void setS(List<Integer> s) {
                this.s = s;
            }

            public List<Integer> getM() {
                return m;
            }

            public void setM(List<Integer> m) {
                this.m = m;
            }
        }

        public static class VotesBean {
            private int down;
            private int up;

            public int getDown() {
                return down;
            }

            public void setDown(int down) {
                this.down = down;
            }

            public int getUp() {
                return up;
            }

            public void setUp(int up) {
                this.up = up;
            }
        }
    }
}
