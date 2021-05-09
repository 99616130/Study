package com.peng.server.pojo;

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
 * @since 2021-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_exam")
@ApiModel(value="Exam对象", description="")
public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "星期")
    private Long week;

    @ApiModelProperty(value = "节次")
    private Long section;

    @ApiModelProperty(value = "监考老师编号")
    private Long teacher_id;

    @ApiModelProperty(value = "课程编号")
    private Long course_id;

    @ApiModelProperty(value = "班级编号")
    private Long class_id;

    @ApiModelProperty(value = "课程名")
    private String course_name;

    @ApiModelProperty(value = "教师名")
    private String teacher_name;

    @ApiModelProperty(value = "id")
    private Long id;


}
