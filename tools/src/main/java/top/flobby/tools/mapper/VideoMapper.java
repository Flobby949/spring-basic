package top.flobby.tools.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.flobby.tools.entity.Video;
import top.flobby.tools.entity.VideoMust;
import top.flobby.tools.entity.VideoWeek;

import java.util.List;

public interface VideoMapper extends BaseMapper<Video> {
    /**
     * 批量新增
     *
     * @param
     * @return int
     */
    int batchInsert(@Param("videoList") List<Video> videoList);


    int batchInsertWeek(@Param("videoList") List<VideoWeek> videoList);


    int batchInsertMust(@Param("videoList") List<VideoMust> videoList);
}