package com.posable.api.model;

import javax.persistence.*;

@Entity
@Table(name = "subcategory")
public class subcategory {

    @Id
    @Column(name = "SubCategoryId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer subCategoryId;

    @Column(name = "MainCategoryId")
    private Integer mainCategoryId;

    @Column(name = "IsActive")
    private Integer isActive;

    public subcategory() {

    }


    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Integer mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}
