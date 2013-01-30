package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfcsosn generated by hbm2java
 */
@Entity
@Table(name = "LFCSOSN")
public class Lfcsosn implements java.io.Serializable {

	private LfcsosnId id;
	private Sgfilial sgfilial;
	private String desccsosn;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Lfitclfiscal> lfitclfiscals = new HashSet<Lfitclfiscal>(0);

	public Lfcsosn() {
	}

	public Lfcsosn(LfcsosnId id, Sgfilial sgfilial, String desccsosn,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccsosn = desccsosn;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfcsosn(LfcsosnId id, Sgfilial sgfilial, String desccsosn,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Lfitclfiscal> lfitclfiscals) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desccsosn = desccsosn;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitclfiscals = lfitclfiscals;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "csosn", column = @Column(name = "CSOSN", nullable = false, length = 4)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfcsosnId getId() {
		return this.id;
	}

	public void setId(LfcsosnId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCCSOSN", nullable = false, length = 1000)
	public String getDesccsosn() {
		return this.desccsosn;
	}

	public void setDesccsosn(String desccsosn) {
		this.desccsosn = desccsosn;
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
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfcsosn")
	public Set<Lfitclfiscal> getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set<Lfitclfiscal> lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

}
