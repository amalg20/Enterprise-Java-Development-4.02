USE hospital;

INSERT INTO employee (id, department, name, status)VALUES
(356712, 'cardiology', 'Alonso Flores', 'ON_CALL'),
(564134, 'immunology', 'Sam Ortega', 'ON'),
(761527, 'cardiology', 'German Ruiz', 'OFF'),
(166552, 'pulmonary', 'Maria Lin', 'ON'),
(156545, 'orthopaedic', 'Paolo Rodriguez', 'ON_CALL'),
(172456, 'psychiatric', 'John Paul Armes', 'OFF');


INSERT INTO patient (id, admitted_by, date_of_birth, name)VALUES
(1, 564134, '1984-03-02' ,'Jaime Jordan'),
(2,564134 , '1972-01-12','Marian Garcia'),
(3, 356712, '1954-06-11', 'Julia Dusterdieck'),
(4, 761527, '1931-11-10', 'Steve McDuck' ),
(5, 172456, '1999-02-15','Marian Garcia' );

DROP TABLE patient;