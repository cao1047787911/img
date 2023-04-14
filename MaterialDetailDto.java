package cn.iqis.aftersale.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author hw
 * @since 2021-10-29
 */
@Data
public class MaterialDetailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 故障件信息表管理id
     */
    private Long faliureinfoId;

    /**
     * 材料编号
     */
    private String materialId;

    /**
     * 材料名称
     */
    private String materialName;

    /**
     * 故障件数量
     */
    private Long failureNum;

    /**
     * 故障分类
     */
    private String failureType;

    /**
     * 故障件分类
     */
    private String failurepartsType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
