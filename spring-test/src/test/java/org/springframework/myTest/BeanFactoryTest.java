package org.springframework.myTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

/**
 * @author xingkong
 * @date 2022/6/11 20:42
 */
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad() {
		BeanFactory context = new ClassPathXmlApplicationContext("myTest/myTest.xml");
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
		Assert.notNull(myTestBean, "对象为空");
	}
}
