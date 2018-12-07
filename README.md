# wangcaitao-starter-swagger

## 环境说明

* jdk1.8
* spring-boot-1.5.4.RELEASE
* springfox-swagger2-2.7.0
* springfox-swagger-ui-2.7.0

## 使用说明

* 在 `pom.xml` 添加 maven 依赖
    ```xml
    <dependency>
        <groupId>cn.wangcaitao</groupId>
        <artifactId>wangcaitao-starter-swagger</artifactId>
        <version>1.1.0</version>
    </dependency>
    ```
* 在 `application.yml` 中添加配置信息
    ```yaml
    swagger:
      enable:
      title:
      description:
      base-package:
      contact:
        name:
        email:
        url:
     version:
     resources:
       - {name: "", location: ""}
    ```
* 访问路径  
    GET `/swagger-ui.html`

## 参数说明

| 参数                       | 说明     | 示例值                   |
| -------------------------- | -------- | ------------------------ |
| swagger.enable             | 是否启用 | true                     |
| swagger.title              | 标题     | restful apis             |
| swagger.description        | 描述     | restful apis description |
| swagger.base-package       | 扫描包   | cn.wangcaitao.controller |
| swagger.contact.name       | 作者     | wangcaitao               |
| swagger.contact.email      | 邮箱     | wangcaitao@aliyun.com    |
| swagger.contact.url        | 地址     | www.wangcaitao.cn        |
| swagger.version            | 版本     | 1.0.0                    |
| swagger.resources.name     | 列表标题 | 第一行                   |
| swagger.resources.location | 资源路径 | /v2/api-docs             |
