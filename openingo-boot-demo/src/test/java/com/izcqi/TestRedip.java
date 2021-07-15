package com.izcqi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openingo.redip.dictionary.remote.MySQLRemoteDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO
 *
 * @author Qicz
 * @since 2021/7/15 16:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = App.class)
public class TestRedip {

	@Autowired
	MySQLRemoteDictionary mySQLRemoteDictionary;

	@Test
	public void addMysqlWord() {
		mySQLRemoteDictionary.addMainWord("qiz", "new word又来ql");
	}
}
