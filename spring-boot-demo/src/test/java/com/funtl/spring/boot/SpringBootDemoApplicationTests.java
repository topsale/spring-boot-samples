package com.funtl.spring.boot;

import com.funtl.spring.boot.domain.TbUser;
import com.funtl.spring.boot.mapper.TbUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SpringBootDemoApplicationTests {

    /**
     * 注入 DAO
     */
    @Autowired
    private TbUserMapper tbUserMapper;

    /**
     * 查询
     */
    @Test
    public void testSelectAll() {
        List<TbUser> tbUsers = tbUserMapper.selectAll();
        tbUsers.forEach(tbUser -> {
            System.out.println(tbUser);
        });
    }

    /**
     * 条件查询
     */
    @Test
    public void testSelectCondition() {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", "zhangsan");
        List<TbUser> tbUsers = tbUserMapper.selectByExample(example);
        tbUsers.forEach(tbUser -> {
            System.out.println(tbUser);
        });
    }

    /**
     * 新增
     */
    @Test
    public void testInsert() {
        TbUser tbUser = new TbUser();
        tbUser.setUsername("Lusifer");
        tbUser.setPassword("123456");
        tbUser.setPhone("15888888888");
        tbUser.setEmail("topsale@vip.qq.com");
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());

        tbUserMapper.insert(tbUser);
    }

    /**
     * 更新
     */
    @Test
    public void testUpdate() {
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(37L);
        tbUser.setUsername("Happy");

        tbUserMapper.updateByPrimaryKey(tbUser);
    }

    /**
     * 修改
     */
    @Test
    public void testDelete() {
        tbUserMapper.deleteByPrimaryKey(37L);
    }

    /**
     * 分页
     */
    @Test
    public void testPage() {
        Example example = new Example(TbUser.class);
        example.createCriteria().andLike("username", "z%");

        PageHelper.startPage(1, 5);
        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectByExample(example));
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        pageInfo.getList().forEach(tbUser -> {
            System.out.println(tbUser);
        });
    }
}
