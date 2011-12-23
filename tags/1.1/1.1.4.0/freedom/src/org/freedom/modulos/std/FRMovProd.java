/**
 * @version 08/12/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freeedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FRListaProd.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Relat�rio de produtos.
 * 
 */

package org.freedom.modulos.std;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JCheckBoxPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FRelatorio;

public class FRMovProd extends FRelatorio {
	private static final long serialVersionUID = 1L;

  private JRadioGroup<?, ?> rgOrdem = null;
  private JRadioGroup<?, ?> rgAtivoProd=null;
  private JRadioGroup<?, ?> rgProduto=null;
  private JPanelPad pnlbSelec = new JPanelPad(JPanelPad.TP_JPANEL,new GridLayout(1,1));
  private JPanelPad pinSelec = new JPanelPad(350,90);
  private JLabelPad lbSelec = new JLabelPad(" Sele��o:");
  private JLabelPad lbDe = new JLabelPad("de:");
  private JLabelPad lbA = new JLabelPad("�:");
  private JTextFieldPad txtDe = new JTextFieldPad(JTextFieldPad.TP_STRING,30,0);
  private JTextFieldPad txtA = new JTextFieldPad(JTextFieldPad.TP_STRING,30,0);
  private JLabelPad lbTipoProd = new JLabelPad("Tipo de Produto:");
  private JLabelPad lbOrdem = new JLabelPad("Ordenar por:");
  private JLabelPad lbFiltrar = new JLabelPad("Filtrar por:");
  private JCheckBoxPad cbAgrupar = null;  
  private JLabelPad lbForn = new JLabelPad("C�d.for.");
  private JLabelPad lbDescForn = new JLabelPad("Descri��o do fornecedor");
  private JLabelPad lbGrupo = new JLabelPad("C�d.grupo");
  private JLabelPad lbDescGrupo = new JLabelPad("Descri��o do grupo");
  private JLabelPad lbMarca = new JLabelPad("C�d.marca");
  private JLabelPad lbDescMarca = new JLabelPad("Descri��o da Marca");
  private Vector<String> vLabs = new Vector<String>();
  private Vector<String> vVals = new Vector<String>();
  private Vector<String> vVals1 = new Vector<String>();
  private Vector<String> vLabs1 = new Vector<String>();
  private Vector<String> vLabs2 = new Vector<String>();
  private Vector<String> vVals2 = new Vector<String>(); 
  private JLabelPad lbAlmox = new JLabelPad("C�d.almox.");
  private JLabelPad lbDescAlmox = new JLabelPad("Descri��o do Almoxarifado");
  private JTextFieldPad txtCodForn = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescForn = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0); 
  private JTextFieldPad txtCodGrupo = new JTextFieldPad(JTextFieldPad.TP_STRING,14,0);
  private JTextFieldFK txtDescGrupo = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);  
  private JTextFieldPad txtCodAlmox = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldFK txtDescAlmox = new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodMarca = new JTextFieldPad(JTextFieldPad.TP_STRING,6,0);
  private JTextFieldFK txtDescMarca=new JTextFieldFK(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtSiglaMarca = new JTextFieldPad(JTextFieldPad.TP_STRING,20,0);
  
  private ListaCampos lcAlmox = new ListaCampos(this);
  private ListaCampos lcCodForn = new ListaCampos(this);
  private ListaCampos lcGrupo = new ListaCampos(this);
  private ListaCampos lcMarca = new ListaCampos(this);
  
  public FRMovProd() {
	
    setTitulo("Relat�rio de Produtos");
    setAtribos(90,90,460,470);
    vLabs.addElement("C�digo");
    vLabs.addElement("Descri��o");
    vVals.addElement("C");
    vVals.addElement("D");
    rgOrdem = new JRadioGroup<String, String>(1,2,vLabs,vVals);
    rgOrdem.setVlrString("D");
	
	vLabs1.addElement("Ativos");
	vLabs1.addElement("Inativos");
	vLabs1.addElement("Todos");
	vVals1.addElement("A");
	vVals1.addElement("N");
	vVals1.addElement("T");
	rgAtivoProd = new  JRadioGroup<String, String>(1,3, vLabs1, vVals1);
	rgAtivoProd.setVlrString("A");
	
	vLabs2.addElement("Comercio");
	vLabs2.addElement("Servi�o");
	vLabs2.addElement("Fabrica��o");
	vLabs2.addElement("Mat.Prima");
	vLabs2.addElement("Patrimonio");
	vLabs2.addElement("Consumo");
	vLabs2.addElement("Todos");
	vVals2.addElement("P");
	vVals2.addElement("S");
	vVals2.addElement("F");
	vVals2.addElement("M");
	vVals2.addElement("O");
	vVals2.addElement("C");
	vVals2.addElement("T");
	
	rgProduto= new JRadioGroup<String, String>(4,2,vLabs2, vVals2);
	rgProduto.setVlrString("P");
    
    lcAlmox.add(new GuardaCampo( txtCodAlmox, "CodAlmox", "C�d.almox.", ListaCampos.DB_PK, false));
    lcAlmox.add(new GuardaCampo( txtDescAlmox, "DescAlmox", "Descri��o do almoxarifado", ListaCampos.DB_SI, false));
    lcAlmox.montaSql(false, "ALMOX", "EQ");
    lcAlmox.setReadOnly(true);
    txtCodAlmox.setTabelaExterna(lcAlmox);
    txtCodAlmox.setFK(true);
    txtCodAlmox.setNomeCampo("CodAlmox");

    lcCodForn.add(new GuardaCampo( txtCodForn, "CodFor", "C�d.for.", ListaCampos.DB_PK, false));
    lcCodForn.add(new GuardaCampo( txtDescForn, "RazFor", "Raz�o social do fornecedor", ListaCampos.DB_SI, false));
    lcCodForn.montaSql(false, "FORNECED", "CP");
    lcCodForn.setReadOnly(true);
    txtCodForn.setTabelaExterna(lcCodForn);
    txtCodForn.setFK(true);
    txtCodForn.setNomeCampo("CodFor");
    
	cbAgrupar = new JCheckBoxPad("Agrupar por fornecedor","S","N");
	cbAgrupar.setVlrString("N");

	lcGrupo.add(new GuardaCampo( txtCodGrupo, "CodGrup", "C�d.grupo", ListaCampos.DB_PK, false));
	lcGrupo.add(new GuardaCampo( txtDescGrupo, "DescGrup", "Descri��o do grupo", ListaCampos.DB_SI, false));
	lcGrupo.montaSql(false, "GRUPO", "EQ");
	lcGrupo.setReadOnly(true);
	txtCodGrupo.setTabelaExterna(lcGrupo);
	txtCodGrupo.setFK(true);
	txtCodGrupo.setNomeCampo("CodGrup");
	
	lcMarca.add(new GuardaCampo( txtCodMarca, "CodMarca", "C�d.marca", ListaCampos.DB_PK, false));
	lcMarca.add(new GuardaCampo( txtDescMarca, "DescMarca", "Descri��o da marca", ListaCampos.DB_SI, false));
	lcMarca.add(new GuardaCampo( txtSiglaMarca, "SiglaMarca", "Sigla", ListaCampos.DB_SI, false));
	txtCodMarca.setTabelaExterna(lcMarca);
	txtCodMarca.setNomeCampo("CodMarca");
	txtCodMarca.setFK(true);
	lcMarca.setReadOnly(true);
	lcMarca.montaSql(false, "MARCA", "EQ");
	
	
	
    pnlbSelec.add(lbSelec);
    adic(lbOrdem,7,3,185,30);
    adic(rgOrdem,7,27,190,30);
    adic(lbFiltrar, 200,3,120,30);
	adic(rgAtivoProd,200,27,240,30);
	adic(cbAgrupar,10,140,180,30);
	adic(lbTipoProd,200,20,200,100);
	adic(rgProduto,200,80,240,130);
	adic(pnlbSelec,7,63,80,15);
	adic(pinSelec,7,80,190,130);
	
	pinSelec.adic(lbDe,7,10,30,20);
	pinSelec.adic(txtDe,30,10,140,20);
	
	pinSelec.adic(lbA,7,36,30,20);
	pinSelec.adic(txtA,30,36,140,20);
    
    adic(lbForn,7,215,300,20);
	adic(txtCodForn,7,235,80,20);
	adic(lbDescForn,90,215,300,20);
	adic(txtDescForn,90,235,350,20);	
	adic(lbAlmox,7,260,250,20);
	adic(txtCodAlmox,7,280,80,20);
	adic(lbDescAlmox,90,260,250,20);
	adic(txtDescAlmox,90,280,350,20);
	adic(lbGrupo,7,305,250,20);
	adic(txtCodGrupo,7,325,80,20); 
	adic(lbDescGrupo,90,305,250,20);
	adic(txtDescGrupo,90,325,350,20);
	adic(lbMarca,7,345,250,20);
	adic(txtCodMarca,7,365,80,20); 
	adic(lbDescMarca,90,345,250,20);
	adic(txtDescMarca,90,365,350,20);
		
	
	
  }
  public String[] getValores() {
    String[] sRetorno = new String[11];
    if (rgOrdem.getVlrString().compareTo("C") == 0 )
      sRetorno[0] = "1";
    else if (rgOrdem.getVlrString().compareTo("D") == 0 )
      sRetorno[0] = "2";
       
    sRetorno[1] = txtDe.getText();
    sRetorno[2] = txtA.getText();
    sRetorno[3] = rgAtivoProd.getVlrString();
    sRetorno[4] = txtCodForn.getVlrString();
    sRetorno[5] = txtDescForn.getVlrString();
    sRetorno[6] = txtCodAlmox.getText();
    sRetorno[7] = txtDescAlmox.getText();
    sRetorno[8] = rgProduto.getVlrString();
    sRetorno[9] = txtCodMarca.getVlrString();
    sRetorno[10] = txtDescMarca.getText();
	return sRetorno;

  }
  public void setConexao(Connection cn) {
  	super.setConexao(cn);
  	lcAlmox.setConexao(cn);
  	lcCodForn.setConexao(cn);
  	lcGrupo.setConexao(cn);
  	lcMarca.setConexao(cn);
  }
  public void imprimir(boolean bVisualizar) {
	 ImprimeOS imp = new ImprimeOS("",con);
	 Vector<String> vFiltros = new Vector<String>();
	 String sSQL = "";
	 int linPag = imp.verifLinPag()-1;
	 int iContaReg = 0;
	 String sWhere = "";
	 String sAnd = " and ";
	 String[] sValores; 
	 String sTipo = "";
	 
	 sValores = getValores();
	   
	 if (sValores[1].trim().length() > 0) {
	   sWhere = sWhere+sAnd+"DESCPROD >= '"+sValores[1]+"'";
	   vFiltros.add("PRODUTOS MAIORES QUE "+sValores[1].trim());
	   sAnd = " AND ";
	 }
	 if (sValores[2].trim().length() > 0) {
	   sWhere = sWhere+sAnd+"DESCPROD <= '"+sValores[2]+"'";
	   vFiltros.add("PRODUTOS MENORES QUE "+sValores[2].trim());
	   sAnd = " AND ";
	 }
	 if (sValores[3].equals("A")) {
	   sWhere = sWhere+sAnd+"ATIVOPROD='S'";
	   vFiltros.add("PRODUTOS ATIVOS");
	   sAnd = " AND ";
	 }
	 else if (sValores[3].equals("N")) {
	   sWhere = sWhere+sAnd+"ATIVOPROD='N'";
	   vFiltros.add("PRODUTOS INATIVOS");
	   sAnd = " AND ";
     }
     else if (sValores[3].equals("T")){
  	  vFiltros.add("PRODUTOS ATIVOS E INATIVOS");
     }
	 if (sValores[7].length() > 0) {
	   sWhere = sWhere+sAnd+"CODALMOX = "+sValores[6];
	   vFiltros.add("ALMOXARIFADO = "+sValores[7]);
	   sAnd = " AND ";
	 }
	 if (sValores[9].length()> 0) {
	 	sWhere =sWhere+sAnd+"CODMARCA = '"+sValores[9]+"'";
	 	vFiltros.add("MARCA: "+sValores[10]);
	 	sAnd=" AND ";
	 }
	 
	if (sValores[8].equals("P")) {
		   sWhere = sWhere+sAnd+"TIPOPROD='P'";
		   vFiltros.add("TIPO PRODUTOS");
		   sAnd = " AND ";
	}
	
	else if (sValores[8].equals("S")) {
		   sWhere = sWhere+sAnd+"TIPOPROD='S'";
		   vFiltros.add("TIPO SERVI�OS");
		   sAnd = " AND ";	 
	}
	
	else if (sValores[8].equals("F")) {
		sWhere = sWhere+sAnd+"TIPOPROD='F'";
		vFiltros.add("FABRICA��O");
		sAnd = " AND ";
	}
	
	else if (sValores[8].equals("M")) {
		   sWhere = sWhere+sAnd+"TIPOPROD='M'";
		   vFiltros.add("MATERIA PRIMA");
		   sAnd = " AND ";
	}
	
	else if (sValores[8].equals("O")) {
		   sWhere = sWhere+sAnd+"TIPOPROD='O'";
		   vFiltros.add("PATRIMONIO");
		   sAnd = " AND ";	   
	}
	
	else if (sValores[8].equals("C")) {
		sWhere += sAnd+"TIPOPROD='C'";
		vFiltros.add("CONSUMO");
		sAnd = " AND ";	   
	}
	
	else if (sValores[8].equals("T")){
	    vFiltros.add("TODOS OS TIPOS DE PRODUTOS");
	}	   
    
	  if (cbAgrupar.getVlrString().equals("N")){ 
	     if (!txtCodForn.getVlrString().equals("")){
	      vFiltros.add("Fornecedor: "+txtDescForn.getVlrString());
	     }
	  }    
	if (!(txtCodGrupo.getVlrString().equals(""))){
        vFiltros.add("PRODUTOS DO GRUPO "+txtDescGrupo.getVlrString());
        sWhere += " AND PD.CODGRUP LIKE '"+txtCodGrupo.getVlrString()+"%'";    	
        System.out.println("Filtrou por grupo:"+sWhere);
    }
		
	 try {
	 	
		if (cbAgrupar.getVlrString().equals("S")) {// Para agrupamento por fornecedores
			sSQL = "SELECT PD.CODPROD,PD.DESCPROD,PD.CODBARPROD,PD.CODFABPROD,PD.CODUNID,PD.TIPOPROD,PD.CODGRUP,'N',PF.CODFOR, "+
		              "(SELECT F.RAZFOR FROM CPFORNECED F WHERE F.CODFOR=PF.CODFOR AND F.CODEMP=PF.CODEMP AND F.CODFILIAL=PF.CODFILIAL),PF.REFPRODFOR "+
                      "FROM EQPRODUTO PD LEFT OUTER JOIN CPPRODFOR PF ON (PD.CODPROD = PF.CODPROD AND PD.CODEMP = PF.CODEMP) " +
                      "WHERE PD.CODEMP=? AND PD.CODFILIAL=? "+
                      "AND NOT EXISTS(SELECT * FROM EQMOVPROD MV WHERE MV.CODEMPPD=PD.CODEMP "+
 					  "AND MV.CODFILIALPD=PD.CODFILIAL AND MV.CODPROD=PD.CODPROD) "+
 					  (!sValores[4].equals("")?"AND EXISTS(SELECT * FROM CPPRODFOR PF WHERE PF.CODPROD = PD.CODPROD AND PF.CODEMP = PD.CODEMP AND PF.CODFOR="+sValores[4]+" )":"")+
					  sWhere+" "+
					  " UNION " +
					  "SELECT PD.CODPROD,PD.DESCPROD,PD.CODBARPROD,PD.CODFABPROD,PD.CODUNID,PD.TIPOPROD,PD.CODGRUP,'S',PF.CODFOR, "+
					  "(SELECT F.RAZFOR FROM CPFORNECED F WHERE F.CODFOR=PF.CODFOR AND F.CODEMP=PF.CODEMP AND F.CODFILIAL=PF.CODFILIAL),PF.REFPRODFOR "+
					  "FROM EQPRODUTO PD LEFT OUTER JOIN CPPRODFOR PF ON (PD.CODPROD = PF.CODPROD AND PD.CODEMP = PF.CODEMP) " +
					  "WHERE PD.CODEMP=? AND PD.CODFILIAL=? "+
                      "AND EXISTS(SELECT * FROM EQMOVPROD MV WHERE MV.CODEMPPD=PD.CODEMP "+
					  "AND MV.CODFILIALPD=PD.CODFILIAL AND MV.CODPROD=PD.CODPROD) "+
					  (!sValores[4].equals("")?"AND EXISTS(SELECT * FROM CPPRODFOR PF WHERE PF.CODPROD = PD.CODPROD AND PF.CODEMP = PD.CODEMP AND PF.CODFOR="+sValores[4]+" )":"")+
					  sWhere+" "+
					  " ORDER BY 9,"+sValores[0];
		}		
		else {
			sSQL = "SELECT PD.CODPROD,PD.DESCPROD,PD.CODBARPROD,PD.CODFABPROD,PD.CODUNID,PD.TIPOPROD,PD.CODGRUP,'N',''  "+				  
				   "FROM EQPRODUTO PD "+ 				   
				   "WHERE PD.CODEMP=? AND PD.CODFILIAL=? "+
				   "AND NOT EXISTS(SELECT * FROM EQMOVPROD MV WHERE MV.CODEMPPD=PD.CODEMP "+
				   "AND MV.CODFILIALPD=PD.CODFILIAL AND MV.CODPROD=PD.CODPROD) "+
				   
				   (!sValores[4].equals("")?"AND EXISTS(SELECT * FROM CPPRODFOR PF WHERE PF.CODPROD = PD.CODPROD AND PF.CODEMP = PD.CODEMP AND PF.CODFOR="+sValores[4]+" )":"")+
				   sWhere+" "+

				   "UNION "+				   
				   "SELECT PD.CODPROD,PD.DESCPROD,PD.CODBARPROD,PD.CODFABPROD,PD.CODUNID,PD.TIPOPROD,PD.CODGRUP,'S','' "+
				   "FROM EQPRODUTO PD "+				   
				   "WHERE PD.CODEMP=? AND PD.CODFILIAL=? "+
				   "AND EXISTS(SELECT * FROM EQMOVPROD MV WHERE MV.CODEMPPD=PD.CODEMP "+
				   "AND MV.CODFILIALPD=PD.CODFILIAL AND MV.CODPROD=PD.CODPROD) "+
				   
				   (!sValores[4].equals("")?"AND EXISTS(SELECT * FROM CPPRODFOR PF WHERE PF.CODPROD = PD.CODPROD AND PF.CODEMP = PD.CODEMP AND PF.CODFOR="+sValores[4]+" )":"")+
				    sWhere+" ORDER BY "+sValores[0];
		}

        //System.out.println("SQL:   ---> "+sSQL);
		
		PreparedStatement ps = null;
		ResultSet rs = null;

		if (!con.getAutoCommit())
			con.commit();
		 ps = con.prepareStatement(sSQL);
		 ps.setInt(1,Aplicativo.iCodEmp);
		 ps.setInt(2,ListaCampos.getMasterFilial("PDPRODUTO"));
		 ps.setInt(3,Aplicativo.iCodEmp);
		 ps.setInt(4,ListaCampos.getMasterFilial("PDPRODUTO"));
		 rs = ps.executeQuery();
		 imp.limpaPags();
		 imp.setTitulo("Relat�rio de Produtos");
		 imp.montaCab();
		 boolean bImpNulo = true;
		 boolean bPulouPagina = false;
		 String sCodFor = "";
		 		 	 		
		 while ( rs.next() ) {		   
		   if (imp.pRow()==0) {
			 imp.impCab(136, true);
			 imp.say(imp.pRow()+0,0,""+imp.comprimido());
			 imp.say(imp.pRow()+0,2,"|"+Funcoes.replicate(" ",60)+"Filtrado por:"+Funcoes.replicate(" ",60)+"|");
			 for (int i=0;i<vFiltros.size();i++) {            
					 String sTmp = vFiltros.elementAt(i);
					 sTmp = "|"+Funcoes.replicate(" ",(((134-sTmp.length())/2)-1))+sTmp;
					 sTmp += Funcoes.replicate(" ",134-sTmp.length())+"|";
					 imp.say(imp.pRow()+1,0,""+imp.comprimido());
					 imp.say(imp.pRow()+0,2,sTmp);
			 }
			
			 imp.say(imp.pRow()+1,0,""+imp.comprimido());
			 imp.say(imp.pRow()+0,0,"|"+ Funcoes.replicate("-",133)+"|");
			 imp.say(imp.pRow()+1,0,""+imp.comprimido());
			 imp.say(imp.pRow()+0,0,"|");
			 imp.say(imp.pRow()+0,3,"C�digo:");
			 imp.say(imp.pRow()+0,12,"|");
			 imp.say(imp.pRow()+0,13," Cod.Barra:");
			 imp.say(imp.pRow()+0,27,"|");
			 imp.say(imp.pRow()+0,29,"Cod.Fab:");
		     imp.say(imp.pRow()+0,41,"|");
			 imp.say(imp.pRow()+0,43,"Descri��o:");
			 imp.say(imp.pRow()+0,74,"|");
			 imp.say(imp.pRow()+0,76,"Unidade:");
			 imp.say(imp.pRow()+0,85,"|");
			 imp.say(imp.pRow()+0,86," Mov.");
			 imp.say(imp.pRow()+0,92,"|     Cod.Grupo");
			 imp.say(imp.pRow()+0,114,"|      Tipo");
			 imp.say(imp.pRow()+0,135,"|");
			 imp.say(imp.pRow()+1,0,""+imp.comprimido());
			 imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
			
		   }		   
		   if ((cbAgrupar.getVlrString().equals("S")) && (!sCodFor.equals(rs.getString(9))) && bImpNulo || ((bPulouPagina) && (cbAgrupar.getVlrString().equals("S")))) {
		      if (iContaReg>0 && !bPulouPagina) {
				imp.say(imp.pRow()+1,0,""+imp.comprimido());
			    imp.say(imp.pRow()+0,0,"|"+Funcoes.replicate("-",133)+"|");
		      }							 
			  if (!(rs.getString(10)==null)) {
				imp.say(imp.pRow()+1,0,"|");
			    imp.say(imp.pRow()+0,3,rs.getString(10));
				imp.say(imp.pRow()+0,135,"|");
				imp.say(imp.pRow()+1,0,"");
				imp.say(imp.pRow()+0,0,"|"+ Funcoes.replicate("-",133)+"|");					    
			  } 
			  else {
			     imp.say(imp.pRow()+1,0,"|  FORNECEDOR N�O INFORMADO");
				 imp.say(imp.pRow()+0,135,"|");
				 imp.say(imp.pRow()+1,0,"|");
				 imp.say(imp.pRow()+0,0, Funcoes.replicate("-",133)+"|");				 				
				 bImpNulo = false;
			  }
		      bPulouPagina = false;
		   }
		   		   
		   imp.say(imp.pRow()+1,0,""); 
		   imp.say(imp.pRow()+0,0,"|");
		   imp.say(imp.pRow()+0,3,rs.getString("CodProd"));
		   imp.say(imp.pRow()+0,12,"|");
		   imp.say(imp.pRow()+0,13,rs.getString("codBarProd"));
		   imp.say(imp.pRow()+0,27,"|");
		   
		   if (cbAgrupar.getVlrString().equals("N")){
              imp.say(imp.pRow()+0,29,rs.getString("CodFabProd")!=null ? Funcoes.copy(rs.getString("CodFabProd"),12):"");
           }
           
		   else {
			  imp.say(imp.pRow()+0,29,rs.getString("RefProdFor")!=null ? Funcoes.copy(rs.getString("RefProdFor"),12):"");
		   }
		   imp.say(imp.pRow()+0,41,"|");
		   imp.say(imp.pRow()+0,42,rs.getString("DescProd") != null ? rs.getString("Descprod").substring(0,30) : "");
		   imp.say(imp.pRow()+0,74,"|");
		   imp.say(imp.pRow()+0,76,rs.getString("Codunid"));
		   imp.say(imp.pRow()+0,85,"|");
		   imp.say(imp.pRow()+0,89,rs.getString(8));
		   imp.say(imp.pRow()+0,92,"|");
		   imp.say(imp.pRow()+0,99,rs.getString("codgrup"));
		   imp.say(imp.pRow()+0,114,"|");
		   		   		  		   
		  if (sValores[8].equals("T")){
			    	
			   if (rs.getString("TIPOPROD").equals("P")){
			   	   sTipo="Comercio";
			   	   imp.say(imp.pRow()+0,119,sTipo);
			   }
			   else if (rs.getString("TIPOPROD").equals("S")){
			   	  sTipo="Servi�o";
			   	  imp.say(imp.pRow()+0,119,sTipo);
			   }
			   else if (rs.getString("TIPOPROD").equals("F")){
			   	  sTipo="Fabrica��o";
	      	      imp.say(imp.pRow()+0,119,sTipo);
			   }
			   else if (rs.getString("TIPOPROD").equals("M")){
			   	  sTipo="Mat.Prima";
			   	  imp.say(imp.pRow()+0,119,sTipo);
			   }
			   else if (rs.getString("TIPOPROD").equals("O")){
			   	sTipo="Patrim�nio";
			   	imp.say(imp.pRow()+0,119,sTipo);
			   }
			   else if (rs.getString("TIPOPROD").equals("C")){
			   	sTipo="Consumo";
			   		imp.say(imp.pRow()+0,119,sTipo);
			   }
		  }	   		   
		
	       imp.say(imp.pRow()+0,135,"|");

		   sCodFor = rs.getString(9)==null?"":rs.getString(9);
		   
		   if (imp.pRow()>=linPag) {
		   	 imp.say(imp.pRow()+1,0,""+imp.comprimido());
		     imp.say(imp.pRow()+0,0,"+"+ Funcoes.replicate("-",133)+"+");
			 imp.incPags();
			 bPulouPagina = true;
			 imp.eject();
		   }
		     iContaReg++;
		 }
		 imp.say(imp.pRow()+1,0,""+imp.comprimido());
	     imp.say(imp.pRow()+0,0,"+"+ Funcoes.replicate("=",133)+"+");
		 imp.eject();

		 imp.fechaGravacao();
		 con.commit();		 
	 }
	 catch ( SQLException err ) {
		 Funcoes.mensagemErro(this,"Erro consulta tabela de produtos!\n"+err.getMessage(),true,con,err);
	 }
	 if (bVisualizar) {
	   imp.preview(this);
	 }
	 else {
  	   imp.print();
	 }
  }
}