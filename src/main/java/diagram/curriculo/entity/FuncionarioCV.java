package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FUNCIONARIOCV
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIOCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.FuncionarioCV")
public class FuncionarioCV implements Serializable {

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
  @Column(name = "idFuncJanus", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String idFuncJanus;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataCadastro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataCadastro;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataUltimaAlteracao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataUltimaAlteracao;

  /**
  * @generated
  */
  @Column(name = "fotoArquivo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fotoArquivo;

  /**
  * @generated
  */
  @Column(name = "fotoURL", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fotoURL;

  /**
  * @generated
  */
  @Column(name = "caminhoLinkedin", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String caminhoLinkedin;

  /**
  * @generated
  */
  @Column(name = "resumo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumo;

  /**
  * @generated
  */
  @Column(name = "dataNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dataNascimento;

  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefone;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sobrenome;

  /**
  * @generated
  */
  @Column(name = "tenantID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tenantID;

  /**
   * Construtor
   * @generated
   */
  public FuncionarioCV(){
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
  public FuncionarioCV setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém idFuncJanus
   * return idFuncJanus
   * @generated
   */
  
  public java.lang.String getIdFuncJanus(){
    return this.idFuncJanus;
  }

  /**
   * Define idFuncJanus
   * @param idFuncJanus idFuncJanus
   * @generated
   */
  public FuncionarioCV setIdFuncJanus(java.lang.String idFuncJanus){
    this.idFuncJanus = idFuncJanus;
    return this;
  }

  /**
   * Obtém dataCadastro
   * return dataCadastro
   * @generated
   */
  
  public java.util.Date getDataCadastro(){
    return this.dataCadastro;
  }

  /**
   * Define dataCadastro
   * @param dataCadastro dataCadastro
   * @generated
   */
  public FuncionarioCV setDataCadastro(java.util.Date dataCadastro){
    this.dataCadastro = dataCadastro;
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
  public FuncionarioCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

  /**
   * Obtém fotoArquivo
   * return fotoArquivo
   * @generated
   */
  
  public java.lang.String getFotoArquivo(){
    return this.fotoArquivo;
  }

  /**
   * Define fotoArquivo
   * @param fotoArquivo fotoArquivo
   * @generated
   */
  public FuncionarioCV setFotoArquivo(java.lang.String fotoArquivo){
    this.fotoArquivo = fotoArquivo;
    return this;
  }

  /**
   * Obtém fotoURL
   * return fotoURL
   * @generated
   */
  
  public java.lang.String getFotoURL(){
    return this.fotoURL;
  }

  /**
   * Define fotoURL
   * @param fotoURL fotoURL
   * @generated
   */
  public FuncionarioCV setFotoURL(java.lang.String fotoURL){
    this.fotoURL = fotoURL;
    return this;
  }

  /**
   * Obtém caminhoLinkedin
   * return caminhoLinkedin
   * @generated
   */
  
  public java.lang.String getCaminhoLinkedin(){
    return this.caminhoLinkedin;
  }

  /**
   * Define caminhoLinkedin
   * @param caminhoLinkedin caminhoLinkedin
   * @generated
   */
  public FuncionarioCV setCaminhoLinkedin(java.lang.String caminhoLinkedin){
    this.caminhoLinkedin = caminhoLinkedin;
    return this;
  }

  /**
   * Obtém resumo
   * return resumo
   * @generated
   */
  
  public java.lang.String getResumo(){
    return this.resumo;
  }

  /**
   * Define resumo
   * @param resumo resumo
   * @generated
   */
  public FuncionarioCV setResumo(java.lang.String resumo){
    this.resumo = resumo;
    return this;
  }

  /**
   * Obtém dataNascimento
   * return dataNascimento
   * @generated
   */
  
  public java.lang.String getDataNascimento(){
    return this.dataNascimento;
  }

  /**
   * Define dataNascimento
   * @param dataNascimento dataNascimento
   * @generated
   */
  public FuncionarioCV setDataNascimento(java.lang.String dataNascimento){
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  
  public java.lang.String getTelefone(){
    return this.telefone;
  }

  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public FuncionarioCV setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public FuncionarioCV setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public FuncionarioCV setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém sobrenome
   * return sobrenome
   * @generated
   */
  
  public java.lang.String getSobrenome(){
    return this.sobrenome;
  }

  /**
   * Define sobrenome
   * @param sobrenome sobrenome
   * @generated
   */
  public FuncionarioCV setSobrenome(java.lang.String sobrenome){
    this.sobrenome = sobrenome;
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
  public FuncionarioCV setTenantID(java.lang.String tenantID){
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
    FuncionarioCV object = (FuncionarioCV)obj;
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
