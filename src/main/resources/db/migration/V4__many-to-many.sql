CREATE TABLE status(
    status_id SERIAL PRIMARY KEY,
    status VARCHAR(45)
);

CREATE TABLE wallet_status(
    wallet_id integer,
    status_id integer,

    CONSTRAINT FK_wallet_id FOREIGN KEY(wallet_id) REFERENCES wallet(wallet_id),
    CONSTRAINT FK_status_id FOREIGN KEY(status_id) REFERENCES status(status_id)
)