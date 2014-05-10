package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Tkcampanhaemail generated by hbm2java
 */
public class Tkcampanhaemail implements java.io.Serializable {

	private TkcampanhaemailId id;
	private Tkemail tkemail;
	private Tkcampanha tkcampanha;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkcampanhaemail() {
	}

	public Tkcampanhaemail(TkcampanhaemailId id, Tkemail tkemail,
			Tkcampanha tkcampanha, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tkemail = tkemail;
		this.tkcampanha = tkcampanha;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcampanhaemail(TkcampanhaemailId id, Tkemail tkemail,
			Tkcampanha tkcampanha, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tkemail = tkemail;
		this.tkcampanha = tkcampanha;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public TkcampanhaemailId getId() {
		return this.id;
	}

	public void setId(TkcampanhaemailId id) {
		this.id = id;
	}

	public Tkemail getTkemail() {
		return this.tkemail;
	}

	public void setTkemail(Tkemail tkemail) {
		this.tkemail = tkemail;
	}

	public Tkcampanha getTkcampanha() {
		return this.tkcampanha;
	}

	public void setTkcampanha(Tkcampanha tkcampanha) {
		this.tkcampanha = tkcampanha;
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
