package sk.actions;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import sk.common.ResultInfo;
import sk.entity.Yonghu;
import sk.manager.Iusername;
import sk.manager.impl.username;


import com.opensymphony.xwork2.Action;


@Controller("loginaction")
public class loginaction implements Action{
	@Autowired
	@Qualifier("username")
	private Iusername iun;

	ResultInfo res=new ResultInfo();
	private Map<String,Object> dataMap;
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	@ManyToOne
	private Yonghu user;
	public Yonghu getUser() {
		return user;
	}
	public void setUser(Yonghu user) {
		this.user = user;
	}
	
	public String userdelect(){
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Iusername i=(Iusername)ctx.getBean("iusername");
		iun.addnew(user);
		return null;
	}

	public String useraddnew(){
		System.out.println(user.getJiaose().getJid());
		dataMap = new HashMap<String, Object>();
		Iusername i=new username();
		res=i.addnew(user);
		dataMap.put("res", res.res);
		dataMap.put("msg", res.mag);
		return this.SUCCESS;
	}
	
	
	public String userlist(){
		dataMap = new HashMap<String, Object>();
		if(user.getUsername().length()<2){
			if(user.getUsername().length()<1){
				res.res=false;
				res.mag="登录名不能为空！";
			}else if(user.getUsername().length()<2){
				dataMap.put("res", false);
				dataMap.put("msg", "登录名为两个有效字符以上！");
			}
			if(user.getUsername().length()<1){
				dataMap.put("res", false);
				dataMap.put("msg", "密码不能为空！");
			}else if(user.getUserpwd().length()<5){
				dataMap.put("res", false);
				dataMap.put("msg", "密码必须为五个字符以上！");
			}
			return this.SUCCESS;
		}else{
			//Iusername i=new username();
			res=iun.chaxun(user);
			dataMap.put("res", res.res);
			dataMap.put("msg", res.mag);
			return this.SUCCESS;
		}
	}
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
