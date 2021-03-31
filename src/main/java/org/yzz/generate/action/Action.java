package org.yzz.generate.action;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.yzz.generate.service.ApplicationService;
import org.yzz.generate.service.ProjectService;

import java.nio.charset.StandardCharsets;

/**
 * @author yangzhou
 */
public class Action extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
//        ApplicationService applicationService = ServiceManager.getService(ApplicationService.class);
//        String appResult = applicationService.doSomething();
//        System.out.println("appResult = " + appResult);
//
//        ProjectService projectService = ServiceManager.getService(e.getProject(), ProjectService.class);
//        String projectResult = projectService.doSomething();
//        System.out.println("projectResult = " + projectResult);
//        Messages.showMessageDialog(appResult + " | " +projectResult, "提示信息", Messages.getInformationIcon());
        Project project = e.getData(PlatformDataKeys.PROJECT);

        String txt= Messages.showInputDialog(project, "What is your name?", "Input your name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, "+ txt + "!\\n I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
