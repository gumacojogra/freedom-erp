package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Sgmodulo generated by hbm2java
 */
@Entity
@Table(name = "SGMODULO")
public class Sgmodulo implements java.io.Serializable {

	private SgmoduloId id;
	private String descmodu;
	private String comentmodu;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Sgmenu> sgmenus = new HashSet<Sgmenu>(0);

	public Sgmodulo() {
	}

	public Sgmodulo(SgmoduloId id, String descmodu, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descmodu = descmodu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgmodulo(SgmoduloId id, String descmodu, String comentmodu,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Sgmenu> sgmenus) {
		this.id = id;
		this.descmodu = descmodu;
		this.comentmodu = comentmodu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgmenus = sgmenus;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmodu", column = @Column(name = "CODMODU", nullable = false)),
			@AttributeOverride(name = "codsis", column = @Column(name = "CODSIS", nullable = false)) })
	public SgmoduloId getId() {
		return this.id;
	}

	public void setId(SgmoduloId id) {
		this.id = id;
	}

	@Column(name = "DESCMODU", nullable = false, length = 50)
	public String getDescmodu() {
		return this.descmodu;
	}

	public void setDescmodu(String descmodu) {
		this.descmodu = descmodu;
	}

	@Column(name = "COMENTMODU", length = 10000)
	public String getComentmodu() {
		return this.comentmodu;
	}

	public void setComentmodu(String comentmodu) {
		this.comentmodu = comentmodu;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgmodulo")
	public Set<Sgmenu> getSgmenus() {
		return this.sgmenus;
	}

	public void setSgmenus(Set<Sgmenu> sgmenus) {
		this.sgmenus = sgmenus;
	}

}
