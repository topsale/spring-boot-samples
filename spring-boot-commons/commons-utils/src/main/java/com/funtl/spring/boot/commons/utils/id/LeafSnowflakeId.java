package com.funtl.spring.boot.commons.utils.id;

import com.funtl.spring.boot.commons.utils.net.OkHttpClientUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;

/**
 * 通过 Leaf 获取雪花 ID
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-12-26 03:45:16
 * @see com.funtl.spring.boot.commons.utils.id
 */
public class LeafSnowflakeId {

    /**
     * 注意我这里写死了获取 Leaf 地址，只是为了方便演示
     */
    private static final String LEAF_HOST = "http://192.168.2.121:8080/api/snowflake/get/id";

    /**
     * 生成 ID
     *
     * @return {@code Long} 雪花 ID
     */
    public static Long genId() {
        try {
            String string = Objects.requireNonNull(OkHttpClientUtil.getInstance().getData(LEAF_HOST).body()).string();
            return Long.valueOf(string);
        } catch (IOException e) {
            return 0L;
        }
    }

    /**
     * 测试
     *
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        for (int i = 0; i < 100; i++) {
            System.out.println(LeafSnowflakeId.genId());
        }
    }

}
