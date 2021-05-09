package com.peng.server.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_result")
@ApiModel(value="Result对象", description="")
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long sid;

    private Long tid;

    private Long id;

    private Long grade;

    private Long cid;

    @ApiModelProperty(value="返回结果")
    @TableField(exist = false)
    private Integer result;
}
