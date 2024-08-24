package org.test.caselab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.caselab.model.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
