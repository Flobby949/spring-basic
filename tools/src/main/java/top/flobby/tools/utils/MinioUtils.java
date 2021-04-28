package top.flobby.tools.utils;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import top.flobby.tools.config.MinioConfig;

import javax.annotation.PostConstruct;
import java.io.InputStream;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/28
 * @description :
 */

@Component
public class MinioUtils {

    final MinioConfig config;
    private MinioClient instance;

    public MinioUtils(MinioConfig config) {
        this.config = config;
    }

    @PostConstruct
    public void init() {
        instance = MinioClient
                .builder()
                .credentials(config.getAccessKey(), config.getSecretKey())
                .endpoint(config.getEndpoint())
                .build();
    }

    /**
     * 文件上传
     *
     * @param bucketName 桶名称
     * @param objectName 文件名
     * @param stream     文件流
     */
    @SneakyThrows
    public void putObject(String bucketName, String objectName, InputStream stream) {
        PutObjectArgs args = PutObjectArgs.builder()
                .bucket(bucketName)
                .object(objectName)
                .stream(stream, stream.available(), -1)
                .build();
        instance.putObject(args);
    }
}
