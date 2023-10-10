CREATE TABLE wallet (
    wallet_id SERIAL PRIMARY KEY,
    user_id integer,
    value decimal,
    create_time timestamp,
    update_time timestamp,
    CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES bet_user(user_id)
);