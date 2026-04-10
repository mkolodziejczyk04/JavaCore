FROM jenkins/jenkins:lts

USER root
# 1. Tu dodajemy Dockera i Docker-Compose do warsztatu Jenkinsa
RUN apt-get update && \
    apt-get install -y maven docker.io docker-compose && \
    rm -rf /var/lib/apt/lists/*

# 2. Tu dajemy Jenkinsowi klucze do bramy Dockera
RUN usermod -aG docker jenkins

RUN jenkins-plugin-cli --plugins workflow-aggregator git matrix-auth

# Twój skrypt setupu
COPY setup.groovy /usr/share/jenkins/ref/init.groovy.d/setup.groovy

USER jenkins