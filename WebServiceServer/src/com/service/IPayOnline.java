package com.service;
//Generated by MyEclipse
/**
 * Author: Zhang Mingshuai
 * CreateTime:2017-4-18下午06:12:33
 * Location: HIT
 */

public interface IPayOnline {
	
	public String verify(String id, String password);   //验证用户名&密码
	public String signup(String id, String password);	//用户注册
	public String getAccount(String id);				//获取账户余额
	public String buy(String id,int money);				//账户支付
	public String store(String id,int money);			//账户转入
}