FROM partlab/ubuntu-jenkins
MAINTAINER robsonoduarte


# install gradle
RUN  add-apt-repository -y ppa:cwchien/gradle && \
	 apt-get update && \
	 apt-get -y install gradle-2.14.1


# install docker
RUN  apt-get update && \
	 apt-get upgrade -y &&  \
	 apt-get install -y docker.io
