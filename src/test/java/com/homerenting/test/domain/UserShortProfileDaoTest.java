package com.homerenting.test.domain;

import com.google.common.collect.ImmutableMap;
import com.homerenting.repo.IUserShortProfileDao;
import com.homerenting.repo.UserShortProfileDaoImpl;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class UserShortProfileDaoTest {

    @Qualifier(UserShortProfileDaoImpl.COMPONENT_NAME)
	@Autowired
	private IUserShortProfileDao userDao;

    private final String EMAIL = "arthur.m@iol.pt";
    private final String PASSWORD = "123456";

    private ImmutableMap mockData;

    @Before
    public void init() {
        mockData = ImmutableMap.<String,String>builder()
                .put("email", EMAIL)
                .put("password", PASSWORD)
                .build();
    }

    @Test
    public void testAccount(){
       Assert.assertNotNull("User should not be null", userDao.findByEmail(this.EMAIL));
    }

	@Test
    @Ignore
	public void testAccountTokenAssociation() {

		/*final UserShortProfile user = new UserShortProfile();

        user.setEmail(EMAIL);
        user.setPassword(PASSWORD);
        userDao.register(user);

        AccountTokens token =  new AccountTokens();
        final String generatedToken = UUID.randomUUID().toString();
        token.setToken(generatedToken);
        token.setUserShortProfileId(user.getId());

        user.setToken(token);
        userDao.update(user);

        final UserShortProfile persistedUser = userDao.findByEmail(user.getEmail());
        Assert.assertEquals("email should be 'arthurportas@gmail.com'", persistedUser.getEmail(), EMAIL);
        Assert.assertEquals("wrong token", persistedUser.getToken().getToken(), generatedToken);*/

	}
}
