package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Eqsaldoprod generated by hbm2java
 */
@Entity
@Table(name = "EQSALDOPROD")
public class Eqsaldoprod implements java.io.Serializable {

	private EqsaldoprodId id;
	private Eqproduto eqproduto;
	private Eqalmox eqalmox;
	private BigDecimal sldprod;
	private BigDecimal sldresprod;
	private BigDecimal sldconsigprod;
	private BigDecimal sldliqprod;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqsaldoprod() {
	}

	public Eqsaldoprod(EqsaldoprodId id, Eqproduto eqproduto, Eqalmox eqalmox,
			BigDecimal sldprod, BigDecimal sldresprod,
			BigDecimal sldconsigprod, BigDecimal sldliqprod, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqalmox = eqalmox;
		this.sldprod = sldprod;
		this.sldresprod = sldresprod;
		this.sldconsigprod = sldconsigprod;
		this.sldliqprod = sldliqprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqsaldoprod(EqsaldoprodId id, Eqproduto eqproduto, Eqalmox eqalmox,
			BigDecimal sldprod, BigDecimal sldresprod,
			BigDecimal sldconsigprod, BigDecimal sldliqprod, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqalmox = eqalmox;
		this.sldprod = sldprod;
		this.sldresprod = sldresprod;
		this.sldconsigprod = sldconsigprod;
		this.sldliqprod = sldliqprod;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codalmox", column = @Column(name = "CODALMOX", nullable = false)),
			@AttributeOverride(name = "codfilialax", column = @Column(name = "CODFILIALAX", nullable = false)),
			@AttributeOverride(name = "codempax", column = @Column(name = "CODEMPAX", nullable = false)) })
	public EqsaldoprodId getId() {
		return this.id;
	}

	public void setId(EqsaldoprodId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@Column(name = "SLDPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldprod() {
		return this.sldprod;
	}

	public void setSldprod(BigDecimal sldprod) {
		this.sldprod = sldprod;
	}

	@Column(name = "SLDRESPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldresprod() {
		return this.sldresprod;
	}

	public void setSldresprod(BigDecimal sldresprod) {
		this.sldresprod = sldresprod;
	}

	@Column(name = "SLDCONSIGPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldconsigprod() {
		return this.sldconsigprod;
	}

	public void setSldconsigprod(BigDecimal sldconsigprod) {
		this.sldconsigprod = sldconsigprod;
	}

	@Column(name = "SLDLIQPROD", nullable = false, precision = 15, scale = 5)
	public BigDecimal getSldliqprod() {
		return this.sldliqprod;
	}

	public void setSldliqprod(BigDecimal sldliqprod) {
		this.sldliqprod = sldliqprod;
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
