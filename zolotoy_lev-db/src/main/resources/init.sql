drop schema if exists gold CASCADE;
drop user if exists zlpostgres;

create user zlpostgres with encrypted password 'UEdqe8xZxm8Ga8z';
create schema gold authorization zlpostgres;