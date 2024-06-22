CREATE TABLE iF NOT EXISTS items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    price DECIMAL NOT NULL,
    type ENUM('SWEET', 'DRINK', 'FLOUR', 'BREAD', 'PASTA') NOT NULL,
    availability ENUM('LOW', 'MEDIUM', 'HIGH') NOT NULL,
    image1 BLOB,
    image2 BLOB,
    image3 BLOB,
    description TEXT NOT NULL
);