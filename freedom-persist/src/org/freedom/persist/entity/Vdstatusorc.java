package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Vdstatusorc generated by hbm2java
 */
@Entity
@Table(name = "VDSTATUSORC")
public class Vdstatusorc implements java.io.Serializable {

	private VdstatusorcId id;
	private Sgittabela sgittabela;
	private Vdorcamento vdorcamento;
	private Date dtastorc;
	private Date horastorc;
	private String motivostorc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdstatusorc() {
	}

	public Vdstatusorc(VdstatusorcId id, Sgittabela sgittabela,
			Vdorcamento vdorcamento, Date dtastorc, Date horastorc, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.vdorcamento = vdorcamento;
		this.dtastorc = dtastorc;
		this.horastorc = horastorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdstatusorc(VdstatusorcId id, Sgittabela sgittabela,
			Vdorcamento vdorcamento, Date dtastorc, Date horastorc,
			String motivostorc, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgittabela = sgittabela;
		this.vdorcamento = vdorcamento;
		this.dtastorc = dtastorc;
		this.horastorc = horastorc;
		this.motivostorc = motivostorc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codittb", column = @Column(name = "CODITTB", nullable = false)),
			@AttributeOverride(name = "codtb", column = @Column(name = "CODTB", nullable = false)),
			@AttributeOverride(name = "codfilialtb", column = @Column(name = "CODFILIALTB", nullable = false)),
			@AttributeOverride(name = "codemptb", column = @Column(name = "CODEMPTB", nullable = false)) })
	public VdstatusorcId getId() {
		return this.id;
	}

	public void setId(VdstatusorcId id) {
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
			@JoinColumn(name = "CODORC", referencedColumnName = "CODORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOORC", referencedColumnName = "TIPOORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdorcamento getVdorcamento() {
		return this.vdorcamento;
	}

	public void setVdorcamento(Vdorcamento vdorcamento) {
		this.vdorcamento = vdorcamento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTASTORC", nullable = false, length = 10)
	public Date getDtastorc() {
		return this.dtastorc;
	}

	public void setDtastorc(Date dtastorc) {
		this.dtastorc = dtastorc;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORASTORC", nullable = false, length = 8)
	public Date getHorastorc() {
		return this.horastorc;
	}

	public void setHorastorc(Date horastorc) {
		this.horastorc = horastorc;
	}

	@Column(name = "MOTIVOSTORC", length = 10000)
	public String getMotivostorc() {
		return this.motivostorc;
	}

	public void setMotivostorc(String motivostorc) {
		this.motivostorc = motivostorc;
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
