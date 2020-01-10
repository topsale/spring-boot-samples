package com.funtl.spring.hello.moudule.excuter;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.excuter
 * @ClassName: Leader
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:30
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:  leader 委派者   任务分发的作用
 */
public class Leader implements  IExcuter {

    private Map<String,IExcuter> targets = new HashMap<String,IExcuter>();
    public Leader() {
        targets.put("加密",new ExcuterA());
        targets.put("登录",new ExcuterB());
    }
    @Override
    public void excute(String command) {
        targets.get(command).excute(command);
    }
}
