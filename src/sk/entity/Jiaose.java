package sk.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Jiaose entity. @author MyEclipse Persistence Tools
 */

public class Jiaose implements java.io.Serializable {

	// Fields

	private Integer jid;
	private String jiaosemingcheng;
	private String beizhu;
	private Integer quanxianzhi;
	private Set jiaosequanxianshedings = new HashSet(0);
	private Set yonghus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jiaose() {
	}

	/** full constructor */
	public Jiaose(String jiaosemingcheng, String beizhu, Integer quanxianzhi,
			Set jiaosequanxianshedings, Set yonghus) {
		this.jiaosemingcheng = jiaosemingcheng;
		this.beizhu = beizhu;
		this.quanxianzhi = quanxianzhi;
		this.jiaosequanxianshedings = jiaosequanxianshedings;
		this.yonghus = yonghus;
	}

	// Property accessors

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public String getJiaosemingcheng() {
		return this.jiaosemingcheng;
	}

	public void setJiaosemingcheng(String jiaosemingcheng) {
		this.jiaosemingcheng = jiaosemingcheng;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Integer getQuanxianzhi() {
		return this.quanxianzhi;
	}

	public void setQuanxianzhi(Integer quanxianzhi) {
		this.quanxianzhi = quanxianzhi;
	}

	public Set getJiaosequanxianshedings() {
		return this.jiaosequanxianshedings;
	}

	public void setJiaosequanxianshedings(Set jiaosequanxianshedings) {
		this.jiaosequanxianshedings = jiaosequanxianshedings;
	}

	public Set getYonghus() {
		return this.yonghus;
	}

	public void setYonghus(Set yonghus) {
		this.yonghus = yonghus;
	}

}