(select name as results from users u left join movieRating mr on u.user_id=mr.user_id group by name order by count(rating) desc,name asc limit 1)

 union all
 
(select title from movies m left join MovieRating mr on m.movie_id = mr.movie_id where date_format(created_at,'%Y-%m') = '2020-02' group by title order by avg(rating) desc, title asc limit 1)