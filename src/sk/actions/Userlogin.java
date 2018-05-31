package sk.actions;

import sk.entity.Gys;
import sk.entity.Jiaose;
import sk.manager.GysManager;

import com.opensymphony.xwork2.ActionSupport;


public class Userlogin extends ActionSupport{
	private Jiaose user;
	
	/*private Gys g;

	public Gys getG() {
		return g;
	}

	public void setG(Gys g) {
		this.g = g;
	}*/
	

	public Jiaose getUser() {
		return user;
	}

	public void setUser(Jiaose user) {
		this.user = user;
	}

	@Override
	public void validate() {
		System.out.println("这里进行通用的验证规则");		
		super.validate();
	}
	
	public void validateAddnew() {
		System.out.println("这里进行addnew方法调用前的验证规则");		
		super.validate();
	}
	public String addnew(){
		System.out.println("这里执行addnew方法的主体（把数据保存到数据库）");
		return this.SUCCESS;
		
	}
	
	public String execute() {
		if(user.getJiaosemingcheng().length()>=2){
			System.out.println(user.getJiaosemingcheng());
			GysManager gm=new GysManager();
			Gys g=new Gys();
			g.setGmingcheng("huawei");
			g.setGbeizhu("长期合作");
			//gm.addnew(g);
			return this.SUCCESS;
		}else{							
			return this.INPUT;
		}
	}
	
	

	
	
	
	/*private UserInfo user;
	
	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
*/
}
