package net.javaguides.organizationservice.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.Organization;
import net.javaguides.organizationservice.mapper.OrganizationMapper;
import net.javaguides.organizationservice.repository.OrganizationRepository;
import net.javaguides.organizationservice.service.OrganizationService;


@Service
@AllArgsConstructor //create parameter constructor
public class OrganizationServiceImpl implements OrganizationService{

	private OrganizationRepository organizationRepository;
	
	//business method that create new organization
	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
		// convert OrganizationDto into Organization jpa entity
		Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
		
		Organization savedOrganization = organizationRepository.save(organization);
		
		// convert Organization jpa entity into OrganizationDto 
		return OrganizationMapper.mapToOrganizationDto(savedOrganization);
		
	
	}

	//business method that retrieve organization by code
	@Override
	public OrganizationDto getOrganizationByCode(String organizationCode) {
		// TODO Auto-generated method stub
		Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
		
		return OrganizationMapper.mapToOrganizationDto(organization);
	}

}
