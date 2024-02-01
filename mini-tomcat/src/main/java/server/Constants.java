package server;

import java.io.File;

/**
 * @Author lnd
 * @Description
 * @Date 2024/1/10 22:54
 */
public class Constants {
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "mini-tomcat/src/webroot";
    public static final String WEB_SERVLET_ROOT = System.getProperty("user.dir") + File.separator + "mini-tomcat/src/webroot/test";
    public static final int BUFFER_SIZE = 1024;
    public static final String UTF_8 = "UTF-8";
    public static final String HOST = "UTF-8";
    public static final int PORT = 8080;


    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("当前工作目录：" + currentDir);
        System.out.println(WEB_ROOT);
    }

    // 下面的字符串是当文件没有找到时返回的 404 错误描述
    public static String fileNotFoundMessage = "HTTP/1.1 404 File Not Found\r\n" +
            "Content-Type: text/html\r\n" +
            "Content-Length: 23\r\n" +
            "\r\n" +
            "<h1>File Not Found</h1>";
    // 下面的字符串是正常情况下返回的，根据http协议，里面包含了相应的变量。
    public static String OKMessage = "HTTP/1.1 ${StatusCode} ${StatusName}\r\n"+
            "Content-Type: ${ContentType}\r\n"+
            "Content-Length: ${ContentLength}\r\n"+
            "Server: minit\r\n"+
            "Date: ${ZonedDateTime}\r\n"+
            "\r\n";
}
