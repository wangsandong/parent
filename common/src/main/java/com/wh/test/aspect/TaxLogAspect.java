

package com.wh.test.aspect;

import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;

import com.wh.test.annotation.TaxLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TaxLogAspect {
    private static final Logger log = LoggerFactory.getLogger(TaxLogAspect.class);

    public TaxLogAspect() {
    }

    @Pointcut("@annotation(com.wh.test.annotation.TaxLog)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        MethodSignature signature = (MethodSignature)point.getSignature();
        Method method = signature.getMethod();
        TaxLog taxLog = (TaxLog)method.getAnnotation(TaxLog.class);
        String methods = point.getTarget().getClass().getName() + "." + signature.getName() + "()";
        Object[] args = point.getArgs();
        String params = JSONObject.toJSONString(0 == args.length ? null : args[0]);
//        String ip = HttpContextUtils.getIpAddr(request);
        log.info("【执行】开始参数:{},调用方法:{}",taxLog.isShowParam() ? params : "暂不显示",methods);
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        log.info("【完成】{}，耗时{}ms", taxLog.value(), time);
        return result;
    }
}
