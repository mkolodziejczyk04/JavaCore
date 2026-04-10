import jenkins.model.*
import org.jenkinsci.plugins.workflow.job.WorkflowJob
import org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition
import hudson.plugins.git.GitSCM

def jobName = "MY TESTS"
def repoUrl = "https://github.com/mkolodziejczyk04/JavaCore.git"

def jenkins = Jenkins.instance

if (jenkins.getItem(jobName) == null) {
    def job = jenkins.createProject(WorkflowJob, jobName)

    def flowDefinition = new CpsScmFlowDefinition(new GitSCM(repoUrl), "Jenkinsfile")
    job.setDefinition(flowDefinition)

    job.save()
    println "Project $jobName created"
}