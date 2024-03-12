select sum(score) as score, hr_grade.emp_no, emp_name, position, email
from hr_employees, hr_grade
where hr_employees.emp_no = hr_grade.emp_no
and year = 2022
group by hr_grade.emp_no
order by score desc
limit 1