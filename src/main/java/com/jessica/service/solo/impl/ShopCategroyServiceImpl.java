package com.jessica.service.solo.impl;

import com.jessica.entity.bo.ShopCategory;
import com.jessica.entity.dto.Result;
import com.jessica.service.solo.ShopCategoryService;

import java.util.List;

public class ShopCategroyServiceImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pagesize) {
        return null;
    }
}
