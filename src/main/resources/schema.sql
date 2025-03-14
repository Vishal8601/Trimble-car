CREATE TABLE car_owner (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           contact_info VARCHAR(255)
);

CREATE TABLE car (
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     model VARCHAR(255) NOT NULL,
                     variant VARCHAR(255),
                     status VARCHAR(50),
                     registered_date DATE,
                     car_owner_id BIGINT,
                     FOREIGN KEY (car_owner_id) REFERENCES car_owner(id)
);

CREATE TABLE end_customer (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              contact_info VARCHAR(255)
);

CREATE TABLE lease (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       start_date DATE,
                       end_date DATE,
                       car_id BIGINT,
                       end_customer_id BIGINT,
                       FOREIGN KEY (car_id) REFERENCES car(id),
                       FOREIGN KEY (end_customer_id) REFERENCES end_customer(id)
);