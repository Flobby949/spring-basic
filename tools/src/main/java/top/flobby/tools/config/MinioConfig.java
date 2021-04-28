package top.flobby.tools.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/28
 * @description :
 */

@Data
@ConfigurationProperties(prefix = "minio")
public class MinioConfig {

    private String endpoint;

    private String accessKey;

    private String secretKey;
}
