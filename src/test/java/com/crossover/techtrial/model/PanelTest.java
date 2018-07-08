package com.crossover.techtrial.model;

import com.crossover.techtrial.dto.DailyElectricity;
import com.crossover.techtrial.model.HourlyElectricity;
import com.crossover.techtrial.model.Panel;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * PanelControllerTest class will test all APIs in PanelController.java.
 * 
 * @author Crossover
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PanelTest {

	private Panel panel = new Panel(3L, "12345", 12.123456, 12.123456, "ACC");

	@Test
	public void createPanel() throws Exception {
		Panel result = new Panel();
		result.setBrand("ACC");
		result.setSerial("12345");
		result.setId(3L);
		result.setLatitude(12.123456);
		result.setLongitude(12.123456);
		
		Assert.assertEquals(panel, result);
		
	}

	public void fillPanel() {
		
	}
}
