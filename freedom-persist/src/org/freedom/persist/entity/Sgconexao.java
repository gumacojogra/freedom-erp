package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgconexao generated by hbm2java
 */
public class Sgconexao implements java.io.Serializable {

	private int nrconexao;
	private Sgfilial sgfilial;
	private Sgusuario sgusuario;
	private short codfilialsel;
	private Integer codterm;
	private int conectado;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgconexao() {
	}

	public Sgconexao(int nrconexao, Sgfilial sgfilial, Sgusuario sgusuario,
			short codfilialsel, int conectado, Date dtins, Date hins,
			String idusuins) {
		this.nrconexao = nrconexao;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.codfilialsel = codfilialsel;
		this.conectado = conectado;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgconexao(int nrconexao, Sgfilial sgfilial, Sgusuario sgusuario,
			short codfilialsel, Integer codterm, int conectado, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.nrconexao = nrconexao;
		this.sgfilial = sgfilial;
		this.sgusuario = sgusuario;
		this.codfilialsel = codfilialsel;
		this.codterm = codterm;
		this.conectado = conectado;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public int getNrconexao() {
		return this.nrconexao;
	}

	public void setNrconexao(int nrconexao) {
		this.nrconexao = nrconexao;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
	}

	public short getCodfilialsel() {
		return this.codfilialsel;
	}

	public void setCodfilialsel(short codfilialsel) {
		this.codfilialsel = codfilialsel;
	}

	public Integer getCodterm() {
		return this.codterm;
	}

	public void setCodterm(Integer codterm) {
		this.codterm = codterm;
	}

	public int getConectado() {
		return this.conectado;
	}

	public void setConectado(int conectado) {
		this.conectado = conectado;
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
