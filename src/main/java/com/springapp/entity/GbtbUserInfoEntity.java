package com.springapp.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by kevin14 on 15/4/28.
 */
@Entity
@Table(name = "gbtb_user_info", schema = "", catalog = "giftBox")
public class GbtbUserInfoEntity {
    private int id;
    private String loginId;
    private String userName;
    private String loginPwd;
    private String loginToken;
    private byte[] cell;
    private String email;
    private String contactOther;
    private String headPortrait;
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
    @Column(name = "login_id", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "login_pwd", nullable = true, insertable = true, updatable = true, length = 32)
    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Basic
    @Column(name = "login_token", nullable = true, insertable = true, updatable = true, length = 32)
    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    @Basic
    @Column(name = "cell", nullable = true, insertable = true, updatable = true)
    public byte[] getCell() {
        return cell;
    }

    public void setCell(byte[] cell) {
        this.cell = cell;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "contact_other", nullable = true, insertable = true, updatable = true, length = 100)
    public String getContactOther() {
        return contactOther;
    }

    public void setContactOther(String contactOther) {
        this.contactOther = contactOther;
    }

    @Basic
    @Column(name = "head_portrait", nullable = true, insertable = true, updatable = true, length = 100)
    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
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

        GbtbUserInfoEntity that = (GbtbUserInfoEntity) o;

        if (id != that.id) return false;
        if (loginId != null ? !loginId.equals(that.loginId) : that.loginId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (loginPwd != null ? !loginPwd.equals(that.loginPwd) : that.loginPwd != null) return false;
        if (loginToken != null ? !loginToken.equals(that.loginToken) : that.loginToken != null) return false;
        if (!Arrays.equals(cell, that.cell)) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (contactOther != null ? !contactOther.equals(that.contactOther) : that.contactOther != null) return false;
        if (headPortrait != null ? !headPortrait.equals(that.headPortrait) : that.headPortrait != null) return false;
        if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loginId != null ? loginId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (loginPwd != null ? loginPwd.hashCode() : 0);
        result = 31 * result + (loginToken != null ? loginToken.hashCode() : 0);
        result = 31 * result + (cell != null ? Arrays.hashCode(cell) : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (contactOther != null ? contactOther.hashCode() : 0);
        result = 31 * result + (headPortrait != null ? headPortrait.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
