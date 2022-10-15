package com.aswetaw.issuemanager.application.config;
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

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

    }
}
