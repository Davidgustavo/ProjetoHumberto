package diagram.curriculo.dao;

import diagram.curriculo.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FuncionarioCVDAO")
@Transactional(transactionManager="diagram.curriculo-TransactionManager")
public interface FuncionarioCVDAO extends JpaRepository<FuncionarioCV, java.lang.String> {

  /**
   * Obtém a instância de FuncionarioCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FuncionarioCV entity WHERE entity.id = :id")
  public FuncionarioCV findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de FuncionarioCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FuncionarioCV entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM HistoricoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<HistoricoCV> findHistoricoCV(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FormacaoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<FormacaoCV> findFormacaoCV(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CertificacaoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<CertificacaoCV> findCertificacaoCV(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CursoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<CursoCV> findCursoCV(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM IdiomaCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<IdiomaCV> findIdiomaCV(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM HabilidadesCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<HabilidadesCV> findHabilidadesCV(@Param(value="id") java.lang.String id, Pageable pageable);

}
