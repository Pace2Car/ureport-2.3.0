package com.bstek.ureport.utils;

/**
 * 系统判断工具
 * @author Chen Jiahao
 * @since 2021/3/23 15:33
 */
public class OSUtil {
    /**
     * 判断当前系统是否为Windows操作系统
     *
     * @return true标明为Windows系统
     */
    public static Boolean isWindowsOs() {
        String os = System.getProperty("os.name");
        return os.toLowerCase().startsWith("win");
    }
}
