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
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_schedule")
@ApiModel(value="Schedule对象", description="")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "星期")
    private Long week;

    @ApiModelProperty(value = "节次")
    private Long section;

    @ApiModelProperty(value = "授课老师编号")
    private Long teacher_id;

    @ApiModelProperty(value = "班级编号")
    private Long class_id;

    @ApiModelProperty(value = "课程id")
    private Long course_id;

    @ApiModelProperty(value = "课程名")
    private String course_name;

    @ApiModelProperty(value = "教师名")
    private String teacher_name;

    @ApiModelProperty(value = "课程表id")
    private Long id;

    @ApiModelProperty(value="返回结果")
    @TableField(exist = false)
    private Integer result;

}
