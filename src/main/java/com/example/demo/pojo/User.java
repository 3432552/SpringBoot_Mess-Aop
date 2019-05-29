package com.example.demo.pojo;

/*import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;*/

/*@Data
@Slf4j*/
public class User {
    private String name;
    private Integer age;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
       /* User user=new User();
        user.setName("张三");
        user.setAge(13);
        log.info(user.toString());
        System.out.println("输出信息"+user.toString());*/
    }

}
