package com.core.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * ApplicationUtils : 程序工具类，提供大量的便捷方法
 *
 * @author StarZou
 * @since 2014-09-28 22:31
 */
public class ApplicationUtils {
	/**
     * 工具类 私有化，不让产生实例子
     */
	private  ApplicationUtils(){}
	
	/**
     * 产生一个36个字符的UUID
     *
     * @return UUID
     */
	public static  String randomUUID(){
		return UUID.randomUUID().toString();
	}
	/**
     * md5加密
     *
     * @param value 要加密的值
     * @return md5加密后的值
     */
	public String md5Hex(String value) {
		return DigestUtils.md5Hex(value);
	}
	/**
     * sha1加密
     *
     * @param value 要加密的值
     * @return sha1加密后的值
     */
	public static String sha1Hex(String value) {
		return DigestUtils.shaHex(value);
	}
	/**
     * sha256加密
     *
     * @param value 要加密的值
     * @return sha256加密后的值
     */
    public static String sha256Hex(String value) {
        return DigestUtils.shaHex(value);
    }
}
