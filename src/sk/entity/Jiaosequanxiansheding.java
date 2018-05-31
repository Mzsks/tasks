package sk.entity;

/**
 * Jiaosequanxiansheding entity. @author MyEclipse Persistence Tools
 */

public class Jiaosequanxiansheding implements java.io.Serializable {

	// Fields

	private Integer jsqxid;
	private Jiaose jiaose;
	private Integer xtqxid;
	private Boolean liulan;
	private Boolean tianjia;
	private Boolean xiugai;
	private Boolean shanchu;
	private Boolean dayin;
	private Boolean shenhe;

	// Constructors

	/** default constructor */
	public Jiaosequanxiansheding() {
	}

	/** full constructor */
	public Jiaosequanxiansheding(Jiaose jiaose, Integer xtqxid, Boolean liulan,
			Boolean tianjia, Boolean xiugai, Boolean shanchu, Boolean dayin,
			Boolean shenhe) {
		this.jiaose = jiaose;
		this.xtqxid = xtqxid;
		this.liulan = liulan;
		this.tianjia = tianjia;
		this.xiugai = xiugai;
		this.shanchu = shanchu;
		this.dayin = dayin;
		this.shenhe = shenhe;
	}

	// Property accessors

	public Integer getJsqxid() {
		return this.jsqxid;
	}

	public void setJsqxid(Integer jsqxid) {
		this.jsqxid = jsqxid;
	}

	public Jiaose getJiaose() {
		return this.jiaose;
	}

	public void setJiaose(Jiaose jiaose) {
		this.jiaose = jiaose;
	}

	public Integer getXtqxid() {
		return this.xtqxid;
	}

	public void setXtqxid(Integer xtqxid) {
		this.xtqxid = xtqxid;
	}

	public Boolean getLiulan() {
		return this.liulan;
	}

	public void setLiulan(Boolean liulan) {
		this.liulan = liulan;
	}

	public Boolean getTianjia() {
		return this.tianjia;
	}

	public void setTianjia(Boolean tianjia) {
		this.tianjia = tianjia;
	}

	public Boolean getXiugai() {
		return this.xiugai;
	}

	public void setXiugai(Boolean xiugai) {
		this.xiugai = xiugai;
	}

	public Boolean getShanchu() {
		return this.shanchu;
	}

	public void setShanchu(Boolean shanchu) {
		this.shanchu = shanchu;
	}

	public Boolean getDayin() {
		return this.dayin;
	}

	public void setDayin(Boolean dayin) {
		this.dayin = dayin;
	}

	public Boolean getShenhe() {
		return this.shenhe;
	}

	public void setShenhe(Boolean shenhe) {
		this.shenhe = shenhe;
	}

}