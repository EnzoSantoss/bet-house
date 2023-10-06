create table bet_user(
	user_id SERIAL primary key,
	name varchar(255),
	dob date,
	created_at timestamp,
	cpf varchar(255),
	email varchar(255)
);