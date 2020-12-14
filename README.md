<h2 align="center">MyBatis-Code-Generator</h2>

---
> Mybatis代码生成器，共生成以下内容，大幅提高开发效率

1. 实体类：entity
2. 处理器：controller
3. 服务类：service
4. 实现类：serviceImpl
5. Mapper 接口：mapper
6. XML：xml

### 演示
![sample](./doc/sample.gif)

### 使用说明

1. 进入`test/com/wyc/mbgenerator/`
2. 执行`MySqlCodeGenerator`文件
3. 配置数据库
4. 输入要生成的包路径名
5. 输入要生产的模块名(如微服务的多模块)，无，输入`null`
6. 输入要生成的表，如生成全部表，请输入`all`
