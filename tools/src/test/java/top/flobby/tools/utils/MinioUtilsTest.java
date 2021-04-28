package top.flobby.tools.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MinioUtilsTest {
    @Resource
    private MinioUtils minioUtils;

    @Test
    void putObject() throws FileNotFoundException {
        String bucketName = "flobby";
        String objectName = "/avatar/test.jpg";
        InputStream stream = new FileInputStream("E:\\idea.projects\\spring-boot-learning\\tools\\src\\main\\resources\\123.jpg");
        minioUtils.putObject(bucketName, objectName, stream);
    }
}