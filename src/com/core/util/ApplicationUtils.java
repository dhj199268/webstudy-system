package com.core.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * ApplicationUtils : ���򹤾��࣬�ṩ�����ı�ݷ���
 *
 * @author StarZou
 * @since 2014-09-28 22:31
 */
public class ApplicationUtils {
	/**
     * ������ ˽�л������ò���ʵ����
     */
	private  ApplicationUtils(){}
	
	/**
     * ����һ��36���ַ���UUID
     *
     * @return UUID
     */
	public static  String randomUUID(){
		return UUID.randomUUID().toString();
	}
	/**
     * md5����
     *
     * @param value Ҫ���ܵ�ֵ
     * @return md5���ܺ��ֵ
     */
	public String md5Hex(String value) {
		return DigestUtils.md5Hex(value);
	}
	/**
     * sha1����
     *
     * @param value Ҫ���ܵ�ֵ
     * @return sha1���ܺ��ֵ
     */
	public static String sha1Hex(String value) {
		return DigestUtils.shaHex(value);
	}
	/**
     * sha256����
     *
     * @param value Ҫ���ܵ�ֵ
     * @return sha256���ܺ��ֵ
     */
    public static String sha256Hex(String value) {
        return DigestUtils.shaHex(value);
    }
}
