package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Atconvatribtb generated by hbm2java
 */
@Entity
@Table(name = "ATCONVATRIBTB")
public class Atconvatribtb implements java.io.Serializable {

	private AtconvatribtbId id;
	private Sgittabela sgittabela;
	private Atconvatrib atconvatrib;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Atconvatribtb() {
	}

	public Atconvatribtb(AtconvatribtbId id, Sgittabela sgittabela,
			Atconvatrib atconvatrib, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.atconvatrib = atconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atconvatribtb(AtconvatribtbId id, Sgittabela sgittabela,
			Atconvatrib atconvatrib, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.atconvatrib = atconvatrib;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codittb", column = @Column(name = "CODITTB", nullable = false)),
			@AttributeOverride(name = "codtb", column = @Column(name = "CODTB", nullable = false)),
			@AttributeOverride(name = "codfilialtb", column = @Column(name = "CODFILIALTB", nullable = false)),
			@AttributeOverride(name = "codemptb", column = @Column(name = "CODEMPTB", nullable = false)),
			@AttributeOverride(name = "seqconvatrib", column = @Column(name = "SEQCONVATRIB", nullable = false)),
			@AttributeOverride(name = "codconv", column = @Column(name = "CODCONV", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AtconvatribtbId getId() {
		return this.id;
	}

	public void setId(AtconvatribtbId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODITTB", referencedColumnName = "CODITTB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODTB", referencedColumnName = "CODTB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALTB", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPTB", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgittabela getSgittabela() {
		return this.sgittabela;
	}

	public void setSgittabela(Sgittabela sgittabela) {
		this.sgittabela = sgittabela;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONV", referencedColumnName = "CODCONV", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SEQCONVATRIB", referencedColumnName = "SEQCONVATRIB", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Atconvatrib getAtconvatrib() {
		return this.atconvatrib;
	}

	public void setAtconvatrib(Atconvatrib atconvatrib) {
		this.atconvatrib = atconvatrib;
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

}
