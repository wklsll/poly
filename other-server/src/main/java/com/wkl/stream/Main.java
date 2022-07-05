package com.wkl.stream;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * 文件流
 */
public class Main {

    @Data
    static class User {
        private String name;
        private String password;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("hello test");
        user.setPassword("123456");
        File file = new File("D://user.txt");
        OutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(JSON.toJSONBytes(user));
        fileOutputStream.flush();
        fileOutputStream.close();

        InputStream fileInputStream = new FileInputStream(file);
        byte[] b = new byte[1];
        int len;
        StringBuffer buffer = new StringBuffer();
        while ((len = fileInputStream.read(b)) != -1) {
            buffer.append(new String(b, 0, len));
        }
        System.out.println(buffer.toString());
        User user1 = JSON.parseObject(buffer.toString(), User.class);

        System.out.println(user1.name);
        System.out.println(user1.password);
    }
}
