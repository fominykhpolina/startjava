\c robots;

DROP TABLE jaegers;

CREATE TABLE jaegers (
	id			SERIAL PRIMARY KEY,
	model_name   TEXT,
	mark		CHAR(6),
	height		INTEGER,
	weight		NUMERIC,
	status		TEXT,
	origin		TEXT,
	launch		INTEGER,
	kaiju_kill 	INTEGER
);

\ir 'init_db.sql'
\ir 'queries.sql'