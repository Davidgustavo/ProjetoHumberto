package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORMACAOCV
 * @generated
 */
@Entity
@Table(name = "\"FORMACAOCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.FormacaoCV")
public class FormacaoCV implements Serializable {

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
  @Column(name = "nomeInstituicao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeInstituicao;

  /**
  * @generated
  */
  @Column(name = "nomeCurso", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeCurso;

  /**
  * @generated
  */
  @Column(name = "inicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String inicio;

  /**
  * @generated
  */
  @Column(name = "termino", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String termino;

  /**
  * @generated
  */
  @Column(name = "tituloFormacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tituloFormacao;

  /**
  * @generated
  */
  @Column(name = "tipoFormacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipoFormacao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataUltimaAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataUltimaAlteracao;

  /**
  * @generated
  */
  @Column(name = "tenantID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tenantID;

  /**
   * Construtor
   * @generated
   */
  public FormacaoCV(){
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
  public FormacaoCV setId(java.lang.String id){
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
  public FormacaoCV setFuncionarioCV(FuncionarioCV funcionarioCV){
    this.funcionarioCV = funcionarioCV;
    return this;
  }

  /**
   * Obtém nomeInstituicao
   * return nomeInstituicao
   * @generated
   */
  
  public java.lang.String getNomeInstituicao(){
    return this.nomeInstituicao;
  }

  /**
   * Define nomeInstituicao
   * @param nomeInstituicao nomeInstituicao
   * @generated
   */
  public FormacaoCV setNomeInstituicao(java.lang.String nomeInstituicao){
    this.nomeInstituicao = nomeInstituicao;
    return this;
  }

  /**
   * Obtém nomeCurso
   * return nomeCurso
   * @generated
   */
  
  public java.lang.String getNomeCurso(){
    return this.nomeCurso;
  }

  /**
   * Define nomeCurso
   * @param nomeCurso nomeCurso
   * @generated
   */
  public FormacaoCV setNomeCurso(java.lang.String nomeCurso){
    this.nomeCurso = nomeCurso;
    return this;
  }

  /**
   * Obtém inicio
   * return inicio
   * @generated
   */
  
  public java.lang.String getInicio(){
    return this.inicio;
  }

  /**
   * Define inicio
   * @param inicio inicio
   * @generated
   */
  public FormacaoCV setInicio(java.lang.String inicio){
    this.inicio = inicio;
    return this;
  }

  /**
   * Obtém termino
   * return termino
   * @generated
   */
  
  public java.lang.String getTermino(){
    return this.termino;
  }

  /**
   * Define termino
   * @param termino termino
   * @generated
   */
  public FormacaoCV setTermino(java.lang.String termino){
    this.termino = termino;
    return this;
  }

  /**
   * Obtém tituloFormacao
   * return tituloFormacao
   * @generated
   */
  
  public java.lang.String getTituloFormacao(){
    return this.tituloFormacao;
  }

  /**
   * Define tituloFormacao
   * @param tituloFormacao tituloFormacao
   * @generated
   */
  public FormacaoCV setTituloFormacao(java.lang.String tituloFormacao){
    this.tituloFormacao = tituloFormacao;
    return this;
  }

  /**
   * Obtém tipoFormacao
   * return tipoFormacao
   * @generated
   */
  
  public java.lang.String getTipoFormacao(){
    return this.tipoFormacao;
  }

  /**
   * Define tipoFormacao
   * @param tipoFormacao tipoFormacao
   * @generated
   */
  public FormacaoCV setTipoFormacao(java.lang.String tipoFormacao){
    this.tipoFormacao = tipoFormacao;
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
  public FormacaoCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
    this.dataUltimaAlteracao = dataUltimaAlteracao;
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
  public FormacaoCV setTenantID(java.lang.String tenantID){
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
    FormacaoCV object = (FormacaoCV)obj;
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
