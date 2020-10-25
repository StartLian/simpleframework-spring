package com.jessica.service.combine.impl;

import com.jessica.entity.bo.HeadLine;
import com.jessica.entity.bo.ShopCategory;
import com.jessica.entity.dto.Result;
import com.jessica.service.combine.HeadlineShopCategrogCombineService;
import com.jessica.service.combine.MianPageinfoDTO;
import com.jessica.service.solo.HeadLineService;
import com.jessica.service.solo.ShopCategoryService;

import java.util.List;

public class HeadlineShopCategrogCombineServiceImpl implements HeadlineShopCategrogCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;
    @Override
    public Result<MianPageinfoDTO> getMianPageInfo() {
        //1.获取头条列表
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCondition, 1, 100);
        //2.后店铺类别列表
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition,1,100);
        //3.合并返回
        Result<MianPageinfoDTO> result =  mergeMianPageInfoResult(headLineResult,shopCategoryResult);
        return null;
    }

    private Result<MianPageinfoDTO> mergeMianPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {

        return null;
    }
}
