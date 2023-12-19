\c robots;

CREATE TABLE jaegers (
	id			SERIAL PRIMARY KEY,
	modelName   TEXT,
	mark		CHAR(6),
	height		INTEGER,
	weight		NUMERIC,
	status		TEXT,
	origin		TEXT,
	launch		INTEGER,
	kaijuKill 	INTEGER
);

--\ir 'init_db.sql'
--\ir 'queries.sql'