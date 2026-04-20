package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 新增员工
     * @param employee
     */
    @Insert("insert into employee(name,username, password, phone, sex, id_number, status, create_time, update_time,create_user,update_user) " +
            "values" +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    void insert(Employee employee);



/**
 * 分页查询员工信息
 * @param employeePageQueryDTO 员工分页查询条件对象，包含查询参数和分页信息
 * @return 返回一个包含员工信息的分页对象Page<Employee>
 */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

/**
 * 更新员工信息的方法
 * @param employee 需要更新的员工对象，包含新的员工信息
 */
    void update(Employee employee);


    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}
