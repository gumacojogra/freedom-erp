package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Atatendimentoorc generated by hbm2java
 */
@Entity
@Table(name = "ATATENDIMENTOORC")
public class Atatendimentoorc implements java.io.Serializable {

	private AtatendimentoorcId id;
	private Vdorcamento vdorcamento;
	private Atatendimento atatendimento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Atatendimentoorc() {
	}

	public Atatendimentoorc(AtatendimentoorcId id, Vdorcamento vdorcamento,
			Atatendimento atatendimento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdorcamento = vdorcamento;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atatendimentoorc(AtatendimentoorcId id, Vdorcamento vdorcamento,
			Atatendimento atatendimento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vdorcamento = vdorcamento;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codatendo", column = @Column(name = "CODATENDO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC", nullable = false)),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilialoc", column = @Column(name = "CODFILIALOC", nullable = false)),
			@AttributeOverride(name = "codempoc", column = @Column(name = "CODEMPOC", nullable = false)) })
	public AtatendimentoorcId getId() {
		return this.id;
	}

	public void setId(AtatendimentoorcId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODORC", referencedColumnName = "CODORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TIPOORC", referencedColumnName = "TIPOORC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Vdorcamento getVdorcamento() {
		return this.vdorcamento;
	}

	public void setVdorcamento(Vdorcamento vdorcamento) {
		this.vdorcamento = vdorcamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATENDO", referencedColumnName = "CODATENDO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Atatendimento getAtatendimento() {
		return this.atatendimento;
	}

	public void setAtatendimento(Atatendimento atatendimento) {
		this.atatendimento = atatendimento;
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
