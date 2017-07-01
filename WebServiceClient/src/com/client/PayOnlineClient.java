package com.client;
import java.net.MalformedURLException;
import java.net.URL;
import org.codehaus.xfire.client.Client;
/**
 * 
 * CreateDate：2017-4-18下午09:28:44
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO Service Client
 */
public class PayOnlineClient {
	
	private Client client;
	private Object[] results;
	public PayOnlineClient() throws Exception {
		client = new Client(new URL("http://zhangmingshuai-pc:8080/WebServiceServer/services/PayOnline?WSDL"));
	}
	
	public String verify(String id,String password) throws Exception{//登入方法
		results = client.invoke("verify", new Object[]{id,password});
		System.out.println((String)results[0]);
		return (String)results[0];
	}
	public String signup(String id,String password) throws Exception{//注册方法
		results = client.invoke("signup", new Object[]{id,password});
		System.out.println((String)results[0]);
		return (String)results[0];
	}
	public String getAccount(String id) throws Exception{		//获取余额方法
		results = client.invoke("getAccount", new Object[]{id});
		System.out.println((String)results[0]);
		return (String)results[0];
	}
	public String buy(String id,int money) throws Exception{	//账户支付
		results = client.invoke("buy", new Object[]{id,money});
		System.out.println((String)results[0]);
		return (String)results[0];
	}
	public String store(String id,int money) throws Exception{	//账户转入
		results = client.invoke("store", new Object[]{id,money});
		System.out.println((String)results[0]);
		return (String)results[0];
	}
}
