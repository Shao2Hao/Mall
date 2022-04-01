package com.java1234.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * 商家小类
 */
@TableName("t_smallType")
@Data
public class SmallType implements Serializable {

    private Integer id; // 编号

    private String name; // 名称

    private String remark; // 备注

    private Integer bigTypeId; // 大类id

    @TableField(select = false)
    private BigType bigType;  // 所属商家大类

    @TableField(select = false)
    private List<Product> productList; // 商家集合

    public BigType getBigType() {
        return bigType;
    }

    public void setBigType(BigType bigType) {
        this.bigType = bigType;
    }
}
