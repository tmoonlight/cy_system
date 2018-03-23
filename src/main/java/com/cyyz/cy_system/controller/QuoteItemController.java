package com.cyyz.cy_system.web;
import com.cyyz.cy_system.infrastructure.result.*;

import com.cyyz.cy_system.domain.model.QuoteItem;
import com.cyyz.cy_system.service.QuoteItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Shz on 2018/03/23.
*/
@RestController
@RequestMapping("/quote/item")
public class QuoteItemController {
    @Resource
    private QuoteItemService quoteItemService;

    @PostMapping("/add")
    public Result add(QuoteItem quoteItem) {
        quoteItemService.save(quoteItem);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        quoteItemService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(QuoteItem quoteItem) {
        quoteItemService.update(quoteItem);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        QuoteItem quoteItem = quoteItemService.findById(id);
        return ResultGenerator.genSuccessResult(quoteItem);
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<QuoteItem> list = quoteItemService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
