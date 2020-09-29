package com.lybxxx.ssm.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lybxxx
 */
@Getter
@Setter
public class Page {
    int start = 0;
    int count = 10;
    int last = 0;

    public void lastPage(int total) {
        if (0 == total % count) {
            last = total - count;
        }else {
            last = total -total % count;
        }
    }
}
