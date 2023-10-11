CREATE TABLE wallet_history (
    wallet_history_id SERIAL PRIMARY KEY,
    wallet_id integer,
    transaction_value decimal,
    transaction_status VARCHAR(255),
    create_time timestamp,

    CONSTRAINT FK_wallet_id FOREIGN KEY (wallet_id) REFERENCES wallet(wallet_id)
);