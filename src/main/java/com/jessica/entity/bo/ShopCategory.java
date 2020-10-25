package com.jessica.entity.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class ShopCategory {
    private  Long shopCatrgoryId;
    private  String shopCatrgoryName;
    private  String shopCatrgoryDesc;
    private  String shopCatrgoryImg;
    private Integer  priority;
    private Date creatTime;
    private Date lastEditTiem;
    private  ShopCategory parent;
}
