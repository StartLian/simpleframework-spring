package com.jessica.entity.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Data
public class HeadLine {
    private Long lineId;
    private String  lineName;
    private String  lineLink;
    private String  lineImg;
    private Integer  priority;
    private Integer  enableStatus;
    private Date creatTime;
    private Date lastEditTiem;
}
