-- 함수3_날짜함수.sql

use testdb;

-- now 현재 날짜와 시간
-- sysdate 현재 시스템의 날짜와 시간 (now와 대부분 동일)
-- curdate 현재 날짜
-- curtime 현재 시간
select now(), sysdate(),curdate(),curtime();   

-- year(년), quarter(분기), month(달), day(날짜), hour(시간), minute(분), second(초)
select year(now()),
       quarter(now()),
       month(now()),
       hour(now()),
       minute(now()),
       second(now()); 
      
-- datediff 날짜간의 일수 차이
-- timestampdiff 두 날짜의 시간을 기준시간으로 변환하여 계산하고 다시 날짜로 변환
select datediff('2024-12-25',now()); -- 두번째 인덱스부터 첫번째 인덱스까지 남은 일수 
select datediff(now(), '2024-12-25'); -- 두번째 인덱스부터 첫번째 인덱스까지 남은 일수 두번째 인덱스의 값이 높으면 음수로 출력      
select abs(datediff(now(), '2024-12-25')); -- 28 (절대값을 활용)  
select timestampdiff(year,now(),'2025-12-25'); -- 1(년)
select timestampdiff(month,now(),'2025-12-25'); -- 12(달)
select timestampdiff(day,now(),'2025-12-25'); -- 392(일)

-- adddate 특정날짜에 기간을 더한 날짜
-- subdate 특정날짜에 기간을 뺀 날짜
-- interval 키워드를 함께 사용하면 더하거나 빼는 기간을 정할 수 있음
select adddate(now(),50),subdate(now(),50); 
select adddate(now(),-50), -- subdate와 동일한 결과
subdate(now(),-50); -- adddate와 동일한 결과
select adddate(now(), interval 50 year); 
select adddate(now(), interval 50 month);
select adddate(now(), interval 50 day);
select adddate(now(), interval 50 hour);

-- last_day 그 달의 마지막 날
-- dayofyear 현재년도에서 며칠이 지났는지 반환
select last_day(now());
select last_day('2025-02-01'); -- 2025-02-28 
select dayofyear(now()); -- 이번년도부터 오늘까지 일수 
select dayofmonth(now()); -- 이번달부터 오늘까지 일 수
select dayofweek(now()); -- 이번주 부터 오늘까지 일수

-- monthname 월을 영어로 반환
select monthname(now()); -- November

-- weekday 요일 반환 : mysql의 경우, 월요일 0 ~ 일요일 6
select weekday(now()); -- 오늘날짜의 숫자요일 








