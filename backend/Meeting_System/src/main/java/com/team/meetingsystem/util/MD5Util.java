package com.team.meetingsystem.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    private static String KEY="1234567887654321";//加盐中用到的AES加密的秘钥

    /**
     * 用于进行MD5加密
     *
     * @param password 需要加密的密码
     * @return 加密后的密文
     */
    public static String md5Password(String password) {
        try {
            //密码翻转
            password = password+"!**";

            // 得到一个信息摘要器
            MessageDigest digest=MessageDigest.getInstance("md5");
            byte[] result=digest.digest(password.getBytes());
            StringBuffer buffer=new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b:result) {
                // 与运算
                int number=b&0xff;
                String str=Integer.toHexString(number);
                if (str.length()==1)
                    buffer.append("0");
                buffer.append(str);
            }
            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(md5Password("admin123"));
//        System.out.println(md5Password("123abc"));
    }
}
