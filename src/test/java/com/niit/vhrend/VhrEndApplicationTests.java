package com.niit.vhrend;

import com.niit.vhrend.imp.StaPersRepository;
import com.niit.vhrend.service.DepartmentService;
import com.niit.vhrend.service.HrService;
import com.niit.vhrend.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class VhrEndApplicationTests {

    @Autowired
    RoleService roleService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    HrService hrService;


    @Autowired
    private StaPersRepository staPersRepository;

    @Test
    void select(){
        System.out.println(staPersRepository.findByNameLike("%"+"顾"+"%"));
    }

    @Test
    void findAll(){
        System.out.println(staPersRepository.findAll());
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
