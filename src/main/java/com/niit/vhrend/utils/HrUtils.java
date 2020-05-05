package com.niit.vhrend.utils;

import com.niit.vhrend.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-04-29 09:30
 **/
public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
