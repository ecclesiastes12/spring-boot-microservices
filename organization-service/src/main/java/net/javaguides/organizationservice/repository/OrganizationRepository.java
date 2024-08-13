package net.javaguides.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.organizationservice.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}
