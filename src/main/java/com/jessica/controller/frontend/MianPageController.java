package com.jessica.controller.frontend;

import com.jessica.entity.dto.Result;
import com.jessica.service.combine.HeadlineShopCategrogCombineService;
import com.jessica.service.combine.MianPageinfoDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MianPageController {
    private HeadlineShopCategrogCombineService headlineShopCategrogCombineService;
    public Result<MianPageinfoDTO> getMianPageinfoDTO(HttpServletRequest req, HttpServletResponse resp){
        return headlineShopCategrogCombineService.getMianPageInfo();
    }
}
