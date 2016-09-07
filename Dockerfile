FROM jenkins
MAINTAINER robsonoduarte

USER root

# install docker
RUN  apt-get update && \
	 apt-get upgrade -y &&  \
	 apt-get install -y docker.io

USER jenkins
