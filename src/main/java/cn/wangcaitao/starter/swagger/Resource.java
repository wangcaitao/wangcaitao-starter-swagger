package cn.wangcaitao.starter.swagger;

import lombok.Data;

/**
 * @author wangcaitao
 */
@Data
public class Resource {

    /**
     * 标题
     */
    private String name;

    /**
     * 资源路径
     */
    private String location;
}
