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
@Repository("CursoCVDAO")
@Transactional(transactionManager="diagram.curriculo-TransactionManager")
public interface CursoCVDAO extends JpaRepository<CursoCV, java.lang.String> {

  /**
   * Obtém a instância de CursoCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CursoCV entity WHERE entity.id = :id")
  public CursoCV findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de CursoCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CursoCV entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key funcionarioCV
   * @generated
   */
  @Query("SELECT entity FROM CursoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<CursoCV> findCursoCVsByFuncionarioCV(@Param(value="id") java.lang.String id, Pageable pageable);

}
