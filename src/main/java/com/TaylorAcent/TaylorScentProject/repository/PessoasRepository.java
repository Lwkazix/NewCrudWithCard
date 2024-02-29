package com.TaylorAcent.TaylorScentProject.repository;

import com.TaylorAcent.TaylorScentProject.models.PessoasModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<PessoasModels,Integer> {
}
