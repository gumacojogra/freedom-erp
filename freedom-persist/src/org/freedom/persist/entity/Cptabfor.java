package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cptabfor generated by hbm2java
 */
public class Cptabfor implements java.io.Serializable {

	private CptabforId id;
	private Eqproduto eqproduto;
	private Cpforneced cpforneced;
	private String descprodtfor;
	private BigDecimal precoprodtfor;
	private String reforigtfor;
	private String linhatfor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cptabfor() {
	}

	public Cptabfor(CptabforId id, Cpforneced cpforneced, String descprodtfor,
			BigDecimal precoprodtfor, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpforneced = cpforneced;
		this.descprodtfor = descprodtfor;
		this.precoprodtfor = precoprodtfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cptabfor(CptabforId id, Eqproduto eqproduto, Cpforneced cpforneced,
			String descprodtfor, BigDecimal precoprodtfor, String reforigtfor,
			String linhatfor, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpforneced = cpforneced;
		this.descprodtfor = descprodtfor;
		this.precoprodtfor = precoprodtfor;
		this.reforigtfor = reforigtfor;
		this.linhatfor = linhatfor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public CptabforId getId() {
		return this.id;
	}

	public void setId(CptabforId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public String getDescprodtfor() {
		return this.descprodtfor;
	}

	public void setDescprodtfor(String descprodtfor) {
		this.descprodtfor = descprodtfor;
	}

	public BigDecimal getPrecoprodtfor() {
		return this.precoprodtfor;
	}

	public void setPrecoprodtfor(BigDecimal precoprodtfor) {
		this.precoprodtfor = precoprodtfor;
	}

	public String getReforigtfor() {
		return this.reforigtfor;
	}

	public void setReforigtfor(String reforigtfor) {
		this.reforigtfor = reforigtfor;
	}

	public String getLinhatfor() {
		return this.linhatfor;
	}

	public void setLinhatfor(String linhatfor) {
		this.linhatfor = linhatfor;
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
