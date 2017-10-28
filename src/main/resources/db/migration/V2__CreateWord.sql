DROP TABLE IF EXISTS words;
CREATE TABLE words (
  id BIGINT auto_increment PRIMARY KEY,
  user_id BIGINT NOT NULL,
  word varchar(255) NOT NULL,
  count INT NOT NULL DEFAULT 1,
  updated_at timestamp not null default current_timestamp,
  created_at timestamp not null default current_timestamp
);