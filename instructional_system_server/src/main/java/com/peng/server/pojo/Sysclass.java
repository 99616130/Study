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
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_sysclass")
@ApiModel(value="Sysclass对象", description="")
public class Sysclass implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "班级编号")
    private Long id;

    @ApiModelProperty(value = "班级名")
    private String name;


}
