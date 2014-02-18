package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqtipoexp generated by hbm2java
 */
public class Eqtipoexp implements java.io.Serializable {

	private EqtipoexpId id;
	private Sgfilial sgfilial;
	private String desctipoexp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqmovexps = new HashSet(0);
	private Set eqlanctoexps = new HashSet(0);

	public Eqtipoexp() {
	}

	public Eqtipoexp(EqtipoexpId id, Sgfilial sgfilial, String desctipoexp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipoexp = desctipoexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqtipoexp(EqtipoexpId id, Sgfilial sgfilial, String desctipoexp,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set eqmovexps, Set eqlanctoexps) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctipoexp = desctipoexp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqmovexps = eqmovexps;
		this.eqlanctoexps = eqlanctoexps;
	}

	public EqtipoexpId getId() {
		return this.id;
	}

	public void setId(EqtipoexpId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDesctipoexp() {
		return this.desctipoexp;
	}

	public void setDesctipoexp(String desctipoexp) {
		this.desctipoexp = desctipoexp;
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

	public Set getEqmovexps() {
		return this.eqmovexps;
	}

	public void setEqmovexps(Set eqmovexps) {
		this.eqmovexps = eqmovexps;
	}

	public Set getEqlanctoexps() {
		return this.eqlanctoexps;
	}

	public void setEqlanctoexps(Set eqlanctoexps) {
		this.eqlanctoexps = eqlanctoexps;
	}

}
