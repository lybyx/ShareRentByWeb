package com.lybxxx.ssm.pojo;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;

/**
 * @author lybxxx
 */
@Getter
@Service
@ToString
public class Send {
    private int id;
    private String name;
    private String date;

}
