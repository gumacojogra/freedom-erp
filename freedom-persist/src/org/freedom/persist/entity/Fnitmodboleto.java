package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fnitmodboleto generated by hbm2java
 */
public class Fnitmodboleto implements java.io.Serializable {

	private FnitmodboletoId id;
	private Fnconta fnconta;
	private Fnmodboleto fnmodboleto;
	private Fncartcob fncartcob;
	private String convcob;
	private String dvconvcob;
	private Integer seqnossonumero;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnitmodboleto() {
	}

	public Fnitmodboleto(FnitmodboletoId id, Fnmodboleto fnmodboleto,
			Fncartcob fncartcob, String convcob, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.fnmodboleto = fnmodboleto;
		this.fncartcob = fncartcob;
		this.convcob = convcob;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnitmodboleto(FnitmodboletoId id, Fnconta fnconta,
			Fnmodboleto fnmodboleto, Fncartcob fncartcob, String convcob,
			String dvconvcob, Integer seqnossonumero, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnconta = fnconta;
		this.fnmodboleto = fnmodboleto;
		this.fncartcob = fncartcob;
		this.convcob = convcob;
		this.dvconvcob = dvconvcob;
		this.seqnossonumero = seqnossonumero;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnitmodboletoId getId() {
		return this.id;
	}

	public void setId(FnitmodboletoId id) {
		this.id = id;
	}

	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	public Fnmodboleto getFnmodboleto() {
		return this.fnmodboleto;
	}

	public void setFnmodboleto(Fnmodboleto fnmodboleto) {
		this.fnmodboleto = fnmodboleto;
	}

	public Fncartcob getFncartcob() {
		return this.fncartcob;
	}

	public void setFncartcob(Fncartcob fncartcob) {
		this.fncartcob = fncartcob;
	}

	public String getConvcob() {
		return this.convcob;
	}

	public void setConvcob(String convcob) {
		this.convcob = convcob;
	}

	public String getDvconvcob() {
		return this.dvconvcob;
	}

	public void setDvconvcob(String dvconvcob) {
		this.dvconvcob = dvconvcob;
	}

	public Integer getSeqnossonumero() {
		return this.seqnossonumero;
	}

	public void setSeqnossonumero(Integer seqnossonumero) {
		this.seqnossonumero = seqnossonumero;
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
