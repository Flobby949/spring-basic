package top.flobby.tools.mapper;

import org.apache.ibatis.annotations.Param;
import top.flobby.tools.entity.Rank;

import java.util.List;

/**
 * @author 231
 * @description
 * @date 2021-04-11 16:59
 */
public interface BMapper {
    int batchInsert(@Param("rank") List<Rank> rank);
}
