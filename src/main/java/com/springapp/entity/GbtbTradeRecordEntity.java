package com.springapp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by kevin14 on 15/4/28.
 */
@Entity
@javax.persistence.Table(name = "gbtb_trade_record", schema = "", catalog = "giftBox")
public class GbtbTradeRecordEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Integer recordId;

    @Basic
    @javax.persistence.Column(name = "record_id", nullable = true, insertable = true, updatable = true)
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    private Integer fetchCode;

    @Basic
    @javax.persistence.Column(name = "fetch_code", nullable = true, insertable = true, updatable = true)
    public Integer getFetchCode() {
        return fetchCode;
    }

    public void setFetchCode(Integer fetchCode) {
        this.fetchCode = fetchCode;
    }

    private Integer userId;

    @Basic
    @javax.persistence.Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer orderPrice;

    @Basic
    @javax.persistence.Column(name = "order_price", nullable = true, insertable = true, updatable = true)
    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    private String orderRegion;

    @Basic
    @javax.persistence.Column(name = "order_region", nullable = true, insertable = true, updatable = true, length = 2)
    public String getOrderRegion() {
        return orderRegion;
    }

    public void setOrderRegion(String orderRegion) {
        this.orderRegion = orderRegion;
    }

    private String orderStatus;

    @Basic
    @javax.persistence.Column(name = "order_status", nullable = true, insertable = true, updatable = true, length = 2)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    private Integer productId1;

    @Basic
    @javax.persistence.Column(name = "product_id_1", nullable = true, insertable = true, updatable = true)
    public Integer getProductId1() {
        return productId1;
    }

    public void setProductId1(Integer productId1) {
        this.productId1 = productId1;
    }

    private Integer productId2;

    @Basic
    @javax.persistence.Column(name = "product_id_2", nullable = true, insertable = true, updatable = true)
    public Integer getProductId2() {
        return productId2;
    }

    public void setProductId2(Integer productId2) {
        this.productId2 = productId2;
    }

    private Integer productId3;

    @Basic
    @javax.persistence.Column(name = "product_id_3", nullable = true, insertable = true, updatable = true)
    public Integer getProductId3() {
        return productId3;
    }

    public void setProductId3(Integer productId3) {
        this.productId3 = productId3;
    }

    private Integer productId4;

    @Basic
    @javax.persistence.Column(name = "product_id_4", nullable = true, insertable = true, updatable = true)
    public Integer getProductId4() {
        return productId4;
    }

    public void setProductId4(Integer productId4) {
        this.productId4 = productId4;
    }

    private Integer productId5;

    @Basic
    @javax.persistence.Column(name = "product_id_5", nullable = true, insertable = true, updatable = true)
    public Integer getProductId5() {
        return productId5;
    }

    public void setProductId5(Integer productId5) {
        this.productId5 = productId5;
    }

    private Integer productId6;

    @Basic
    @javax.persistence.Column(name = "product_id_6", nullable = true, insertable = true, updatable = true)
    public Integer getProductId6() {
        return productId6;
    }

    public void setProductId6(Integer productId6) {
        this.productId6 = productId6;
    }

    private Integer productChoose;

    @Basic
    @javax.persistence.Column(name = "product_choose", nullable = true, insertable = true, updatable = true)
    public Integer getProductChoose() {
        return productChoose;
    }

    public void setProductChoose(Integer productChoose) {
        this.productChoose = productChoose;
    }

    private String giverName;

    @Basic
    @javax.persistence.Column(name = "giver_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }

    private byte[] giverCell;

    @Basic
    @javax.persistence.Column(name = "giver_cell", nullable = true, insertable = true, updatable = true)
    public byte[] getGiverCell() {
        return giverCell;
    }

    public void setGiverCell(byte[] giverCell) {
        this.giverCell = giverCell;
    }

    private String giverEmail;

    @Basic
    @javax.persistence.Column(name = "giver_email", nullable = true, insertable = true, updatable = true, length = 30)
    public String getGiverEmail() {
        return giverEmail;
    }

    public void setGiverEmail(String giverEmail) {
        this.giverEmail = giverEmail;
    }

    private String recevierName;

    @Basic
    @javax.persistence.Column(name = "recevier_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getRecevierName() {
        return recevierName;
    }

    public void setRecevierName(String recevierName) {
        this.recevierName = recevierName;
    }

    private byte[] receiverCell;

    @Basic
    @javax.persistence.Column(name = "receiver_cell", nullable = true, insertable = true, updatable = true)
    public byte[] getReceiverCell() {
        return receiverCell;
    }

    public void setReceiverCell(byte[] receiverCell) {
        this.receiverCell = receiverCell;
    }

    private String receiverEmail;

    @Basic
    @javax.persistence.Column(name = "receiver_email", nullable = true, insertable = true, updatable = true, length = 30)
    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    private String orderComment;

    @Basic
    @javax.persistence.Column(name = "order_comment", nullable = true, insertable = true, updatable = true, length = 200)
    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    private String orderExpire;

    @Basic
    @javax.persistence.Column(name = "order_expire", nullable = true, insertable = true, updatable = true, length = 8)
    public String getOrderExpire() {
        return orderExpire;
    }

    public void setOrderExpire(String orderExpire) {
        this.orderExpire = orderExpire;
    }

    private Timestamp createAt;

    @Basic
    @javax.persistence.Column(name = "create_at", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    private Timestamp updateAt;

    @Basic
    @javax.persistence.Column(name = "update_at", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GbtbTradeRecordEntity that = (GbtbTradeRecordEntity) o;

        if (id != that.id) return false;
        if (recordId != null ? !recordId.equals(that.recordId) : that.recordId != null) return false;
        if (fetchCode != null ? !fetchCode.equals(that.fetchCode) : that.fetchCode != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (orderPrice != null ? !orderPrice.equals(that.orderPrice) : that.orderPrice != null) return false;
        if (orderRegion != null ? !orderRegion.equals(that.orderRegion) : that.orderRegion != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (productId1 != null ? !productId1.equals(that.productId1) : that.productId1 != null) return false;
        if (productId2 != null ? !productId2.equals(that.productId2) : that.productId2 != null) return false;
        if (productId3 != null ? !productId3.equals(that.productId3) : that.productId3 != null) return false;
        if (productId4 != null ? !productId4.equals(that.productId4) : that.productId4 != null) return false;
        if (productId5 != null ? !productId5.equals(that.productId5) : that.productId5 != null) return false;
        if (productId6 != null ? !productId6.equals(that.productId6) : that.productId6 != null) return false;
        if (productChoose != null ? !productChoose.equals(that.productChoose) : that.productChoose != null)
            return false;
        if (giverName != null ? !giverName.equals(that.giverName) : that.giverName != null) return false;
        if (!Arrays.equals(giverCell, that.giverCell)) return false;
        if (giverEmail != null ? !giverEmail.equals(that.giverEmail) : that.giverEmail != null) return false;
        if (recevierName != null ? !recevierName.equals(that.recevierName) : that.recevierName != null) return false;
        if (!Arrays.equals(receiverCell, that.receiverCell)) return false;
        if (receiverEmail != null ? !receiverEmail.equals(that.receiverEmail) : that.receiverEmail != null)
            return false;
        if (orderComment != null ? !orderComment.equals(that.orderComment) : that.orderComment != null) return false;
        if (orderExpire != null ? !orderExpire.equals(that.orderExpire) : that.orderExpire != null) return false;
        if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (recordId != null ? recordId.hashCode() : 0);
        result = 31 * result + (fetchCode != null ? fetchCode.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (orderPrice != null ? orderPrice.hashCode() : 0);
        result = 31 * result + (orderRegion != null ? orderRegion.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (productId1 != null ? productId1.hashCode() : 0);
        result = 31 * result + (productId2 != null ? productId2.hashCode() : 0);
        result = 31 * result + (productId3 != null ? productId3.hashCode() : 0);
        result = 31 * result + (productId4 != null ? productId4.hashCode() : 0);
        result = 31 * result + (productId5 != null ? productId5.hashCode() : 0);
        result = 31 * result + (productId6 != null ? productId6.hashCode() : 0);
        result = 31 * result + (productChoose != null ? productChoose.hashCode() : 0);
        result = 31 * result + (giverName != null ? giverName.hashCode() : 0);
        result = 31 * result + (giverCell != null ? Arrays.hashCode(giverCell) : 0);
        result = 31 * result + (giverEmail != null ? giverEmail.hashCode() : 0);
        result = 31 * result + (recevierName != null ? recevierName.hashCode() : 0);
        result = 31 * result + (receiverCell != null ? Arrays.hashCode(receiverCell) : 0);
        result = 31 * result + (receiverEmail != null ? receiverEmail.hashCode() : 0);
        result = 31 * result + (orderComment != null ? orderComment.hashCode() : 0);
        result = 31 * result + (orderExpire != null ? orderExpire.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
