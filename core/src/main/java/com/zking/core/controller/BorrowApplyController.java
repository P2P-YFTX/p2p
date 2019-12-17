package com.zking.core.controller;

import com.zking.core.model.BorrowApply;
import com.zking.core.model.TreeNode;
import com.zking.core.service.IBorrowApplyService;
import com.zking.core.service.TreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class BorrowApplyController {

    @Autowired
    private IBorrowApplyService borrowApplyService;

    @RequestMapping(value = "/listBorrowApply")
    @ResponseBody
    public List<BorrowApply> listBorrowApply(){
        List<BorrowApply> borrowApplies = borrowApplyService.listBorrowApply();
        return borrowApplies;
    }

}
