# MicroservizioMoto
# Workshop Microservizi Java

Workshop pratico Eleventh sui microservizi in Java con Spring Boot, MySQL e Docker

Un microservizio Spring Boot per la gestione di una flotta di motociclette.

## 📋 Descrizione

MicroservizioMoto è un'applicazione Java basata su Spring Boot che fornisce API RESTful per gestire le motociclette. Il progetto include entità di dominio, repository per l'accesso ai dati, servizi di business logic e controller REST.

## 🛠 Tecnologie

- **Java**: Runtime per l'esecuzione dell'applicazione
- **Spring Boot**: Framework per lo sviluppo di applicazioni Java
- **Maven**: Strumento di build e gestione delle dipendenze
- **JUnit 5**: Framework per i test unitari
- **Docker**: Containerizzazione dell'applicazione
- **Docker Compose**: Orchestrazione dei container

## 📦 Struttura del Progetto

```
MicroservizioMoto/
├── src/
│   ├── main/
│   │   ├── java/com/corso/MicroservizioMoto/
│   │   │   ├── MicroservizioMotoApplication.java    (Classe principale)
│   │   │   ├── controller/                           (Controller REST)
│   │   │   ├── entity/
│   │   │   │   └── bike.java                        (Entità Bike)
│   │   │   ├── repo/                                (Repository)
│   │   │   └── services/                            (Servizi)
│   │   └── resources/
│   │       ├── application.properties               (Configurazione)
│   │       ├── static/                              (File statici)
│   │       └── templates/                           (Template Thymeleaf)
│   └── test/
│       └── java/com/corso/MicroservizioMoto/
│           └── MicroservizioMotoApplicationTests.java
├── pom.xml                                          (Dipendenze Maven)
├── Dockerfile                                       (Configurazione Docker)
├── compose.yaml                                     (Configurazione Docker Compose)
└── HELP.md                                          (Documentazione aggiuntiva)
```

## 🚀 Come Iniziare

### Prerequisites

- Java 8 o superiore
- Maven 3.6+
- Docker e Docker Compose (opzionale, per containerizzazione)

### Installazione e Esecuzione

#### 1. Clone il repository
```bash
git clone <repository-url>
cd MicroservizioMoto
```

#### 2. Compilazione con Maven
```bash
./mvnw clean install
```

#### 3. Esecuzione dell'applicazione
```bash
./mvnw spring-boot:run
```

L'applicazione sarà disponibile su `http://localhost:8080`

### Docker

#### Build dell'immagine Docker
```bash
docker build -t microservizio-moto:latest .
```

#### Esecuzione con Docker Compose
```bash
docker-compose up
```

## 🧪 Test

Esegui i test unitari con Maven:

```bash
./mvnw test
```

I test sono configurati con JUnit 5 e includeono un test di caricamento del contesto Spring Boot.

## 🏗 Componenti Principali

### Entity
- **Bike.java**: Entità che rappresenta una motocicletta con i relativi attributi

### Controller
Endpoint REST per la gestione delle motociclette. Consultare il codice del controller per i dettagli sulle route disponibili.

### Repository
Interfacce per l'accesso ai dati tramite Spring Data JPA.

### Services
Logica di business per la gestione delle operazioni sulle motociclette.

## ⚙️ Configurazione

Modifica il file `src/main/resources/application.properties` per configurare:
- Porta di ascolto
- Configurazione del database
- Altre proprietà specifiche dell'applicazione

## 📝 Note di Sviluppo

- Il progetto utilizza Maven Wrapper (`mvnw`) per standardizzare la versione di Maven
- Spring Boot gestisce automaticamente la maggior parte delle configurazioni
- I file statici possono essere inseriti nella cartella `src/main/resources/static/`

## 📚 Risorse Aggiuntive

- [Documentazione Spring Boot](https://spring.io/projects/spring-boot)
- [Guida Maven](https://maven.apache.org/guides/getting-started/index.html)
- [Docker Documentation](https://docs.docker.com/)

## 📄 Licenza

Specificare la licenza del progetto qui.

## 👥 Contatti

Per informazioni o domande sul progetto, contattare il team di sviluppo.

---

**Ultimo aggiornamento**: Maggio 2026

