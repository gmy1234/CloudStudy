package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gmydl
 * @title: PaymentApp
 * @projectName CloudStudy
 * @description: 支付提供者
 * @date 2022/7/21 10:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class);
    }
}
