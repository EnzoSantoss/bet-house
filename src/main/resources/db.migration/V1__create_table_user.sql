create table if not exists "public".user(
	"user_id" serial primary key,
	"name" varchar(255),
	"dob" date,
	"created_at" timestamp,
	"cpf" varchar(255),
	"email" varchar(255)
);