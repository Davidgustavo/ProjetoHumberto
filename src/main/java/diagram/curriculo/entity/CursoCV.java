package diagram.curriculo.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CURSOCV
 * @generated
 */
@Entity
@Table(name = "\"CURSOCV\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.curriculo.entity.CursoCV")
public class CursoCV implements Serializable {

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
  @Column(name = "nomeCurso", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeCurso;

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
  public CursoCV(){
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
  public CursoCV setId(java.lang.String id){
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
  public CursoCV setFuncionarioCV(FuncionarioCV funcionarioCV){
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
  public CursoCV setDataUltimaAlteracao(java.util.Date dataUltimaAlteracao){
    this.dataUltimaAlteracao = dataUltimaAlteracao;
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
  public CursoCV setNomeCurso(java.lang.String nomeCurso){
    this.nomeCurso = nomeCurso;
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
  public CursoCV setNivel(java.lang.String nivel){
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
  public CursoCV setTenantID(java.lang.String tenantID){
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
    CursoCV object = (CursoCV)obj;
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
