package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CERTIFICACAOCV
 * @generated
 */
@Entity
@Table(name = "\"CERTIFICACAOCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.CertificacaoCV")
public class CertificacaoCV implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionarioCV", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private FuncionarioCV funcionarioCV;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataUltimaAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataUltimaAlteracao;

  /**
  * @generated
  */
  @Column(name = "nomeCertificacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeCertificacao;

  /**
  * @generated
  */
  @Column(name = "numeroCertificacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numeroCertificacao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "inicioValidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicioValidade;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "terminoValidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date terminoValidade;

  /**
  * @generated
  */
  @Column(name = "tenantID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tenantID;

  /**
   * Construtor
   * @generated
   */
  public CertificacaoCV(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public CertificacaoCV setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém funcionarioCV
   * return funcionarioCV
   * @generated
   */
  
  public FuncionarioCV getFuncionarioCV(){
    return this.funcionarioCV;
  }

  /**
   * Define funcionarioCV
   * @param funcionarioCV funcionarioCV
   * @generated
   */
  public CertificacaoCV setFuncionarioCV(FuncionarioCV funcionarioCV){
    this.funcionarioCV = funcionarioCV;
    return this;
  }

  /**
   * Obtém dataUltimaAlteracao
   * return dataUltimaAlteracao
   * @generated
   */
  
  public java.util.Date getDataUltimaAlteracao(){
    return this.dataUltimaAlteracao;
  }

  /**
   * Define dataUltimaAlteracao
   * @param dataUltimaAlteracao dataUltimaAlteracao
   * @generated
   */
  public CertificacaoCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

  /**
   * Obtém nomeCertificacao
   * return nomeCertificacao
   * @generated
   */
  
  public java.lang.String getNomeCertificacao(){
    return this.nomeCertificacao;
  }

  /**
   * Define nomeCertificacao
   * @param nomeCertificacao nomeCertificacao
   * @generated
   */
  public CertificacaoCV setNomeCertificacao(java.lang.String nomeCertificacao){
    this.nomeCertificacao = nomeCertificacao;
    return this;
  }

  /**
   * Obtém numeroCertificacao
   * return numeroCertificacao
   * @generated
   */
  
  public java.lang.String getNumeroCertificacao(){
    return this.numeroCertificacao;
  }

  /**
   * Define numeroCertificacao
   * @param numeroCertificacao numeroCertificacao
   * @generated
   */
  public CertificacaoCV setNumeroCertificacao(java.lang.String numeroCertificacao){
    this.numeroCertificacao = numeroCertificacao;
    return this;
  }

  /**
   * Obtém inicioValidade
   * return inicioValidade
   * @generated
   */
  
  public java.util.Date getInicioValidade(){
    return this.inicioValidade;
  }

  /**
   * Define inicioValidade
   * @param inicioValidade inicioValidade
   * @generated
   */
  public CertificacaoCV setInicioValidade(java.util.Date inicioValidade){
    this.inicioValidade = inicioValidade;
    return this;
  }

  /**
   * Obtém terminoValidade
   * return terminoValidade
   * @generated
   */
  
  public java.util.Date getTerminoValidade(){
    return this.terminoValidade;
  }

  /**
   * Define terminoValidade
   * @param terminoValidade terminoValidade
   * @generated
   */
  public CertificacaoCV setTerminoValidade(java.util.Date terminoValidade){
    this.terminoValidade = terminoValidade;
    return this;
  }

  /**
   * Obtém tenantID
   * return tenantID
   * @generated
   */
  
  public java.lang.String getTenantID(){
    return this.tenantID;
  }

  /**
   * Define tenantID
   * @param tenantID tenantID
   * @generated
   */
  public CertificacaoCV setTenantID(java.lang.String tenantID){
    this.tenantID = tenantID;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    CertificacaoCV object = (CertificacaoCV)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
