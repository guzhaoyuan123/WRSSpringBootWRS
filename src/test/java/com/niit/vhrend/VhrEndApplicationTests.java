package com.niit.vhrend;

import com.niit.vhrend.service.DepartmentService;
import com.niit.vhrend.service.HrService;
import com.niit.vhrend.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VhrEndApplicationTests {

    @Autowired
    RoleService roleService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    HrService hrService;
    @Test
    void contextLoads() {


    }

    @Test
    void findAllRole(){
        System.out.println(roleService.getAllRoles());
    }

    @Test
    void findAllDepartment(){
        System.out.println(departmentService.getAllDepartments());
    }

    @Test
    void deleteHrById(){
        System.out.println(hrService.deleteHrById(4));
    }

}
