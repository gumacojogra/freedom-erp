package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SgmenuobjId generated by hbm2java
 */
public class SgmenuobjId implements java.io.Serializable {

	private int codmenu;
	private int codmodu;
	private int codsis;
	private String idobj;
	private int codemp;

	public SgmenuobjId() {
	}

	public SgmenuobjId(int codmenu, int codmodu, int codsis, String idobj,
			int codemp) {
		this.codmenu = codmenu;
		this.codmodu = codmodu;
		this.codsis = codsis;
		this.idobj = idobj;
		this.codemp = codemp;
	}

	public int getCodmenu() {
		return this.codmenu;
	}

	public void setCodmenu(int codmenu) {
		this.codmenu = codmenu;
	}

	public int getCodmodu() {
		return this.codmodu;
	}

	public void setCodmodu(int codmodu) {
		this.codmodu = codmodu;
	}

	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	public String getIdobj() {
		return this.idobj;
	}

	public void setIdobj(String idobj) {
		this.idobj = idobj;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgmenuobjId))
			return false;
		SgmenuobjId castOther = (SgmenuobjId) other;

		return (this.getCodmenu() == castOther.getCodmenu())
				&& (this.getCodmodu() == castOther.getCodmodu())
				&& (this.getCodsis() == castOther.getCodsis())
				&& ((this.getIdobj() == castOther.getIdobj()) || (this
						.getIdobj() != null && castOther.getIdobj() != null && this
						.getIdobj().equals(castOther.getIdobj())))
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmenu();
		result = 37 * result + this.getCodmodu();
		result = 37 * result + this.getCodsis();
		result = 37 * result
				+ (getIdobj() == null ? 0 : this.getIdobj().hashCode());
		result = 37 * result + this.getCodemp();
		return result;
	}

}
