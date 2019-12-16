package com.sweet.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 宋德能
 * @date 2019年12月16日---上午 11:43
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {

    private Integer deptno; // 主键
    private String dname; // 部门名称
    private String db_source; // 来自哪个数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
