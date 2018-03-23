package com.cyyz.cy_system.domain.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sa_StampQuoteItem")
public class SaStampquoteitem {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "StampQuoteID")
    private Integer stampquoteid;

    @Column(name = "OrderNum")
    private Integer ordernum;

    @Column(name = "StampOrdersID")
    private Integer stampordersid;

    @Column(name = "StampMaterial")
    private String stampmaterial;

    @Column(name = "cInvStd")
    private String cinvstd;

    @Column(name = "iQuality")
    private Double iquality;

    @Column(name = "iUnitPrice")
    private Double iunitprice;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "cInvName")
    private String cinvname;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return StampQuoteID
     */
    public Integer getStampquoteid() {
        return stampquoteid;
    }

    /**
     * @param stampquoteid
     */
    public void setStampquoteid(Integer stampquoteid) {
        this.stampquoteid = stampquoteid;
    }

    /**
     * @return OrderNum
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * @param ordernum
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * @return StampOrdersID
     */
    public Integer getStampordersid() {
        return stampordersid;
    }

    /**
     * @param stampordersid
     */
    public void setStampordersid(Integer stampordersid) {
        this.stampordersid = stampordersid;
    }

    /**
     * @return StampMaterial
     */
    public String getStampmaterial() {
        return stampmaterial;
    }

    /**
     * @param stampmaterial
     */
    public void setStampmaterial(String stampmaterial) {
        this.stampmaterial = stampmaterial;
    }

    /**
     * @return cInvStd
     */
    public String getCinvstd() {
        return cinvstd;
    }

    /**
     * @param cinvstd
     */
    public void setCinvstd(String cinvstd) {
        this.cinvstd = cinvstd;
    }

    /**
     * @return iQuality
     */
    public Double getIquality() {
        return iquality;
    }

    /**
     * @param iquality
     */
    public void setIquality(Double iquality) {
        this.iquality = iquality;
    }

    /**
     * @return iUnitPrice
     */
    public Double getIunitprice() {
        return iunitprice;
    }

    /**
     * @param iunitprice
     */
    public void setIunitprice(Double iunitprice) {
        this.iunitprice = iunitprice;
    }

    /**
     * @return CreateDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return cInvName
     */
    public String getCinvname() {
        return cinvname;
    }

    /**
     * @param cinvname
     */
    public void setCinvname(String cinvname) {
        this.cinvname = cinvname;
    }
}