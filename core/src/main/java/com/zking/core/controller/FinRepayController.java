package com.zking.core.controller;

import com.zking.core.model.FinRepay;
import com.zking.core.service.IFinRepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class FinRepayController {
    @Autowired
    private IFinRepayService finRepayService;

    @RequestMapping(value = "/listFinRepay")
    @ResponseBody
    public List<FinRepay> listFinRepay(){
        List<FinRepay> finRepays = finRepayService.listFinRepay();
        return finRepays;
    }
}
