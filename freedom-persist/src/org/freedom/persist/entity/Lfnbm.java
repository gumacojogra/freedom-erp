package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfnbm generated by hbm2java
 */
@Entity
@Table(name = "LFNBM")
public class Lfnbm implements java.io.Serializable {

	private String codnbm;
	private String descnbm;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Lfncmnbm> lfncmnbms = new HashSet<Lfncmnbm>(0);

	public Lfnbm() {
	}

	public Lfnbm(String codnbm, String descnbm, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codnbm = codnbm;
		this.descnbm = descnbm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Lfnbm(String codnbm, String descnbm, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Lfncmnbm> lfncmnbms) {
		this.codnbm = codnbm;
		this.descnbm = descnbm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfncmnbms = lfncmnbms;
	}

	@Id
	@Column(name = "CODNBM", unique = true, nullable = false, length = 12)
	public String getCodnbm() {
		return this.codnbm;
	}

	public void setCodnbm(String codnbm) {
		this.codnbm = codnbm;
	}

	@Column(name = "DESCNBM", nullable = false, length = 60)
	public String getDescnbm() {
		return this.descnbm;
	}

	public void setDescnbm(String descnbm) {
		this.descnbm = descnbm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnbm")
	public Set<Lfncmnbm> getLfncmnbms() {
		return this.lfncmnbms;
	}

	public void setLfncmnbms(Set<Lfncmnbm> lfncmnbms) {
		this.lfncmnbms = lfncmnbms;
	}

}
