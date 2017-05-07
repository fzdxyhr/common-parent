package com.yhr.parent.mvc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YHR on 2016/8/13.
 */

@Api("用户管理")
@RestController
@RequestMapping("/v1")
public class UserController {

    @ApiOperation("获取用户列表")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Object> list() {
        return new ArrayList<Object>();
    }

    @ApiOperation("新增用户")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String create(@ApiParam("用户信息") String str) {
        return str;
    }

    @ApiOperation("删除用户")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void delete(@ApiParam("用户标识") @PathVariable("id") Long id) {

    }

}
