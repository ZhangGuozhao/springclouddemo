package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ZhangGuozhao on 2017/11/3.
 * zuul的过滤功能:安全验证
 */
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//        true  打开过滤功能
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        String servletPath = httpServletRequest.getServletPath();
        String header = httpServletRequest.getHeader("Authorization");
        if (StringUtils.isEmpty(header)) {


        }
        if (StringUtils.isEmpty(servletPath)) {

        }
        return null;
    }
}
