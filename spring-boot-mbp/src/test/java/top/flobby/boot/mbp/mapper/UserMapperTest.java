package top.flobby.boot.mbp.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.flobby.boot.mbp.domain.User;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void save() {
        User user = User.builder()
                .name("fffffff")
                .age(20)
                .email("fff@qq.com")
                .build();
        int rows = userMapper.insert(user);
        assertEquals(1, rows);
    }

    @Test
    void deleteById() {
        int rows = userMapper.deleteById(1376708510928080897L);
        assertEquals(1, rows);
    }

    @Test
    void selectById() {
        User user = userMapper.selectById(1376706211665215490L);
        log.info("###########" + user);
        assertEquals(1376706211665215490L, user.getId());
    }

    @Test
    void batchDelete() {
        List<Long> ids = new ArrayList<>();
        ids.add(1376701712674381825L);
        ids.add(1376703607883218945L);
        ids.add(1376703654687473665L);
        int rows = userMapper.deleteBatchIds(ids);
        assertEquals(3, rows);
    }

    @Test
    void update() {
        User user = User.builder()
                .id(1376706211665215490L)
                .name("update")
                .age(19)
                .email("update@qq.com")
                .build();
        int rows = userMapper.updateById(user);
        assertEquals(1, rows);
    }

    @Test
    void deleteByMap() {
        Map<String, Object> map = new HashMap<>();
        // map.put("name", "fff");
        map.put("age", 23);
        int rows = userMapper.deleteByMap(map);
        assertEquals(2, rows);
    }

    @Test
    void selectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "bbb");
        List<User> userList = userMapper.selectByMap(map);
        userList.forEach(System.out::println);
        assertEquals(1, userList.size());
    }
}