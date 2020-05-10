package com.xiyw.ioc_demo.ioc12;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBUtils12 {
	
	@Value("${db.driverClass}")
	private String driver;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.account}")
	private String account;
	
	@Value("${db.password}")
	private String password="123";
	
	@PostConstruct
	public void init(){
		System.out.println(toString());
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBUtils12 [driver=" + driver + ", url=" + url + ", account=" + account + ", password=" + password + "]";
	}
	
}
