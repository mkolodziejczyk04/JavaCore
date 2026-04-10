FROM jenkins/jenkins:lts

USER root

RUN apt-get update && \
    apt-get install -y maven docker.io docker-compose && \
    rm -rf /var/lib/apt/lists/*

RUN usermod -aG docker jenkins

RUN jenkins-plugin-cli --plugins workflow-aggregator git matrix-auth junit allure-jenkins-plugin

COPY setup.groovy /usr/share/jenkins/ref/init.groovy.d/setup.groovy

USER jenkins