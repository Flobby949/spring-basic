package top.flobby.boot.mybatis.service;

import top.flobby.boot.mybatis.entity.Clazz;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/25
 * @description :
 */

public interface ClazzService {
    /**
     * 获取班级信息
     * @return
     */
    Clazz getAll();
}
