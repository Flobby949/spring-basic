//package top.flobby.tools.mapper;
//
//import com.alibaba.fastjson.JSON;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import top.flobby.tools.common.TypeEnum;
//import top.flobby.tools.entity.Hots;
//import top.flobby.tools.entity.Rank;
//import top.flobby.tools.utils.JsonUtils;
//
//import javax.annotation.Resource;
//import java.time.LocalDateTime;
//import java.time.ZoneOffset;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author 231
// * @description
// * @date 2021-04-11 17:12
// */
//@SpringBootTest
//@Slf4j
//class BMapperTest {
//
//    @Resource
//    BMapper bMapper;
//
//    @Test
//    void batchInsert() {
//        String filePath = "C:/Users/Lenovo/Desktop/热门/排行榜/动画.json";
//        String jsonContent = JsonUtils.ReadFile(filePath);
//        List<Rank> videoList = new ArrayList<>();
//        List<Hots> resList = JSON.parseArray(jsonContent,Hots.class);
//        int i = 1;
//        for (Hots item : resList) {
//            // 用户id
//            Integer userId = item.getOwner().getMid();
////            播放量
//            Integer view = item.getStat().getView();
////            弹幕
//            Integer danmaku = item.getStat().getDanmaku();
////            收藏
//            Integer favorite = item.getStat().getFavorite();
////            投币
//            Integer coin = item.getStat().getCoin();
////            转发
//            Integer share = item.getStat().getShare();
////            点赞
//            Integer like = item.getStat().getLike();
////时长
//            Integer duration = item.getDuration();
////            发布时间
//            int pubdate = item.getPubdate();
//            LocalDateTime ldt = LocalDateTime.ofEpochSecond(pubdate, 0, ZoneOffset.ofHours(8));
//
////            标题
//            String title = item.getTitle();
////            封面
//            String cover = item.getPic();
//            //分数
//            Integer score = item.getScore();
//
//            Rank rank = Rank.builder()
//                    .id(i++)
//                    .userId(userId)
//                    .view(view)
//                    .danmaku(danmaku)
//                    .favorites(favorite)
//                    .coins(coin)
//                    .share(share)
//                    .like(like)
//                    .duration(duration)
//                    .pubdate(ldt)
//                    .title(title)
//                    .pic(cover)
//                    .score(score)
//                    .type(TypeEnum.DONG_HUA.getId())
//                    .build();
//            videoList.add(rank);
//        }
//        bMapper.batchInsert(videoList);
//    }
//}
