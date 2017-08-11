package com.fayne.springdemo.restful;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by fayne on 2017/8/9
 */
@RestController
@RequestMapping("formater")
public class Formater {

    /**
     *
      * @param value date="2017-08-09 17:17:59"
     * @return
     */
    @PostMapping("date")
    public Object formatDate(@RequestParam("date") @DateTimeFormat(pattern = "\"yyyy-MM-dd HH:mm:ss\"") Date value){

        return String.valueOf(value);
    }
    /**
     *
     * @param value /num-percent?num=123%
     * @return
     */
    @PostMapping("num-percent")
    public Object formatPercent(@RequestParam("num") @NumberFormat(style = NumberFormat.Style.PERCENT) Double value){

        return String.valueOf(value);
    }

    /**
     *
     * @param value /num-currency?num=￥123454
     * @return
     */
    @PostMapping("num-currency")
    public Object formatCurrency(@RequestParam("num") @NumberFormat(style = NumberFormat.Style.CURRENCY) Double value){

        return String.valueOf(value);
    }

    /**
     *
     * @param value /num-pattern?num=$$1213.0$$
     * @return
     */
    @PostMapping("num-pattern")
    public Object formatNumPattern(@RequestParam("num") @NumberFormat(pattern = "$$#$$") double value){

        return String.valueOf(value);
    }
}
