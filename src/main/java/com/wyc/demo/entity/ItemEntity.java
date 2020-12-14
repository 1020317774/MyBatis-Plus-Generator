package com.wyc.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * item商品表
 * </p>
 *
 * @author knox
 * @since 2020-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("item")
@ApiModel(value="ItemEntity对象", description="item商品表")
public class ItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "标题")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "分类")
    @TableField("category")
    private String category;

    @ApiModelProperty(value = "品牌")
    @TableField("brand")
    private String brand;

    @ApiModelProperty(value = "价格")
    @TableField("price")
    private Double price;

    @ApiModelProperty(value = "图片")
    @TableField("thumbnail")
    private String thumbnail;


}
