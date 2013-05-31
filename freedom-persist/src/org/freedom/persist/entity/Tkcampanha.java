package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tkcampanha generated by hbm2java
 */
@Entity
@Table(name = "TKCAMPANHA")
public class Tkcampanha implements java.io.Serializable {

	private TkcampanhaId id;
	private String desccamp;
	private String obscamp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Tkcampanhaemail> tkcampanhaemails = new HashSet<Tkcampanhaemail>(
			0);
	private Set<Tksitcamp> tksitcamps = new HashSet<Tksitcamp>(0);
	private Set<Tkcampanhacto> tkcampanhactos = new HashSet<Tkcampanhacto>(0);
	private Set<Tkcampanhacli> tkcampanhaclis = new HashSet<Tkcampanhacli>(0);

	public Tkcampanha() {
	}

	public Tkcampanha(TkcampanhaId id, String desccamp, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.desccamp = desccamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcampanha(TkcampanhaId id, String desccamp, String obscamp,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Tkcampanhaemail> tkcampanhaemails,
			Set<Tksitcamp> tksitcamps, Set<Tkcampanhacto> tkcampanhactos,
			Set<Tkcampanhacli> tkcampanhaclis) {
		this.id = id;
		this.desccamp = desccamp;
		this.obscamp = obscamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkcampanhaemails = tkcampanhaemails;
		this.tksitcamps = tksitcamps;
		this.tkcampanhactos = tkcampanhactos;
		this.tkcampanhaclis = tkcampanhaclis;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcamp", column = @Column(name = "CODCAMP", nullable = false, length = 13)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TkcampanhaId getId() {
		return this.id;
	}

	public void setId(TkcampanhaId id) {
		this.id = id;
	}

	@Column(name = "DESCCAMP", nullable = false, length = 80)
	public String getDesccamp() {
		return this.desccamp;
	}

	public void setDesccamp(String desccamp) {
		this.desccamp = desccamp;
	}

	@Column(name = "OBSCAMP", length = 500)
	public String getObscamp() {
		return this.obscamp;
	}

	public void setObscamp(String obscamp) {
		this.obscamp = obscamp;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcampanha")
	public Set<Tkcampanhaemail> getTkcampanhaemails() {
		return this.tkcampanhaemails;
	}

	public void setTkcampanhaemails(Set<Tkcampanhaemail> tkcampanhaemails) {
		this.tkcampanhaemails = tkcampanhaemails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcampanha")
	public Set<Tksitcamp> getTksitcamps() {
		return this.tksitcamps;
	}

	public void setTksitcamps(Set<Tksitcamp> tksitcamps) {
		this.tksitcamps = tksitcamps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcampanha")
	public Set<Tkcampanhacto> getTkcampanhactos() {
		return this.tkcampanhactos;
	}

	public void setTkcampanhactos(Set<Tkcampanhacto> tkcampanhactos) {
		this.tkcampanhactos = tkcampanhactos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tkcampanha")
	public Set<Tkcampanhacli> getTkcampanhaclis() {
		return this.tkcampanhaclis;
	}

	public void setTkcampanhaclis(Set<Tkcampanhacli> tkcampanhaclis) {
		this.tkcampanhaclis = tkcampanhaclis;
	}

}
