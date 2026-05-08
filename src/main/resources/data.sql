-- Create BIKE table (if not present) and insert initial test data
CREATE TABLE IF NOT EXISTS BIKE (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(19,2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Use MERGE so startup is repeatable without duplicate key errors
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (1, 'Ducati Monster', 12000.00, CURRENT_TIMESTAMP);
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (2, 'Yamaha MT-07', 7500.00, CURRENT_TIMESTAMP);
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (3, 'BMW S1000RR', 18000.00, CURRENT_TIMESTAMP);
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (4, 'Honda CB500F', 6500.00, CURRENT_TIMESTAMP);
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (5, 'KTM Duke 390', 4200.00, CURRENT_TIMESTAMP);
MERGE INTO BIKE (id, name, price, created_at) KEY (id) VALUES (6, 'Kawasaki Ninja 400', 4800.00, CURRENT_TIMESTAMP);


