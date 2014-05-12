package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Atatendimentovw07 generated by hbm2java
 */
@Entity
@Table(name = "ATATENDIMENTOVW07")
public class Atatendimentovw07 implements java.io.Serializable {

	private Atatendimentovw07Id id;

	public Atatendimentovw07() {
	}

	public Atatendimentovw07(Atatendimentovw07Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codempcl", column = @Column(name = "CODEMPCL")),
			@AttributeOverride(name = "codfilialcl", column = @Column(name = "CODFILIALCL")),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI")),
			@AttributeOverride(name = "razcli", column = @Column(name = "RAZCLI", length = 60)),
			@AttributeOverride(name = "codempct", column = @Column(name = "CODEMPCT")),
			@AttributeOverride(name = "codfilialct", column = @Column(name = "CODFILIALCT")),
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR")),
			@AttributeOverride(name = "desccontr", column = @Column(name = "DESCCONTR", length = 80)),
			@AttributeOverride(name = "descsitcontr", column = @Column(name = "DESCSITCONTR", length = 2000)),
			@AttributeOverride(name = "sitcontr", column = @Column(name = "SITCONTR", length = 2)),
			@AttributeOverride(name = "tpcontr", column = @Column(name = "TPCONTR", length = 1)),
			@AttributeOverride(name = "tpcobcontr", column = @Column(name = "TPCOBCONTR", length = 2)),
			@AttributeOverride(name = "qtdcontr", column = @Column(name = "QTDCONTR", precision = 0, scale = 5)),
			@AttributeOverride(name = "tothoras", column = @Column(name = "TOTHORAS", precision = 0, scale = 4)) })
	public Atatendimentovw07Id getId() {
		return this.id;
	}

	public void setId(Atatendimentovw07Id id) {
		this.id = id;
	}

}
