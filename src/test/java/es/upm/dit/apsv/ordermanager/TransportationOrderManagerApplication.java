package es.upm.dit.apsv.ordermanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TransportationOrderManagerApplication {

	public static final Logger log = LoggerFactory.getLogger(TransportationOrderManagerApplication.class);

	@Autowired
	//private TransportationOrderRepository torderRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransportationOrderManagerApplication.class, args);
	}
}
