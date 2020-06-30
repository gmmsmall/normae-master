package com.galaxyt.normae.uaa.pojo.po;

import com.baomidou.mybatisplus.annotation.*;
import com.galaxyt.normae.uaa.enums.Disabled;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 角色表
 * @author zhouqi
 * @date 2020/5/20 10:19
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2020/5/20 10:19     zhouqi          v1.0.0           Created
 *
 */
@Data
@TableName("t_role")
public class Role {


    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 角色名称
     */
    @TableField("name")
    private String name;

    /**
     * 角色标识
     */
    @TableField("mark")
    private String mark;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建者主键id
     */
    @TableField("create_user_id")
    private Long createUserId;

    /**
     * 修改者主键id
     */
    @TableField("update_user_id")
    private Long updateUserId;

    /**
     * 是否启用
     */
    @TableField("disabled")
    private Disabled disabled;

    /**
     * 逻辑删除
     * 1: 已删除  0: 未删除
     */
    @TableLogic
    private Integer deleted;

}
