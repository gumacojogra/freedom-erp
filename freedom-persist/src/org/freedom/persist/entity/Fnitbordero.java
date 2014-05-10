package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fnitbordero generated by hbm2java
 */
public class Fnitbordero implements java.io.Serializable {

	private FnitborderoId id;
	private Fnitreceber fnitreceber;
	private Fnbordero fnbordero;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnitbordero() {
	}

	public Fnitbordero(FnitborderoId id, Fnitreceber fnitreceber,
			Fnbordero fnbordero, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.fnbordero = fnbordero;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnitbordero(FnitborderoId id, Fnitreceber fnitreceber,
			Fnbordero fnbordero, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.fnbordero = fnbordero;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public FnitborderoId getId() {
		return this.id;
	}

	public void setId(FnitborderoId id) {
		this.id = id;
	}

	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	public Fnbordero getFnbordero() {
		return this.fnbordero;
	}

	public void setFnbordero(Fnbordero fnbordero) {
		this.fnbordero = fnbordero;
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
