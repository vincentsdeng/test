package com.zr.crm.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

/**
 * ApplicationContext的帮助类 自动装载ApplicationContext.
 * 
 * @author 陈建�?
 * 
 */
@Controller
public class SpringContext implements ApplicationContextAware
{

    private static ApplicationContext context;

    /*
     * 注入ApplicationContext
     */
    public void setApplicationContext(final ApplicationContext context)
            throws BeansException
    {
        // 在加载Spring时自动获得context
        SpringContext.context = context;
    }

    public static Object getBean(final String beanName)
    {
        return SpringContext.context.getBean(beanName);
    }
}