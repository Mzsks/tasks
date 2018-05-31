package sk.entity;

/**
 * As entity. @author MyEclipse Persistence Tools
 */

public class As implements java.io.Serializable {

	// Fields

	private Integer jsqxid;
	private Integer jsid;
	private String jiaosemingcheng;
	private Integer xtqxid;
	private String xtmingcheng;
	private Integer shangjiid;
	private Boolean liulan;
	private Boolean shanchu;
	private Boolean xiugai;
	private Boolean tianjia;
	private String url;
	private String cls;
	private Boolean shenhe;
	private Boolean dayin;

	// Constructors

	/** default constructor */
	public As() {
	}

	/** minimal constructor */
	public As(Integer jsqxid) {
		this.jsqxid = jsqxid;
	}

	/** full constructor */
	public As(Integer jsqxid, Integer jsid, String jiaosemingcheng,
			Integer xtqxid, String xtmingcheng, Integer shangjiid,
			Boolean liulan, Boolean shanchu, Boolean xiugai, Boolean tianjia,
			String url, String cls, Boolean shenhe, Boolean dayin) {
		this.jsqxid = jsqxid;
		this.jsid = jsid;
		this.jiaosemingcheng = jiaosemingcheng;
		this.xtqxid = xtqxid;
		this.xtmingcheng = xtmingcheng;
		this.shangjiid = shangjiid;
		this.liulan = liulan;
		this.shanchu = shanchu;
		this.xiugai = xiugai;
		this.tianjia = tianjia;
		this.url = url;
		this.cls = cls;
		this.shenhe = shenhe;
		this.dayin = dayin;
	}

	// Property accessors

	public Integer getJsqxid() {
		return this.jsqxid;
	}

	public void setJsqxid(Integer jsqxid) {
		this.jsqxid = jsqxid;
	}

	public Integer getJsid() {
		return this.jsid;
	}

	public void setJsid(Integer jsid) {
		this.jsid = jsid;
	}

	public String getJiaosemingcheng() {
		return this.jiaosemingcheng;
	}

	public void setJiaosemingcheng(String jiaosemingcheng) {
		this.jiaosemingcheng = jiaosemingcheng;
	}

	public Integer getXtqxid() {
		return this.xtqxid;
	}

	public void setXtqxid(Integer xtqxid) {
		this.xtqxid = xtqxid;
	}

	public String getXtmingcheng() {
		return this.xtmingcheng;
	}

	public void setXtmingcheng(String xtmingcheng) {
		this.xtmingcheng = xtmingcheng;
	}

	public Integer getShangjiid() {
		return this.shangjiid;
	}

	public void setShangjiid(Integer shangjiid) {
		this.shangjiid = shangjiid;
	}

	public Boolean getLiulan() {
		return this.liulan;
	}

	public void setLiulan(Boolean liulan) {
		this.liulan = liulan;
	}

	public Boolean getShanchu() {
		return this.shanchu;
	}

	public void setShanchu(Boolean shanchu) {
		this.shanchu = shanchu;
	}

	public Boolean getXiugai() {
		return this.xiugai;
	}

	public void setXiugai(Boolean xiugai) {
		this.xiugai = xiugai;
	}

	public Boolean getTianjia() {
		return this.tianjia;
	}

	public void setTianjia(Boolean tianjia) {
		this.tianjia = tianjia;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCls() {
		return this.cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public Boolean getShenhe() {
		return this.shenhe;
	}

	public void setShenhe(Boolean shenhe) {
		this.shenhe = shenhe;
	}

	public Boolean getDayin() {
		return this.dayin;
	}

	public void setDayin(Boolean dayin) {
		this.dayin = dayin;
	}

}