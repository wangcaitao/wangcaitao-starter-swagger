package cn.wangcaitao.starter.swagger;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangcaitao
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    private boolean enable;
    private String basePackage;
    private String title;
    private String description;
    private Contact contact;
    private String version;

    @Getter
    @Setter
    public static class Contact {
        private String name;
        private String url;
        private String email;
    }
}
