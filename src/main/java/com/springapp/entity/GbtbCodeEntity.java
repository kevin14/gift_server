package com.springapp.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by kevin14 on 15/4/28.
 */
@Entity
@Table(name = "gbtb_code", schema = "", catalog = "giftBox")
public class GbtbCodeEntity {
    private int id;
    private String codeName;
    private String codeValue;
    private String codeCatagory;
    private Timestamp createAt;
    private Timestamp updateAt;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code_name", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Basic
    @Column(name = "code_value", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    @Basic
    @Column(name = "code_catagory", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCodeCatagory() {
        return codeCatagory;
    }

    public void setCodeCatagory(String codeCatagory) {
        this.codeCatagory = codeCatagory;
    }

    @Basic
    @Column(name = "create_at", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Basic
    @Column(name = "update_at", nullable = true, insertable = true, updatable = true)
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

        GbtbCodeEntity that = (GbtbCodeEntity) o;

        if (id != that.id) return false;
        if (codeName != null ? !codeName.equals(that.codeName) : that.codeName != null) return false;
        if (codeValue != null ? !codeValue.equals(that.codeValue) : that.codeValue != null) return false;
        if (codeCatagory != null ? !codeCatagory.equals(that.codeCatagory) : that.codeCatagory != null) return false;
        if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codeName != null ? codeName.hashCode() : 0);
        result = 31 * result + (codeValue != null ? codeValue.hashCode() : 0);
        result = 31 * result + (codeCatagory != null ? codeCatagory.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
