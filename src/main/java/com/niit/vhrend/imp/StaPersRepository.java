package com.niit.vhrend.imp;

import com.niit.vhrend.model.Renshixinxitongji;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-05-10 14:10
 **/
public interface StaPersRepository extends JpaRepository<Renshixinxitongji,Integer> {
    List<Renshixinxitongji> findByNameLike(String name);

    List<Renshixinxitongji> findByWorkidLike(String workid);

    List<Renshixinxitongji> findByGenderLike(String gender);


}
