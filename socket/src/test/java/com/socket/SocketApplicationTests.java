package com.socket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SocketApplicationTests {

	static Socket server;
	@Test
	public void run() {


		try {

			server = new Socket("127.0.0.1", 9000);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					server.getInputStream()));
			PrintWriter out = new PrintWriter(server.getOutputStream());
			double tmp = Math.random();
			String str = tmp + "";
			System.out.println(str);
			out.println(str);
			out.flush();
			server.close();

		} catch (IOException ex) {
		} finally {

		}
	}

}
