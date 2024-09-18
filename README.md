# Description

Sample repo showcasing an issue for Spring Boot version 2.x and newer versions of p6spy-spring-boot-starter

## Issue description

Properties related to the decorator library are ignored. The **spy.log** is generated on app startup (due to DDL statements that creates the test table) even though the logging is explicitly disabled via the following property:

```
  decorator.datasource:
      p6spy:
        enable-logging: false
```

## How to reproduce

Just start the app and due to the DDL statements being executed to create the test table the **spy.log** file will be generated automatically.

If you want to dynamically trigger an execution of an SQL query just use the following test endpoint:

- /rest/hello/{name}