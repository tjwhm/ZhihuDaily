package com.twtstudio.tjwhm.daily.main;

import java.util.List;

public class MainBean {


    /**
     * date : 20180614
     * stories : [{"images":["https://pic2.zhimg.com/v2-ae57c981fd91c40bee4e4a272efc4e99.jpg"],"type":0,"id":9686085,"ga_prefix":"061419","title":"熬夜还想身体好、效率高，你要这样还「睡眠债」"},{"images":["https://pic3.zhimg.com/v2-89cbf0b7f0c718ec3a9d91ea92b5c882.jpg"],"type":0,"id":9686446,"ga_prefix":"061417","title":"点亮这里任何一种操作，你将获得：又贵又丑的装修房"},{"title":"为什么羊没成为人们普遍养的宠物？（多图）","ga_prefix":"061416","images":["https://pic1.zhimg.com/v2-2dd237d790d952e4325ea35e4f23ec78.jpg"],"multipic":true,"type":0,"id":9686513},{"images":["https://pic1.zhimg.com/v2-e9c87c2189382d6659b7a34fea654248.jpg"],"type":0,"id":9685856,"ga_prefix":"061416","title":"大火的挤痘痘视频，我无法直视，你却欲罢不能"},{"images":["https://pic3.zhimg.com/v2-bbc1d171bb8b2302b77b40ce99d114fa.jpg"],"type":0,"id":9686490,"ga_prefix":"061416","title":"孩子与父母不亲，一定是父母的责任吗？"},{"images":["https://pic4.zhimg.com/v2-ca066f201bc3f191019de64e76c94e17.jpg"],"type":0,"id":9686491,"ga_prefix":"061413","title":"毕业租房，小心房东的神操作啊"},{"images":["https://pic3.zhimg.com/v2-695bd777923fe57e35f0d82d5df3a2fa.jpg"],"type":0,"id":9686378,"ga_prefix":"061412","title":"大误 · 亲，在吗？"},{"images":["https://pic4.zhimg.com/v2-367e0edec8455f5b82f9ff7d28709913.jpg"],"type":0,"id":9686410,"ga_prefix":"061411","title":"刚从游戏相关专业毕业，我想对有志于进入这行的人说两句"},{"images":["https://pic2.zhimg.com/v2-643343411fe71de9dc2a0f35015f7ad9.jpg"],"type":0,"id":9686289,"ga_prefix":"061410","title":"婚前为你心跳停止，婚后嫌你拉屎费纸"},{"title":"如果要给《红楼梦》十二钗分别推荐香水，我大概会这么选（多图）","ga_prefix":"061409","images":["https://pic1.zhimg.com/v2-00023de8b6808ccdc6bdb15e629da2b8.jpg"],"multipic":true,"type":0,"id":9686173},{"images":["https://pic2.zhimg.com/v2-82948fa735a3771acae2def0290955a1.jpg"],"type":0,"id":9686135,"ga_prefix":"061408","title":"为什么小孩总说能看到别人看不到的东西？"},{"images":["https://pic1.zhimg.com/v2-c05c533109fa365214779d32ceb69e1c.jpg"],"type":0,"id":9686366,"ga_prefix":"061407","title":"那年我高考 · 考场上不用考试的人"},{"images":["https://pic4.zhimg.com/v2-69c84ce5c5be85e4c8c3727e817b5453.jpg"],"type":0,"id":9686299,"ga_prefix":"061407","title":"更残酷的考验，还没落到《创造 101》这个产品头上"},{"images":["https://pic3.zhimg.com/v2-eca4ef2340b1c9ca65f2c2eb0fddedfa.jpg"],"type":0,"id":9686469,"ga_prefix":"061406","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-21e7fbd913d0f7f61e0ec7c4356f7e7c.jpg","type":0,"id":9686491,"ga_prefix":"061413","title":"毕业租房，小心房东的神操作啊"},{"image":"https://pic3.zhimg.com/v2-493aed17b72df8168b53b875dd1326e2.jpg","type":0,"id":9686410,"ga_prefix":"061411","title":"刚从游戏相关专业毕业，我想对有志于进入这行的人说两句"},{"image":"https://pic4.zhimg.com/v2-ff9c294a5ad9452687c9ac6fbaeaf647.jpg","type":0,"id":9686299,"ga_prefix":"061407","title":"更残酷的考验，还没落到《创造 101》这个产品头上"},{"image":"https://pic3.zhimg.com/v2-231f1b8ccb8cac24a1efaa4c58550826.jpg","type":0,"id":9686173,"ga_prefix":"061409","title":"如果要给《红楼梦》十二钗分别推荐香水，我大概会这么选"},{"image":"https://pic1.zhimg.com/v2-8ee060805f486ab45971972d58dc8c10.jpg","type":0,"id":9686135,"ga_prefix":"061408","title":"为什么小孩总说能看到别人看不到的东西？"}]
     */

    public String date;
    public List<StoriesBean> stories;
    public List<TopStoriesBean> top_stories;

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-ae57c981fd91c40bee4e4a272efc4e99.jpg"]
         * type : 0
         * id : 9686085
         * ga_prefix : 061419
         * title : 熬夜还想身体好、效率高，你要这样还「睡眠债」
         * multipic : true
         */

        public int type;
        public int id;
        public String ga_prefix;
        public String title;
        public boolean multipic;
        public List<String> images;
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-21e7fbd913d0f7f61e0ec7c4356f7e7c.jpg
         * type : 0
         * id : 9686491
         * ga_prefix : 061413
         * title : 毕业租房，小心房东的神操作啊
         */

        public String image;
        public int type;
        public int id;
        public String ga_prefix;
        public String title;
    }
}
