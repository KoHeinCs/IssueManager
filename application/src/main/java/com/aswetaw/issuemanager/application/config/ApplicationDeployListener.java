package com.aswetaw.issuemanager.application.config;
import com.aswetaw.issuemanager.company.repository.CompanyRepository;
import com.aswetaw.issuemanager.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Hein Htet Aung
 * @created at 27/06/2022
 **/
@Component
@RequiredArgsConstructor
public class ApplicationDeployListener implements ApplicationListener<ApplicationReadyEvent> {
    private final CompanyRepository companyRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (companyRepository.count() == 0){
            System.out.println("Ready To Insert Company Data");
            Company company = new Company();
            company.setName("Test");
            companyRepository.save(company);
        }
    }
}
