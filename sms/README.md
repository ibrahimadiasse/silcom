# silcom
## sms

### Documentation
- [spring documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [spring rest service tuto](https://spring.io/guides/gs/rest-service/)

### Tech

- Spring boot
- Docker
- Java 12 
    - [https://jdk.java.net/12/](https://jdk.java.net/12/)
    - For macOS
        - tar xf openjdk-12.0.2_osx-x64_bin.tar.gz
        - sudo mv jdk-12.0.2.jdk /Library/Java/JavaVirtualMachines
        - `javac -version` should give `javac 12.0.2`
- postgresql
    - [https://www.postgresql.org/](https://www.postgresql.org/)

### How to ?

- install java 12
- install [maven](https://maven.apache.org/)
- install docker
  - [cent OS](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-centos-7)
- setup docker container
  - `cd docker/local`
  - `docker-compose build`
  - `docker-compose up -d`
