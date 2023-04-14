package cn.iqis.aftersale.dto;

import cn.iqis.common.dto.DtoBase;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author hw
 * @since 2021-10-19
 */
@Data
public class MalfunctionDto extends DtoBase {


    /**
     * id
     */
    private Long id;

    /**
     * 返件时间
     */
    private String returnTime;

    /**
     * 提前返件编号
     */
    private String returnId;

    /**
     * 车系
     */
    private String combineCarSeries;

    /**
     * 服务站号
     */
    private String storeCode;

    /**
     * 服务站名称
     */
    private String storeName;

    /**
     * 发动机编号
     */
    private String engineCode;

    /**
     * 故障描述
     */
    private String breakdownDescribe;

    /**
     * 底盘号
     */
    private String vin;
    /**
     * 材料号
     */
    private String materialNumber;

    /**
     * 材料名称(零部件名称)
     */
    private String materialName;

    /**
     * 故障分类
     */
    private String faultType;

    /**
     * 到件日期
     */
    private String toDate;

    /**
     * 接收人
     */
    private String recipient;

    /**
     * 故障件数量
     */
    private String faultNumber;

    /**
     * 认领人
     */
    private String pointPreson;

    /**
     * 故障件厂家
     */
    private String faultManufacturer;

    /**
     * 故障分析报告出具时间
     */
    private String analysisReportIssuingDate;

    /**
     * 故障分析结论
     */
    private String analysisConclusion;

    /**
     * 责任方
     */
    private String responsibility;

    /**
     * 故障分析报告申请人
     */
    private String analysisApplicant;

    /**
     * 故障分析报告审核人编号
     */
    private Long analysisCheckerId;

    /**
     * 故障分析报告审核人名称
     */
    private String analysisCheckerName;

    /**
     * 故障分析报告审批意见
     */
    private String analysisOpintion;

    /**
     * 故障分析报告状态
     */
    private Long analysisStatus;

    /**
     * 归档时间
     */
    private String archiveDate;

    /**
     * 是否为NTF
     */
    private String isntf;

    /**
     * 变更类型
     */
    private String changeType;

    /**
     * 最新进度
     */
    private String latestProgress;

    /**
     * 延期日期（节点）
     */
    private String delayDate;

    /**
     * 延期申请人
     */
    private String deferredApplicant;

    /**
     * 延期审核人编号
     */
    private Long deferredCheckerId;

    /**
     * 延期审核人名称
     */
    private String deferredCheckerName;

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
     * 处置方式
     */
    private String disposalWay;

    /**
     * 处置时间
     */
    private String disposalDate;

    /**
     * 原因
     */
    private String disposalReason;

    /**
     * 预警灯
     */
    private Integer warningLights;

    /**
     * 状态
     */
    private Long status;

    /**
     * 整改状态
     */
    private Long rectificationStatus;

    /**
     * 售后表Id
     */
    private Long aftersaleId;

    /**
     * 接收备注
     */
    private String receptioncomment;

    /**
     * 认领备注
     */
    private String claimcomment;

    /**
     * 附件集合
     */
    private List<MalfunctionAccessoryDto> accessoryList;

    /**
     * 材料详情表集合
     */
    private List<MaterialDetailDto> materialDetailList;

    /**
     * 整车车型
     */
    private String modelCode;

    /**
     * 行驶里程
     */
    private Double mileage;

    /**
     * 分析原因
     */
    private String analyzeReason;

    /**
     * 处理结果
     */
    private String treatmentResult;

    /**
     * 索赔单号
     */
    private String applicationNumber;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createPeople;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 认领时间
     */
    private String pointDate;


    /**
     * 修改人
     */
    private String updatePeople;

    /**
     * 责任部门
     */
    private String responsibleDepartment;

    /**
     * 故障类别
     */
    private String faultCategory;

    /**
     * 是否为供应商责任 1.是 2.否
     */
    private Integer isSupplierDuty;

    /**
     * 责任供应商
     */
    private String dutySupplier;

    /**
     * 故障件批次号
     */
    private String faultBatchNumber;
}
