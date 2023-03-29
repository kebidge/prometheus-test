# PROMETHEUS/GRAFANA DEMO

## RUN
### Run Application
`mvn spring-boot:run`

### Run Prometheus and Grafana
`docker compose up`

## SERVICES
### Warning Trigger
`http://localhost:8080/trigger`

### Prometheus
`http://localhost:9090/`

See triggered warning logs
`logback_events_total{level="warn"}`

### Grafana
`http://localhost:3000/`

URL for Data Source
`host.docker.internal:9090`

Create simple dashboard
`rate(logback_events_total{level="warn"}[1m])`