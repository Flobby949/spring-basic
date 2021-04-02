package top.flobby.boot.mbp.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.flobby.boot.mbp.domain.Admin;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AdminMapperTest {
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void testInsert() {
        Admin admin = Admin.builder()
                .name("张三")
                .age(20)
                .email("zhangsan@qq.com")
                .build();
        int row = adminMapper.insert(admin);
        assertEquals(1, row);
    }

    @Test
    void testDelete() {
        int row = adminMapper.deleteById(1377983547844890625L);
        assertEquals(1, row);
    }
}