package com.masotoshi.validator;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {
    //检验结果是否有错
    private boolean hasError=false;
    //存放错误信息
    private Map<String,String> errorMsgMap=new HashMap<>();

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Map<String, String> getErroMsgMap() {
        return this.errorMsgMap;
    }

    public void setErroMsgMap(Map<String, String> erroMsgMap) {
        this.errorMsgMap = erroMsgMap;
    }

    //实现通用的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg(){
        return org.apache.commons.lang3.StringUtils.join(errorMsgMap.values().toArray(),",");
    }

}
