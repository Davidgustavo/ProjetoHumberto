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
@Repository("HistoricoCVDAO")
@Transactional(transactionManager="diagram.curriculo-TransactionManager")
public interface HistoricoCVDAO extends JpaRepository<HistoricoCV, java.lang.String> {

  /**
   * Obtém a instância de HistoricoCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HistoricoCV entity WHERE entity.id = :id")
  public HistoricoCV findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de HistoricoCV utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HistoricoCV entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key funcionarioCV
   * @generated
   */
  @Query("SELECT entity FROM HistoricoCV entity WHERE entity.funcionarioCV.id = :id")
  public Page<HistoricoCV> findHistoricoCVsByFuncionarioCV(@Param(value="id") java.lang.String id, Pageable pageable);

}
