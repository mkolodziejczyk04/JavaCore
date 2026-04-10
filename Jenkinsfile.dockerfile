FROM jenkins/jenkins:lts

USER root
RUN apt-get update && apt-get install -y maven

# Zostawiamy podstawowe pluginy
RUN jenkins-plugin-cli --plugins workflow-aggregator git matrix-auth

# WYŁĄCZAMY (komentujemy) te dwie linie, które psują start
# ENV CASC_JENKINS_CONFIG="/var/jenkins_home/jenkins.yaml"
# COPY jenkins.yaml /var/jenkins_home/jenkins.yaml

# To zostawiamy, żeby projekt sam się stworzył
COPY setup.groovy /usr/share/jenkins/ref/init.groovy.d/setup.groovy

USER jenkins