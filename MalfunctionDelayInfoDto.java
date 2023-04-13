package cn.iqis.aftersale.dto;

import cn.iqis.common.dto.DtoBase;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hw
 * @since 2021-10-19
 */
@Data
public class MalfunctionDelayInfoDto extends DtoBase {


    /**
     * id
     */
    private Long id;

    /**
     * 故障返件编号
     */
    private Long returnId;

    /**
     * 延期日期（节点）
     */
    private String delayDate;

    /**
     * 延期申请人
     */
    private String deferredApplicant;

    /**
     * 延期审核人
     */
    private String deferredChecker;

    /**
     * 延期审核状态
     */
    private Long deferredStatus;

    /**
     * 延期审批意见
     */
    private String deferredOpinion;

    /**
     * 延期次数
     */
    private Long deferredCount;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createPeople;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updatePeople;


}
