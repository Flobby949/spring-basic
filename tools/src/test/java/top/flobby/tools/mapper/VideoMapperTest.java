package top.flobby.tools.mapper;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.flobby.tools.entity.*;
import top.flobby.tools.utils.JsonUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class VideoMapperTest {
    @Resource
    private VideoMapper videoMapper;

    @Test
    void batchInsertHot() {
        String filePath = "E:/idea.projects/spring-boot-learning/tools/src/main/resources/a.json";
        String jsonContent = JsonUtils.ReadFile(filePath);
        List<Video> videoList = new ArrayList<>();
        List<Hots> resList = JSON.parseArray(jsonContent,Hots.class);
        System.out.println(resList.size());
        int i = 1;
        for (Hots item : resList) {
            // 用户id
            Integer userId = item.getOwner().getMid();
//            播放量
            Integer view = item.getStat().getView();
//            弹幕
            Integer danmaku = item.getStat().getDanmaku();
//            收藏
            Integer favorite = item.getStat().getFavorite();
//            投币
            Integer coin = item.getStat().getCoin();
//            转发
            Integer share = item.getStat().getShare();
//            点赞
            Integer like = item.getStat().getLike();
//时长
            Integer duration = item.getDuration();
//            发布时间
            Integer pubdate = item.getPubdate();
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(pubdate, 0, ZoneOffset.ofHours(8));
//            标题
            String title = item.getTitle();
//            封面
            String cover = item.getPic();
//            推荐原因
            String content = item.getRcmd_reason().getContent();
            if (content.isEmpty()){
                content = "无";
            }
            Video video = Video.builder()
                    .id(i++)
                    .userId(userId)
                    .view(view)
                    .danmaku(danmaku)
                    .favorites(favorite)
                    .coins(coin)
                    .share(share)
                    .like(like)
                    .duration(duration)
                    .pubdate(ldt)
                    .title(title)
                    .pic(cover)
                    .content(content)
                    .build();
            videoList.add(video);
        }
        videoMapper.batchInsert(videoList);
    }
//
    @Test
    void batchInsertWeek() {
        String filePath = "C:/Users/Lenovo/Desktop/热门/每周必看.json";
        String jsonContent = JsonUtils.ReadFile(filePath);
        List<VideoWeek> videoList = new ArrayList<>();
        List<Week> resList = JSON.parseArray(jsonContent,Week.class);
        System.out.println(resList.size());
        int i = 1;
        for (Week item : resList) {
            // 用户id
            Integer userId = item.getOwner().getMid();
//            播放量
            Integer view = item.getStat().getView();
//            弹幕
            Integer danmaku = item.getStat().getDanmaku();
//            收藏
            Integer favorite = item.getStat().getFavorite();
//            投币
            Integer coin = item.getStat().getCoin();
//            转发
            Integer share = item.getStat().getShare();
//            点赞
            Integer like = item.getStat().getLike();
//时长
            Integer duration = item.getDuration();
//            发布时间
            int pubdate = item.getCtime();
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(pubdate, 0, ZoneOffset.ofHours(8));
//            标题
            String title = item.getTitle();
//            封面
            String cover = item.getPic();
//            推荐原因
            String content = item.getRcmd_reason();
            if (content.isEmpty()){
                content = "无";
            }
            VideoWeek video = VideoWeek.builder()
                    .id(i++)
                    .userId(userId)
                    .view(view)
                    .danmaku(danmaku)
                    .favorites(favorite)
                    .coins(coin)
                    .share(share)
                    .like(like)
                    .duration(duration)
                    .pubdate(ldt)
                    .title(title)
                    .pic(cover)
                    .reason(content)
                    .build();
            videoList.add(video);
        }
        videoMapper.batchInsertWeek(videoList);
    }
//
    @Test
    void batchInsertMust() {
        String filePath = "C:/Users/Lenovo/Desktop/热门/入站必刷.json";
        String jsonContent = JsonUtils.ReadFile(filePath);
        List<VideoMust> videoList = new ArrayList<>();
        List<MustSee> resList = JSON.parseArray(jsonContent,MustSee.class);
        System.out.println(resList.size());
        int i = 1;
        for (MustSee item : resList) {
            // 用户id
            Integer userId = item.getOwner().getMid();
//            播放量
            Integer view = item.getStat().getView();
//            弹幕
            Integer danmaku = item.getStat().getDanmaku();
//            收藏
            Integer favorite = item.getStat().getFavorite();
//            投币
            Integer coin = item.getStat().getCoin();
//            转发
            Integer share = item.getStat().getShare();
//            点赞
            Integer like = item.getStat().getLike();
//时长
            Integer duration = item.getDuration();
//            发布时间
            int pubdate = item.getCtime();
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(pubdate, 0, ZoneOffset.ofHours(8));

//            标题
            String title = item.getTitle();
//            封面
            String cover = item.getPic();
//            推荐原因
            String content = item.getAchievement();
            if (content.isEmpty()){
                content = "无";
            }
            VideoMust video = VideoMust.builder()
                    .id(i++)
                    .userId(userId)
                    .view(view)
                    .danmaku(danmaku)
                    .favorites(favorite)
                    .coins(coin)
                    .share(share)
                    .like(like)
                    .duration(duration)
                    .pubdate(ldt)
                    .title(title)
                    .pic(cover)
                    .achievement(content)
                    .build();
            videoList.add(video);
        }
        videoMapper.batchInsertMust(videoList);
    }
}