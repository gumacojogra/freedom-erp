package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqitrecmercitositorc generated by hbm2java
 */
public class Eqitrecmercitositorc implements java.io.Serializable {

	private EqitrecmercitositorcId id;
	private Vditorcamento vditorcamento;
	private Eqitrecmercitos eqitrecmercitos;
	private String status;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqitrecmercitositorc() {
	}

	public Eqitrecmercitositorc(EqitrecmercitositorcId id,
			Vditorcamento vditorcamento, Eqitrecmercitos eqitrecmercitos,
			String status, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditorcamento = vditorcamento;
		this.eqitrecmercitos = eqitrecmercitos;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmercitositorc(EqitrecmercitositorcId id,
			Vditorcamento vditorcamento, Eqitrecmercitos eqitrecmercitos,
			String status, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.vditorcamento = vditorcamento;
		this.eqitrecmercitos = eqitrecmercitos;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public EqitrecmercitositorcId getId() {
		return this.id;
	}

	public void setId(EqitrecmercitositorcId id) {
		this.id = id;
	}

	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
	}

	public Eqitrecmercitos getEqitrecmercitos() {
		return this.eqitrecmercitos;
	}

	public void setEqitrecmercitos(Eqitrecmercitos eqitrecmercitos) {
		this.eqitrecmercitos = eqitrecmercitos;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
