package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HABILIDADESCV
 * @generated
 */
@Entity
@Table(name = "\"HABILIDADESCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.HabilidadesCV")
public class HabilidadesCV implements Serializable {

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
  @Column(name = "nomeHabilidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeHabilidade;

  /**
  * @generated
  */
  @Column(name = "nivel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nivel;

  /**
  * @generated
  */
  @Column(name = "tenantID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tenantID;

  /**
   * Construtor
   * @generated
   */
  public HabilidadesCV(){
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
  public HabilidadesCV setId(java.lang.String id){
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
  public HabilidadesCV setFuncionarioCV(FuncionarioCV funcionarioCV){
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
  public HabilidadesCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

  /**
   * Obtém nomeHabilidade
   * return nomeHabilidade
   * @generated
   */
  
  public java.lang.String getNomeHabilidade(){
    return this.nomeHabilidade;
  }

  /**
   * Define nomeHabilidade
   * @param nomeHabilidade nomeHabilidade
   * @generated
   */
  public HabilidadesCV setNomeHabilidade(java.lang.String nomeHabilidade){
    this.nomeHabilidade = nomeHabilidade;
    return this;
  }

  /**
   * Obtém nivel
   * return nivel
   * @generated
   */
  
  public java.lang.String getNivel(){
    return this.nivel;
  }

  /**
   * Define nivel
   * @param nivel nivel
   * @generated
   */
  public HabilidadesCV setNivel(java.lang.String nivel){
    this.nivel = nivel;
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
  public HabilidadesCV setTenantID(java.lang.String tenantID){
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
    HabilidadesCV object = (HabilidadesCV)obj;
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
