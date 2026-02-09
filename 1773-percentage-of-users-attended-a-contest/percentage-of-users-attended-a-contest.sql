# Write your MySQL query statement below
SELECT distinct r.contest_id ,ROUND(COUNT(DISTINCT r.user_id) * 100.0 /
       (SELECT COUNT(user_id) FROM Users),2) AS percentage from Register r left join users u ON r.user_id=u.user_id
GROUP BY r.contest_id  ORDER BY percentage DESC,r.contest_id ;
