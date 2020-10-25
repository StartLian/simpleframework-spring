package com.jessica.controller.superadmin;

import com.jessica.entity.bo.HeadLine;
import com.jessica.entity.dto.Result;
import com.jessica.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class HeadlIneOperationController {
    public HeadLineService headLineService;
    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse resp){
        return headLineService.addHeadLine(new HeadLine());
    }
    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse resp){
        return headLineService.removeHeadLine(1);
    }
    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp){
        return  headLineService.modifyHeadLine(new HeadLine());
    }
    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp){
        return headLineService.queryHeadLineById(1);
    }
    public Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse resp){
        return headLineService.queryHeadLine(null,1,100);
    }
}
