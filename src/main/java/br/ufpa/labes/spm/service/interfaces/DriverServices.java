package br.ufpa.labes.spm.service.interfaces;


import br.ufpa.labes.spm.service.dto.DriverDTO;
import br.ufpa.labes.spm.service.dto.SpmConfigurationDTO;
import br.ufpa.labes.spm.service.dto.CompanyDTO;

public interface DriverServices {

public void saveDriver(DriverDTO driver, CompanyDTO companyOid);

public DriverDTO getDriverForCompany(Integer company_oid);

public DriverDTO updateConfiDriver(DriverDTO driverDTO, CompanyDTO companyDTO);

public String enviaArquivoGoogle(DriverDTO driverDTO, String projectName);

public boolean enviaArquivoGoogleDrive(DriverDTO driverDTO, String code);

}

