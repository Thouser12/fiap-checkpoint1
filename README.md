# Checkpoint 1

Aplicação Java com container checkpoint 1 - 1° Semestre

## Pré-requisitos

- Java 17+
- Docker 
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/thouser12/fiap-checkpoint1.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t fiap-checkpoint1 .
```

* Executar container

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "dev"
```
docker run -d -p 8080:8080 -e PROFILE=dev latest
```

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "stg"
```
docker run -d -p 8080:8080 -e PROFILE=stg latest
```

##### Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "prd"
```
docker run -d -p 8080:8080 -e PROFILE=prd latest
```

## Navegação

- Base

http://localhost:8080

- Endpoint que retorna string "Pong em <prd|dev|stg>"

http://localhost:8080/ping 


## Features (Funcionalidades)

- Múltiplos profiles

## Integrantes

- Arthur Miranda Santos - RM:93023  -  https://hub.docker.com/repository/docker/art5hur/fiap-checkpoint1/general
- Thomas D'ávila Meyer Pflug - RM:92915  -  https://hub.docker.com/repository/docker/thouser12/fiap-checkpoint1/general


