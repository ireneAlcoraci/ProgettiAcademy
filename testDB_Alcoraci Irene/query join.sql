-- Alcoraci Irene

-- trovare nome, cognome, lavoro, id reparto dei dipendenti che lavorano a londra
SELECT employees.FIRST_NAME, employees.LAST_NAME, employees.JOB_ID, employees.DEPARTMENT_ID, departments.DEPARTMENT_NAME
FROM ql.employees
INNER JOIN departments
ON employees.DEPARTMENT_ID = departments.DEPARTMENT_ID 
INNER JOIN locations
ON departments.LOCATION_ID = locations.LOCATION_ID
WHERE locations.CITY = 'London';

-- id dipendente, cognome insieme all'id manager e cognome mannager
SELECT employee.EMPLOYEE_ID, employee.LAST_NAME, manager.EMPLOYEE_ID, manager.LAST_NAME
FROM ql.employees AS employee, ql.employees AS manager
WHERE employee.MANAGER_ID = manager.EMPLOYEE_ID;

SELECT employee.EMPLOYEE_ID, employee.LAST_NAME, manager.EMPLOYEE_ID, manager.LAST_NAME
FROM ql.employees AS employee
INNER JOIN ql.employees AS manager
ON employee.MANAGER_ID = manager.EMPLOYEE_ID;

-- NOME, COGNOME, DATA ASSUNGIONE STIPENDIO MANAGER CON ESPERIENZA MAGGIORE DI 15
SELECT employees.FIRST_NAME, employees.LAST_NAME, employees.HIRE_DATE, TIMESTAMPDIFF(year,  HIRE_DATE, DATE_FORMAT(now(), '%Y-%m-%d')) AS EXPERIENCE 
FROM ql.employees
INNER JOIN departments
ON employees.EMPLOYEE_ID = departments.MANAGER_ID
WHERE TIMESTAMPDIFF(year,  HIRE_DATE, DATE_FORMAT(now(), '%Y-%m-%d')) > 15;

-- trovare gli indirizzi di tutti i dipartimenti
SELECT locations.LOCATION_ID, locations.STREET_ADDRESS, locations.CITY, locations.STATE_PROVINCE, countries.COUNTRY_NAME
FROM locations
INNER JOIN countries
ON locations.COUNTRY_ID = countries.COUNTRY_ID;

-- cronologia del lavoro di un dipendente che sta prelevando più di 10000 di stipendio
SELECT *
FROM job_history
LEFT JOIN employees
ON job_history.EMPLOYEE_ID = employees.EMPLOYEE_ID
WHERE SALARY > 10000;