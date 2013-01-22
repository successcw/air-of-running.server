package com.successcw.nettool;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetTool {
	public static byte[] readStream(InputStream inStream) throws Exception{
        //ʵ��һ�������������ֽ�����
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //��������Ĵ�С
        byte[] buffer = new byte[1024];
        int len = -1 ;
        //����Ϊֹ��ֱ�����inStream.read()��ȡ�����Ǹ������
        while((len=inStream.read(buffer)) !=-1){
            //�����д�뵽ByteArrayOutputStream��
            outStream.write(buffer, 0, len);
        }
        //�ر������
        outStream.close();
        //�ر�������
        inStream.close();
        //���������������
        return outStream.toByteArray();
    }
    public static byte[] getImage(String urlpath)throws Exception{
        //ʵ��һ��URL����
        URL url = new URL(urlpath);
        //��һ��HttpURLConnection
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        //�������󷽷���Ĭ����GET
        conn.setRequestMethod("GET");
        //���ó�ʱʱ��
        conn.setConnectTimeout(6*1000);//10//���ʱandroid�����ʱ�䣬�ͻᱻϵͳ����
        //System.out.println(conn.getResponseCode());
        if(conn.getResponseCode()== 200){
            //�õ�һ�������������
           InputStream inStream = conn.getInputStream();
           return readStream(inStream);
        }
        return null;
      }
   public static String getHtml(String urlPath,String encoding)throws Exception{
        //ʵ��һ��URL����
        URL url = new URL(urlPath);
        //��һ��HttpURLConnection
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        //�������󷽷���Ĭ����GET
        conn.setRequestMethod("GET");
        //���ó�ʱʱ��
        conn.setConnectTimeout(6*1000);//10//���ʱandroid�����ʱ�䣬�ͻᱻϵͳ����
//        System.out.println(conn.getResponseCode());
        if((conn.getResponseCode())== 200){
            //�õ�һ�������������
            InputStream inStream = conn.getInputStream();
            //��ȡ�������
            byte[] data = readStream(inStream);
            return new String(data,encoding);
        }
        return null;
      }
   
}



