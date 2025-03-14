INSERT INTO car_owner (name, contact_info) VALUES ('John Doe', 'john.doe@example.com');
INSERT INTO car_owner (name, contact_info) VALUES ('Jane Smith', 'jane.smith@example.com');

INSERT INTO car (model, variant, status, registered_date, car_owner_id) VALUES ('Tesla Model S', 'Performance', 'Ideal', '2023-10-01', 1);
INSERT INTO car (model, variant, status, registered_date, car_owner_id) VALUES ('Toyota Camry', 'LE', 'On Lease', '2023-09-15', 2);

INSERT INTO end_customer (name, contact_info) VALUES ('Alice Brown', 'alice.brown@example.com');
INSERT INTO end_customer (name, contact_info) VALUES ('Bob White', 'bob.white@example.com');

INSERT INTO lease (start_date, end_date, car_id, end_customer_id) VALUES ('2023-10-10', '2023-10-20', 2, 1);