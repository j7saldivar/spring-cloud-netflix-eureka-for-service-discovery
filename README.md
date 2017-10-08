# spring-cloud-netflix-eureka-for-service-discovery

1. Start discovery server
2. Start multiple instance for the service overwritting server.port (don't use 8080) and service.instance.name
3. Start the client. The client will start automatically in port 8080. Go to a browser http://localhost:8080. The 2 services will be displayed in a round-robin fashion after refreshing the page. 
