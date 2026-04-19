package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);


    /**
     * 分页查询员工信息的方法

 * 该方法接受一个包含分页查询参数的EmployeePageQueryDTO对象
     * @param employeePageQueryDTO 包含分页查询条件的DTO对象，如页码、每页大小、查询条件等
     * @return 返回一个PageResult对象，包含分页查询结果，如当前页数据、总记录数等分页信息
     */

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

/**
 * 根据状态参数和ID来启动或停止某个操作
 * 
 * @param status 状态参数，用于判断是启动还是停止操作
 * @param id 要操作的唯一标识符
 */
    void startOrStop(Integer status, long id);
}
