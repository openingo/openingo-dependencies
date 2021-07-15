package com.izcqi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openingo.redip.constants.DictionaryType;
import org.openingo.redip.constants.RemoteDictionaryEtymology;
import org.openingo.redip.dictionary.remote.MySQLRemoteDictionary;
import org.openingo.redip.dictionary.remote.RemoteDictionary;
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
		mySQLRemoteDictionary.addMainWord("user", "new word又来q阿萨l","la哈哈哈哈哈阿萨","asdsadadasdasd111");

		RemoteDictionary.addWord(RemoteDictionaryEtymology.MYSQL, DictionaryType.MAIN_WORDS, "user","azzaaa");
	}
}
