CREATE SCHEMA IF NOT EXISTS trackq;

CREATE TABLE IF NOT EXISTS trackq.users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(30) NOT NULL UNIQUE,
  email VARCHAR(30) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL
);


CREATE TABLE IF NOT EXISTS trackq.roles (
  id INT PRIMARY KEY AUTO_INCREMENT,
  rolename VARCHAR(30) NOT NULL UNIQUE
);


CREATE TABLE IF NOT EXISTS trackq.user_to_role (
  user_to_role_id INT PRIMARY KEY AUTO_INCREMENT,
  user_id INT NOT NULL, role_id INT NOT NULL,
   FOREIGN KEY (user_id) REFERENCES users(id),
   FOREIGN KEY(role_id) REFERENCES roles(id)
);