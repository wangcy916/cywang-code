package com.cywang.code.support;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
    private static final Long serializableUID = 1L;
    /**
     * 创建人
     */
    private String created_by;
    /**
     * 创建日期
     */
    private Date createdDate;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新日期
     */
    private Date updatedDate;

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
