package com.homerenting.test;

import java.util.List;

import com.homerenting.domain.UserKind;
import junit.framework.Assert;

import com.homerenting.domain.User;
import com.homerenting.repo.IUserDao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class UserDaoTest {

	@Autowired
	private IUserDao userDao;

	@Test
	public void testFindById() {
		
		User user = userDao.find(0l);

		Assert.assertEquals("arthur", user.getFirstName());
		Assert.assertEquals("arthurportas@gmail.com", user.getEmail());
		Assert.assertEquals("935705832", user.getCellPhone());
		return;
	}

	@Test
	public void testFindByEmail() {
		
		User user = userDao.findByEmail("arthurportas@gmail.com");
		
		Assert.assertEquals("arthur", user.getFirstName());
		Assert.assertEquals("arthurportas@gmail.com", user.getEmail());
		Assert.assertEquals("935705832", user.getCellPhone());
		return;
	}

	@Test
	public void testRegister() {
		
		User user = new User();
		user.setFirstName("helder");
		user.setLastName("teixeira");
		user.setEmail("hmft@netc.pt");
		user.setAddress("gaia");
		user.setZipCode("4100");
		user.setCity("gaia");
		user.setCountry("portugal");
		user.setUserKind(UserKind.CORPORATE);
		user.setNif("999999999");
		user.setPhoneNumber("212555212");
		user.setCellPhone("999222999");
		user.setPassword("password");

		userDao.create(user);
		Long id = user.getId();
		Assert.assertNotNull(id);

		Assert.assertEquals(2, userDao.findAllOrderedByName().size());
		User newUser = userDao.find(id);

		Assert.assertEquals("helder", newUser.getFirstName());
		Assert.assertEquals("hmft@netc.pt", newUser.getEmail());
		Assert.assertEquals("212555212", newUser.getPhoneNumber());
		return;
	}

	@Test
	public void testFindAllOrderedByName() {
		
		User user = new User();
		user.setFirstName("helder");
		user.setLastName("teixeira");
		user.setEmail("hmft@netc.pt");
		user.setAddress("gaia");
		user.setZipCode("4100");
		user.setCity("gaia");
		user.setCountry("portugal");
		user.setUserKind(UserKind.PRIVATE);
		user.setNif("999999999");
		user.setPhoneNumber("212555212");
		user.setCellPhone("999222999");
		user.setPassword("password");

		userDao.create(user);

		List<User> users = userDao.findAllOrderedByName();
		Assert.assertEquals(2, users.size());
		User newUser = users.get(1);

		Assert.assertEquals("helder", newUser.getFirstName());
		Assert.assertEquals("hmft@netc.pt", newUser.getEmail());
		Assert.assertEquals("212555212", newUser.getPhoneNumber());
		return;
	}
}
