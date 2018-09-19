package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HISTORICOCV
 * @generated
 */
@Entity
@Table(name = "\"HISTORICOCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.HistoricoCV")
public class HistoricoCV implements Serializable {

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
  @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cargo;

  /**
  * @generated
  */
  @Column(name = "resumoAtividade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumoAtividade;

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
  @Column(name = "empresa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String empresa;

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
  public HistoricoCV(){
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
  public HistoricoCV setId(java.lang.String id){
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
  public HistoricoCV setFuncionarioCV(FuncionarioCV funcionarioCV){
    this.funcionarioCV = funcionarioCV;
    return this;
  }

  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  
  public java.lang.String getCargo(){
    return this.cargo;
  }

  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public HistoricoCV setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }

  /**
   * Obtém resumoAtividade
   * return resumoAtividade
   * @generated
   */
  
  public java.lang.String getResumoAtividade(){
    return this.resumoAtividade;
  }

  /**
   * Define resumoAtividade
   * @param resumoAtividade resumoAtividade
   * @generated
   */
  public HistoricoCV setResumoAtividade(java.lang.String resumoAtividade){
    this.resumoAtividade = resumoAtividade;
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
  public HistoricoCV setInicio(java.lang.String inicio){
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
  public HistoricoCV setTermino(java.lang.String termino){
    this.termino = termino;
    return this;
  }

  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  
  public java.lang.String getEmpresa(){
    return this.empresa;
  }

  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public HistoricoCV setEmpresa(java.lang.String empresa){
    this.empresa = empresa;
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
  public HistoricoCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
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
  public HistoricoCV setTenantID(java.lang.String tenantID){
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
    HistoricoCV object = (HistoricoCV)obj;
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
