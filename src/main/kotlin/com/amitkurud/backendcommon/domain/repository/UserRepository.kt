package com.amitkurud.backendcommon.domain.repository

import com.amitkurud.backendcommon.domain.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository: JpaRepository<User,Long>{
  fun findByUsername(username : String) : User?
}
