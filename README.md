## Microservice example 2

Proyek ini adalah implementasi arsitektur mikroservis menggunakan kerangka kerja Spring Cloud. Arsitektur mikroservis memecah aplikasi besar menjadi komponen-komponen kecil yang disebut mikroservis, masing-masing bertanggung jawab atas fungsionalitas tertentu. Setiap mikroservis diimplementasikan menggunakan Spring Boot, sementara Spring Cloud digunakan untuk mengelola aspek-aspek seperti konfigurasi, penemuan layanan, dan gateway.

## Mikroservis:

### Config Service (spring config server):

Berfungsi sebagai server konfigurasi sentral untuk mengelola konfigurasi mikroservis lainnya.
Menggunakan Spring Config Server untuk menyimpan dan menyediakan konfigurasi.
Department Service (spring cloud department):

Menangani operasi terkait departemen dalam sistem.
Memanfaatkan fitur Spring Cloud untuk keperluan distribusi dan skalabilitas.

### Discovery Service (spring eureka server):

Bertindak sebagai server Eureka untuk penemuan layanan.
Memfasilitasi pendaftaran dan penemuan mikroservis di lingkungan distribusi.

## Employee Service (spring cloud employee):

Menangani operasi terkait karyawan dalam sistem.
Menggunakan fitur-fitur Spring Cloud untuk koordinasi dan manajemen layanan.

### Gateway Service (spring cloud gateway):

Berfungsi sebagai pintu gerbang untuk mengakses mikroservis lainnya.
Memanfaatkan Spring Cloud Gateway untuk rute dan manajemen permintaan.
Organization Service (spring cloud organization):

Menangani operasi terkait organisasi dalam sistem.
Menggunakan fitur-fitur Spring Cloud untuk keperluan koordinasi dan manajemen distribusi.

## Bagaimana cara menggunakan use:

### Build image menggunakan jib google

```sh
mvn jib:dockerBuild
```

### Running on Docker

```sh
docker-compose up -d
```

## Demo microservice example 2 ini

### config-service

```sh
curl -X GET http://localhost:8088/department-service/default

curl -X GET http://localhost:8088/discovery-service/default

curl -X GET http://localhost:8088/employee-service/default

curl -X GET http://localhost:8088/gateway-service/default

curl -X GET http://localhost:8088/organization-service/default

```

### gateway-service

![Departement](/images/department.png)
![Employee](/images/employee.png)
![Organization](/images/organization.png)

## Belajar disini

https://github.com/piomin/sample-spring-microservices-new
