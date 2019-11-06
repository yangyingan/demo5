package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import java.io.Serializable;

@Data
@TableName("t_user")
public class User extends Model<User> {
    @TableId(type= IdType.ID_WORKER)
    private Integer id;
    @TableField("name")
    private String name;
    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public static final String ID="id";
    public static final String  NAME="name";
}
