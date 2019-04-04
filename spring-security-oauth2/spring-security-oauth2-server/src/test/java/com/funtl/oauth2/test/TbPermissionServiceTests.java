package com.funtl.oauth2.test;

import com.funtl.oauth2.OAuth2ServerApplication;
import com.funtl.oauth2.server.service.TbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 权限查询测试
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-04-04 23:47:25
 * @see com.funtl.oauth2.test
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OAuth2ServerApplication.class)
public class TbPermissionServiceTests {

    @Autowired
    private TbPermissionService tbPermissionService;

    @Test
    public void testSelectByUserId() {
        tbPermissionService.selectByUserId(37L).forEach(tbPermission -> System.out.println(tbPermission));
    }
}
