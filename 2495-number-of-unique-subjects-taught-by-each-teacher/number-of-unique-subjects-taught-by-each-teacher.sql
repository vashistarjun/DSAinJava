# Write your MySQL query statement below
SELECT DISTINCT teacher_id ,COUNT(DIstinct subject_id) as cnt from teacher GROup by teacher_id;