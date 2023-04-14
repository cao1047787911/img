package cn.iqis.aftersale.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 售后材料信息表
 * @author hw
 * @since 2021-09-26
 */
@Data
public class MaterialDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 材料编号
     */
    private String materialid;

    /**
     * 材料名称
     */
    private String materialname;

    /**
     * 大总成
     */
    private String bigAssembly;

    /**
     * 总成分类
     */
    private String assemblytype;

    /**
     * 材料分类
     */
    private String materialtype;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


}
