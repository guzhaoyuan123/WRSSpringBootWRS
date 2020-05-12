package com.niit.vhrend.controller.sta;

import com.niit.vhrend.imp.StaPersRepository;
import com.niit.vhrend.model.Renshixinxitongji;
import com.niit.vhrend.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-05-10 13:29r
 **/

@RestController
@RequestMapping("/sta/stapers")
public class StaPersController {
    @Autowired
    RenshixinxitongjiService RenshixinxitongjiService;
    @Autowired
    NationService nationService;
    @Autowired
    PoliticsstatusService politicsstatusService;
    @Autowired
    JObLevelService jobLevelService;
    @Autowired
    PositionService positionService;
    @Autowired
    DepartmentService departmentService;

    @Autowired
    private StaPersRepository staPersRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Renshixinxitongji> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return staPersRepository.findAll(request);
    }

    @PostMapping("/save")
    public String save(@RequestBody Renshixinxitongji renshixinxitongji){
        Renshixinxitongji result = staPersRepository.save(renshixinxitongji);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }


    @PutMapping("/update")
    public String update(@RequestBody Renshixinxitongji renshixinxitongji){
        Renshixinxitongji result = staPersRepository.save(renshixinxitongji);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findByNameLike/{name}")
    public List<Renshixinxitongji> findByNameLike(@PathVariable("name")  String name) {
        return staPersRepository.findByNameLike("%"+name+"%");
    }
    @GetMapping("/findByIdLike/{workid}")
    public List<Renshixinxitongji> findByWorkidLike(@PathVariable("workid")  String workid) {
        return staPersRepository.findByWorkidLike("%"+workid+"%");
    }

    @GetMapping("/findByGenderLike/{gender}")
    public List<Renshixinxitongji> findByGenderLike(@PathVariable("gender")  String gender) {
        return staPersRepository.findByGenderLike("%"+gender+"%");
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){
        staPersRepository.deleteById(id);
    }
//    @GetMapping("/")
//    public RespPageBean getRenshixinxitongjiByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Renshixinxitongji Renshixinxitongji, Date[] beginDateScope) {
//        return RenshixinxitongjiService.getRenshixinxitongjiByPage(page, size, Renshixinxitongji,beginDateScope);
//    }


}
