package com.caimogu.test;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis2.client.ServiceClient;
import org.junit.Test;
import org.omg.CORBA.VersionSpecHelper;


import co.caimogu.ws.CaimoguServiceCallbackHandler;
import co.caimogu.ws.CaimoguServiceStub;
import co.caimogu.ws.CaimoguServiceStub.SayHello;
import co.caimogu.ws.CaimoguServiceStub.SayHelloResponse;
import wsServer.CaimoguService;
import cn.caimogu.weather.WeatherWSStub;
import cn.caimogu.weather.WeatherWSStub.GetRegionProvince;

public class Main {
//	public static void main(String[] args) throws Exception{
//		
//		WeatherWSStub stub = new WeatherWSStub();
//		
//		GetRegionProvince rp = new GetRegionProvince();
//		
//		String[] s = stub.getRegionProvince(rp).getGetRegionProvinceResult().getString();
//		
//		for(String str:s){
//			System.out.println(str);
//		}
//		
//	}
	@Test
	public void test() throws Exception {
		
		CaimoguServiceStub css = new CaimoguServiceStub();
		CaimoguService cs = new CaimoguService(); 
		
		SayHello sh = new SayHello();

		SayHelloResponse sr = css.sayHello(sh);
		String s = sr.get_return();
		
		
		System.out.println(s);
	}
}
