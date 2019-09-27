package com.tangsir;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tangsir.entity.User;
import com.tangsir.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        List<User> users = userService.getBaseMapper().selectList(new QueryWrapper<User>()
                .select("username")
                .eq("id", 1));
        System.out.println(users);
    }

    @Test
    public void timeTest() {
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s1 = localDateTime.format(dateTimeFormatter);

        System.out.println(s1);
    }

}
