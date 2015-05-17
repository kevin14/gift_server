package com.springapp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by kevin14 on 15/4/28.
 */
@Entity
@javax.persistence.Table(name = "gbtb_product_info", schema = "", catalog = "giftBox")
public class GbtbProductInfoEntity {
    private int id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String productName;

    @Basic
    @javax.persistence.Column(name = "product_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private String productDescription;

    @Basic
    @javax.persistence.Column(name = "product_description", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    private Integer productPrice;

    @Basic
    @javax.persistence.Column(name = "product_price", nullable = true, insertable = true, updatable = true)
    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    private String productRegion;

    @Basic
    @javax.persistence.Column(name = "product_region", nullable = true, insertable = true, updatable = true, length = 2)
    public String getProductRegion() {
        return productRegion;
    }

    public void setProductRegion(String productRegion) {
        this.productRegion = productRegion;
    }

    private String productCategory;

    @Basic
    @javax.persistence.Column(name = "product_category", nullable = true, insertable = true, updatable = true, length = 2)
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    private String productTag;

    @Basic
    @javax.persistence.Column(name = "product_tag", nullable = true, insertable = true, updatable = true, length = 3)
    public String getProductTag() {
        return productTag;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    private Integer productPick;

    @Basic
    @javax.persistence.Column(name = "product_pick", nullable = true, insertable = true, updatable = true)
    public Integer getProductPick() {
        return productPick;
    }

    public void setProductPick(Integer productPick) {
        this.productPick = productPick;
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

    private Integer productRate1;

    @Basic
    @javax.persistence.Column(name = "product_rate_1", nullable = true, insertable = true, updatable = true)
    public Integer getProductRate1() {
        return productRate1;
    }

    public void setProductRate1(Integer productRate1) {
        this.productRate1 = productRate1;
    }

    private Integer productRate2;

    @Basic
    @javax.persistence.Column(name = "product_rate_2", nullable = true, insertable = true, updatable = true)
    public Integer getProductRate2() {
        return productRate2;
    }

    public void setProductRate2(Integer productRate2) {
        this.productRate2 = productRate2;
    }

    private Integer productRate3;

    @Basic
    @javax.persistence.Column(name = "product_rate_3", nullable = true, insertable = true, updatable = true)
    public Integer getProductRate3() {
        return productRate3;
    }

    public void setProductRate3(Integer productRate3) {
        this.productRate3 = productRate3;
    }

    private Integer productRate4;

    @Basic
    @javax.persistence.Column(name = "product_rate_4", nullable = true, insertable = true, updatable = true)
    public Integer getProductRate4() {
        return productRate4;
    }

    public void setProductRate4(Integer productRate4) {
        this.productRate4 = productRate4;
    }

    private Integer productRate5;

    @Basic
    @javax.persistence.Column(name = "product_rate_5", nullable = true, insertable = true, updatable = true)
    public Integer getProductRate5() {
        return productRate5;
    }

    public void setProductRate5(Integer productRate5) {
        this.productRate5 = productRate5;
    }

    private String productMainpic;

    @Basic
    @javax.persistence.Column(name = "product_mainpic", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductMainpic() {
        return productMainpic;
    }

    public void setProductMainpic(String productMainpic) {
        this.productMainpic = productMainpic;
    }

    private String productDetail;

    @Basic
    @javax.persistence.Column(name = "product_detail", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    private String productPic1;

    @Basic
    @javax.persistence.Column(name = "product_pic_1", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic1() {
        return productPic1;
    }

    public void setProductPic1(String productPic1) {
        this.productPic1 = productPic1;
    }

    private String productPic2;

    @Basic
    @javax.persistence.Column(name = "product_pic_2", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic2() {
        return productPic2;
    }

    public void setProductPic2(String productPic2) {
        this.productPic2 = productPic2;
    }

    private String productPic3;

    @Basic
    @javax.persistence.Column(name = "product_pic_3", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic3() {
        return productPic3;
    }

    public void setProductPic3(String productPic3) {
        this.productPic3 = productPic3;
    }

    private String productPic4;

    @Basic
    @javax.persistence.Column(name = "product_pic_4", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic4() {
        return productPic4;
    }

    public void setProductPic4(String productPic4) {
        this.productPic4 = productPic4;
    }

    private String productPic5;

    @Basic
    @javax.persistence.Column(name = "product_pic_5", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic5() {
        return productPic5;
    }

    public void setProductPic5(String productPic5) {
        this.productPic5 = productPic5;
    }

    private String productPic6;

    @Basic
    @javax.persistence.Column(name = "product_pic_6", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic6() {
        return productPic6;
    }

    public void setProductPic6(String productPic6) {
        this.productPic6 = productPic6;
    }

    private String productPic7;

    @Basic
    @javax.persistence.Column(name = "product_pic_7", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic7() {
        return productPic7;
    }

    public void setProductPic7(String productPic7) {
        this.productPic7 = productPic7;
    }

    private String productPic8;

    @Basic
    @javax.persistence.Column(name = "product_pic_8", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductPic8() {
        return productPic8;
    }

    public void setProductPic8(String productPic8) {
        this.productPic8 = productPic8;
    }

    private String productAlbum;

    @Basic
    @javax.persistence.Column(name = "product_album", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductAlbum() {
        return productAlbum;
    }

    public void setProductAlbum(String productAlbum) {
        this.productAlbum = productAlbum;
    }

    private String productVideo;

    @Basic
    @javax.persistence.Column(name = "product_video", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductVideo() {
        return productVideo;
    }

    public void setProductVideo(String productVideo) {
        this.productVideo = productVideo;
    }

    private String productSubTitle;

    @Basic
    @javax.persistence.Column(name = "product_sub_title", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    private String productSubDetail;

    @Basic
    @javax.persistence.Column(name = "product_sub_detail", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubDetail() {
        return productSubDetail;
    }

    public void setProductSubDetail(String productSubDetail) {
        this.productSubDetail = productSubDetail;
    }

    private String productSubcontPic1;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_1", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic1() {
        return productSubcontPic1;
    }

    public void setProductSubcontPic1(String productSubcontPic1) {
        this.productSubcontPic1 = productSubcontPic1;
    }

    private String productSubcontTitle1;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_1", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle1() {
        return productSubcontTitle1;
    }

    public void setProductSubcontTitle1(String productSubcontTitle1) {
        this.productSubcontTitle1 = productSubcontTitle1;
    }

    private String productSubcontDetail1;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_1", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail1() {
        return productSubcontDetail1;
    }

    public void setProductSubcontDetail1(String productSubcontDetail1) {
        this.productSubcontDetail1 = productSubcontDetail1;
    }

    private String productSubcontPic2;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_2", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic2() {
        return productSubcontPic2;
    }

    public void setProductSubcontPic2(String productSubcontPic2) {
        this.productSubcontPic2 = productSubcontPic2;
    }

    private String productSubcontTitle2;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_2", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle2() {
        return productSubcontTitle2;
    }

    public void setProductSubcontTitle2(String productSubcontTitle2) {
        this.productSubcontTitle2 = productSubcontTitle2;
    }

    private String productSubcontDetail2;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_2", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail2() {
        return productSubcontDetail2;
    }

    public void setProductSubcontDetail2(String productSubcontDetail2) {
        this.productSubcontDetail2 = productSubcontDetail2;
    }

    private String productSubcontPic3;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_3", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic3() {
        return productSubcontPic3;
    }

    public void setProductSubcontPic3(String productSubcontPic3) {
        this.productSubcontPic3 = productSubcontPic3;
    }

    private String productSubcontTitle3;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_3", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle3() {
        return productSubcontTitle3;
    }

    public void setProductSubcontTitle3(String productSubcontTitle3) {
        this.productSubcontTitle3 = productSubcontTitle3;
    }

    private String productSubcontDetail3;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_3", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail3() {
        return productSubcontDetail3;
    }

    public void setProductSubcontDetail3(String productSubcontDetail3) {
        this.productSubcontDetail3 = productSubcontDetail3;
    }

    private String productSubcontPic4;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_4", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic4() {
        return productSubcontPic4;
    }

    public void setProductSubcontPic4(String productSubcontPic4) {
        this.productSubcontPic4 = productSubcontPic4;
    }

    private String productSubcontTitle4;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_4", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle4() {
        return productSubcontTitle4;
    }

    public void setProductSubcontTitle4(String productSubcontTitle4) {
        this.productSubcontTitle4 = productSubcontTitle4;
    }

    private String productSubcontDetail4;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_4", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail4() {
        return productSubcontDetail4;
    }

    public void setProductSubcontDetail4(String productSubcontDetail4) {
        this.productSubcontDetail4 = productSubcontDetail4;
    }

    private String productSubcontPic5;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_5", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic5() {
        return productSubcontPic5;
    }

    public void setProductSubcontPic5(String productSubcontPic5) {
        this.productSubcontPic5 = productSubcontPic5;
    }

    private String productSubcontTitle5;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_5", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle5() {
        return productSubcontTitle5;
    }

    public void setProductSubcontTitle5(String productSubcontTitle5) {
        this.productSubcontTitle5 = productSubcontTitle5;
    }

    private String productSubcontDetail5;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_5", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail5() {
        return productSubcontDetail5;
    }

    public void setProductSubcontDetail5(String productSubcontDetail5) {
        this.productSubcontDetail5 = productSubcontDetail5;
    }

    private String productSubcontPic6;

    @Basic
    @javax.persistence.Column(name = "product_subcont_pic_6", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontPic6() {
        return productSubcontPic6;
    }

    public void setProductSubcontPic6(String productSubcontPic6) {
        this.productSubcontPic6 = productSubcontPic6;
    }

    private String productSubcontTitle6;

    @Basic
    @javax.persistence.Column(name = "product_subcont_title_6", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontTitle6() {
        return productSubcontTitle6;
    }

    public void setProductSubcontTitle6(String productSubcontTitle6) {
        this.productSubcontTitle6 = productSubcontTitle6;
    }

    private String productSubcontDetail6;

    @Basic
    @javax.persistence.Column(name = "product_subcont_detail_6", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductSubcontDetail6() {
        return productSubcontDetail6;
    }

    public void setProductSubcontDetail6(String productSubcontDetail6) {
        this.productSubcontDetail6 = productSubcontDetail6;
    }

    private String providerAddress;

    @Basic
    @javax.persistence.Column(name = "provider_address", nullable = true, insertable = true, updatable = true, length = 500)
    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    private String productList;

    @Basic
    @javax.persistence.Column(name = "product_list", nullable = true, insertable = true, updatable = true, length = 500)
    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    private String productListComment;

    @Basic
    @javax.persistence.Column(name = "product_list_comment", nullable = true, insertable = true, updatable = true, length = 200)
    public String getProductListComment() {
        return productListComment;
    }

    public void setProductListComment(String productListComment) {
        this.productListComment = productListComment;
    }

    private String productHint;

    @Basic
    @javax.persistence.Column(name = "product_hint", nullable = true, insertable = true, updatable = true, length = 500)
    public String getProductHint() {
        return productHint;
    }

    public void setProductHint(String productHint) {
        this.productHint = productHint;
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

        GbtbProductInfoEntity that = (GbtbProductInfoEntity) o;

        if (id != that.id) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productDescription != null ? !productDescription.equals(that.productDescription) : that.productDescription != null)
            return false;
        if (productPrice != null ? !productPrice.equals(that.productPrice) : that.productPrice != null) return false;
        if (productRegion != null ? !productRegion.equals(that.productRegion) : that.productRegion != null)
            return false;
        if (productCategory != null ? !productCategory.equals(that.productCategory) : that.productCategory != null)
            return false;
        if (productTag != null ? !productTag.equals(that.productTag) : that.productTag != null) return false;
        if (productPick != null ? !productPick.equals(that.productPick) : that.productPick != null) return false;
        if (productChoose != null ? !productChoose.equals(that.productChoose) : that.productChoose != null)
            return false;
        if (productRate1 != null ? !productRate1.equals(that.productRate1) : that.productRate1 != null) return false;
        if (productRate2 != null ? !productRate2.equals(that.productRate2) : that.productRate2 != null) return false;
        if (productRate3 != null ? !productRate3.equals(that.productRate3) : that.productRate3 != null) return false;
        if (productRate4 != null ? !productRate4.equals(that.productRate4) : that.productRate4 != null) return false;
        if (productRate5 != null ? !productRate5.equals(that.productRate5) : that.productRate5 != null) return false;
        if (productMainpic != null ? !productMainpic.equals(that.productMainpic) : that.productMainpic != null)
            return false;
        if (productDetail != null ? !productDetail.equals(that.productDetail) : that.productDetail != null)
            return false;
        if (productPic1 != null ? !productPic1.equals(that.productPic1) : that.productPic1 != null) return false;
        if (productPic2 != null ? !productPic2.equals(that.productPic2) : that.productPic2 != null) return false;
        if (productPic3 != null ? !productPic3.equals(that.productPic3) : that.productPic3 != null) return false;
        if (productPic4 != null ? !productPic4.equals(that.productPic4) : that.productPic4 != null) return false;
        if (productPic5 != null ? !productPic5.equals(that.productPic5) : that.productPic5 != null) return false;
        if (productPic6 != null ? !productPic6.equals(that.productPic6) : that.productPic6 != null) return false;
        if (productPic7 != null ? !productPic7.equals(that.productPic7) : that.productPic7 != null) return false;
        if (productPic8 != null ? !productPic8.equals(that.productPic8) : that.productPic8 != null) return false;
        if (productAlbum != null ? !productAlbum.equals(that.productAlbum) : that.productAlbum != null) return false;
        if (productVideo != null ? !productVideo.equals(that.productVideo) : that.productVideo != null) return false;
        if (productSubTitle != null ? !productSubTitle.equals(that.productSubTitle) : that.productSubTitle != null)
            return false;
        if (productSubDetail != null ? !productSubDetail.equals(that.productSubDetail) : that.productSubDetail != null)
            return false;
        if (productSubcontPic1 != null ? !productSubcontPic1.equals(that.productSubcontPic1) : that.productSubcontPic1 != null)
            return false;
        if (productSubcontTitle1 != null ? !productSubcontTitle1.equals(that.productSubcontTitle1) : that.productSubcontTitle1 != null)
            return false;
        if (productSubcontDetail1 != null ? !productSubcontDetail1.equals(that.productSubcontDetail1) : that.productSubcontDetail1 != null)
            return false;
        if (productSubcontPic2 != null ? !productSubcontPic2.equals(that.productSubcontPic2) : that.productSubcontPic2 != null)
            return false;
        if (productSubcontTitle2 != null ? !productSubcontTitle2.equals(that.productSubcontTitle2) : that.productSubcontTitle2 != null)
            return false;
        if (productSubcontDetail2 != null ? !productSubcontDetail2.equals(that.productSubcontDetail2) : that.productSubcontDetail2 != null)
            return false;
        if (productSubcontPic3 != null ? !productSubcontPic3.equals(that.productSubcontPic3) : that.productSubcontPic3 != null)
            return false;
        if (productSubcontTitle3 != null ? !productSubcontTitle3.equals(that.productSubcontTitle3) : that.productSubcontTitle3 != null)
            return false;
        if (productSubcontDetail3 != null ? !productSubcontDetail3.equals(that.productSubcontDetail3) : that.productSubcontDetail3 != null)
            return false;
        if (productSubcontPic4 != null ? !productSubcontPic4.equals(that.productSubcontPic4) : that.productSubcontPic4 != null)
            return false;
        if (productSubcontTitle4 != null ? !productSubcontTitle4.equals(that.productSubcontTitle4) : that.productSubcontTitle4 != null)
            return false;
        if (productSubcontDetail4 != null ? !productSubcontDetail4.equals(that.productSubcontDetail4) : that.productSubcontDetail4 != null)
            return false;
        if (productSubcontPic5 != null ? !productSubcontPic5.equals(that.productSubcontPic5) : that.productSubcontPic5 != null)
            return false;
        if (productSubcontTitle5 != null ? !productSubcontTitle5.equals(that.productSubcontTitle5) : that.productSubcontTitle5 != null)
            return false;
        if (productSubcontDetail5 != null ? !productSubcontDetail5.equals(that.productSubcontDetail5) : that.productSubcontDetail5 != null)
            return false;
        if (productSubcontPic6 != null ? !productSubcontPic6.equals(that.productSubcontPic6) : that.productSubcontPic6 != null)
            return false;
        if (productSubcontTitle6 != null ? !productSubcontTitle6.equals(that.productSubcontTitle6) : that.productSubcontTitle6 != null)
            return false;
        if (productSubcontDetail6 != null ? !productSubcontDetail6.equals(that.productSubcontDetail6) : that.productSubcontDetail6 != null)
            return false;
        if (providerAddress != null ? !providerAddress.equals(that.providerAddress) : that.providerAddress != null)
            return false;
        if (productList != null ? !productList.equals(that.productList) : that.productList != null) return false;
        if (productListComment != null ? !productListComment.equals(that.productListComment) : that.productListComment != null)
            return false;
        if (productHint != null ? !productHint.equals(that.productHint) : that.productHint != null) return false;
        if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (productRegion != null ? productRegion.hashCode() : 0);
        result = 31 * result + (productCategory != null ? productCategory.hashCode() : 0);
        result = 31 * result + (productTag != null ? productTag.hashCode() : 0);
        result = 31 * result + (productPick != null ? productPick.hashCode() : 0);
        result = 31 * result + (productChoose != null ? productChoose.hashCode() : 0);
        result = 31 * result + (productRate1 != null ? productRate1.hashCode() : 0);
        result = 31 * result + (productRate2 != null ? productRate2.hashCode() : 0);
        result = 31 * result + (productRate3 != null ? productRate3.hashCode() : 0);
        result = 31 * result + (productRate4 != null ? productRate4.hashCode() : 0);
        result = 31 * result + (productRate5 != null ? productRate5.hashCode() : 0);
        result = 31 * result + (productMainpic != null ? productMainpic.hashCode() : 0);
        result = 31 * result + (productDetail != null ? productDetail.hashCode() : 0);
        result = 31 * result + (productPic1 != null ? productPic1.hashCode() : 0);
        result = 31 * result + (productPic2 != null ? productPic2.hashCode() : 0);
        result = 31 * result + (productPic3 != null ? productPic3.hashCode() : 0);
        result = 31 * result + (productPic4 != null ? productPic4.hashCode() : 0);
        result = 31 * result + (productPic5 != null ? productPic5.hashCode() : 0);
        result = 31 * result + (productPic6 != null ? productPic6.hashCode() : 0);
        result = 31 * result + (productPic7 != null ? productPic7.hashCode() : 0);
        result = 31 * result + (productPic8 != null ? productPic8.hashCode() : 0);
        result = 31 * result + (productAlbum != null ? productAlbum.hashCode() : 0);
        result = 31 * result + (productVideo != null ? productVideo.hashCode() : 0);
        result = 31 * result + (productSubTitle != null ? productSubTitle.hashCode() : 0);
        result = 31 * result + (productSubDetail != null ? productSubDetail.hashCode() : 0);
        result = 31 * result + (productSubcontPic1 != null ? productSubcontPic1.hashCode() : 0);
        result = 31 * result + (productSubcontTitle1 != null ? productSubcontTitle1.hashCode() : 0);
        result = 31 * result + (productSubcontDetail1 != null ? productSubcontDetail1.hashCode() : 0);
        result = 31 * result + (productSubcontPic2 != null ? productSubcontPic2.hashCode() : 0);
        result = 31 * result + (productSubcontTitle2 != null ? productSubcontTitle2.hashCode() : 0);
        result = 31 * result + (productSubcontDetail2 != null ? productSubcontDetail2.hashCode() : 0);
        result = 31 * result + (productSubcontPic3 != null ? productSubcontPic3.hashCode() : 0);
        result = 31 * result + (productSubcontTitle3 != null ? productSubcontTitle3.hashCode() : 0);
        result = 31 * result + (productSubcontDetail3 != null ? productSubcontDetail3.hashCode() : 0);
        result = 31 * result + (productSubcontPic4 != null ? productSubcontPic4.hashCode() : 0);
        result = 31 * result + (productSubcontTitle4 != null ? productSubcontTitle4.hashCode() : 0);
        result = 31 * result + (productSubcontDetail4 != null ? productSubcontDetail4.hashCode() : 0);
        result = 31 * result + (productSubcontPic5 != null ? productSubcontPic5.hashCode() : 0);
        result = 31 * result + (productSubcontTitle5 != null ? productSubcontTitle5.hashCode() : 0);
        result = 31 * result + (productSubcontDetail5 != null ? productSubcontDetail5.hashCode() : 0);
        result = 31 * result + (productSubcontPic6 != null ? productSubcontPic6.hashCode() : 0);
        result = 31 * result + (productSubcontTitle6 != null ? productSubcontTitle6.hashCode() : 0);
        result = 31 * result + (productSubcontDetail6 != null ? productSubcontDetail6.hashCode() : 0);
        result = 31 * result + (providerAddress != null ? providerAddress.hashCode() : 0);
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        result = 31 * result + (productListComment != null ? productListComment.hashCode() : 0);
        result = 31 * result + (productHint != null ? productHint.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
