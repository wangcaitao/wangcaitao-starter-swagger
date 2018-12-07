package cn.wangcaitao.starter.swagger;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * swagger 配置信息
 *
 * @author wangcaitao
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    /**
     * 是否启用
     */
    private boolean enable;

    /**
     * 扫描包
     */
    private String basePackage;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 开发者
     */
    private Contact contact;

    /**
     * 版本
     */
    private String version;

    /**
     * 资源
     */
    private List<Resource> resources;

    @Getter
    @Setter
    public static class Contact {

        /**
         * 姓名
         */
        private String name;

        /**
         * 邮箱
         */
        private String url;

        /**
         * 地址
         */
        private String email;
    }
}
