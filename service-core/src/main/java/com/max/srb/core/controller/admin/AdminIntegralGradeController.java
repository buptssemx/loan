package com.max.srb.core.controller.admin;

import com.max.common.result.R;
import com.max.srb.core.pojo.entity.IntegralGrade;
import com.max.srb.core.service.IntegralGradeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname AdminIntegralGradeController
 * @Description
 * @Author max
 * @Date 2021/9/13 16:39
 */
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("获取积分等级列表")
    @GetMapping("/list")
    public R listAll() {
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }

    @ApiOperation("根据id删除")
    @DeleteMapping("/remove/{id}")
    public R removeById(@PathVariable long id) {
        boolean result = integralGradeService.removeById(id);
        if (result) {
            return R.ok().message("删除成功");
        } else {
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.save(integralGrade);
        if(result) {
            return R.ok().message("添加成功");
        } else {
            return R.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/getById/{id}")
    public R getById(
            @ApiParam(value = "数据ID", required = true, example = "1")
            @PathVariable long id) {
        IntegralGrade result = integralGradeService.getById(id);
        if (result != null) {
            return  R.ok().data("data", result);
        } else {
            return R.error().message("获取数据失败");
        }
    }

    @ApiOperation("修改积分等级")
    @PutMapping("/update")
    public R update(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.updateById(integralGrade);
        if(result) {
            return R.ok().message("更新成功");
        } else {
            return R.error().message("更新失败");
        }
    }
}
