# Write your MySQL query statement below
SELECT distinct p1.project_id,ROUND(AVG(e.experience_years),2) as average_years from project p1
left join
employee e
ON p1.employee_id=e.employee_id
GROUP BY p1.project_id