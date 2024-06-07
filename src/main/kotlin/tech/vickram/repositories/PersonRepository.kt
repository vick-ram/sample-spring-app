package tech.vickram.respositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.vickram.models.PersonEntity

@Repository
interface PersonRepository: JpaRepository<PersonEntity, Long>