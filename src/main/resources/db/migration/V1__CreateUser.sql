DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id BIGINT auto_increment primary key,
  name varchar(255) not null,
  updated_at timestamp not null default current_timestamp,
  created_at timestamp not null default current_timestamp
);