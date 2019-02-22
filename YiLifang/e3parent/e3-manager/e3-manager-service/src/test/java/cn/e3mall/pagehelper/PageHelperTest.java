package cn.e3mall.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.TbItemMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.TbItem;
import pojo.TbItemExample;

import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper() throws  Exception{
        //初始化spring容器
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //从容器种获取容器代理对象
        TbItemMapper itemMapper  = applicationContext.getBean(TbItemMapper.class);
        //执行sql语句之前设置分页信息   使用PageHelper的startPage方法
        PageHelper.startPage(1,10);
        //执行查询
        TbItemExample itemExample = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(itemExample);
        //取分页信息   PageInfo  总记录数 总页数 当前页码
        PageInfo<TbItem> pageinfo = new PageInfo<TbItem>(list);
        System.out.println(pageinfo.getTotal());
        System.out.println(pageinfo.getPages());
        System.out.println(list.size());
    }
}
