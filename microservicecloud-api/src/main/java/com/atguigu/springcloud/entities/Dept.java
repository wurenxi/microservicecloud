package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/9/13 18:16
 */
@Accessors(chain = true)
@NoArgsConstructor
@Data
public class Dept implements Serializable { //Dept(Entity) orm mysql->Dept(table) 类表关系映射 必须序列化
    private Long deptno; //主键
    private String dname; //部门名称
    private String db_source; //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
