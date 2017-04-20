package com.oracle.demo.dao;

import com.oracle.demo.model.Employee;
import love.moon.jdbc.BaseDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lovemooner
 * Date: 17-4-18
 * Time: 下午1:05
 */
public class EmployeesDao extends BaseDAO<Employee> {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeesDao.class);

    // 添加员工信息的操作
    public boolean addEmployees(final Employee employee) throws Exception {
        save(employee);
        return true;
    }

    // 将员工信息添加到表格中
    public List<Employee> addEmployees(int id) throws Exception {
        List<Employee> lstEmployees = new ArrayList<Employee>();
        Employee employee = findById(id);
        // 将当前封转好的数据装入对象中
        lstEmployees.add(employee);
        return lstEmployees;
    }

    public void deleteEmp(final Employee entity) throws Exception {
        this.delete(entity);
    }

    public void updateEmp(final Employee entity) throws Exception {
        this.update(entity);
    }

    public Employee getEmployee(int id) throws Exception {
        return this.findById(id);
    }


}
