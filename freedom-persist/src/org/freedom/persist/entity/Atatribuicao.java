package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Atatribuicao generated by hbm2java
 */
@Entity
@Table(name = "ATATRIBUICAO")
public class Atatribuicao implements java.io.Serializable {

	private AtatribuicaoId id;
	private Sgfilial sgfilial;
	private String descatrib;
	private String obsatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Atconvatrib> atconvatribs = new HashSet<Atconvatrib>(0);

	public Atatribuicao() {
	}

	public Atatribuicao(AtatribuicaoId id, Sgfilial sgfilial, String descatrib,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atatribuicao(AtatribuicaoId id, Sgfilial sgfilial, String descatrib,
			String obsatrib, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt,
			Set<Atconvatrib> atconvatribs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descatrib = descatrib;
		this.obsatrib = obsatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconvatribs = atconvatribs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codatrib", column = @Column(name = "CODATRIB", nullable = false, length = 15)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtatribuicaoId getId() {
		return this.id;
	}

	public void setId(AtatribuicaoId id) {
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

	@Column(name = "DESCATRIB", nullable = false, length = 50)
	public String getDescatrib() {
		return this.descatrib;
	}

	public void setDescatrib(String descatrib) {
		this.descatrib = descatrib;
	}

	@Column(name = "OBSATRIB", length = 10000)
	public String getObsatrib() {
		return this.obsatrib;
	}

	public void setObsatrib(String obsatrib) {
		this.obsatrib = obsatrib;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atatribuicao")
	public Set<Atconvatrib> getAtconvatribs() {
		return this.atconvatribs;
	}

	public void setAtconvatribs(Set<Atconvatrib> atconvatribs) {
		this.atconvatribs = atconvatribs;
	}

}
