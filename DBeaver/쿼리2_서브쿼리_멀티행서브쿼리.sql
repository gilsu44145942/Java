-- 쿼리2_서브쿼리_멀티행.sql

use testdb;


-- 멀티행(=복수행) 버스쿼리는 결과가 여러 행으로 나오는 쿼리를 의미함.
-- 쿼리의 결과가 여러개이므로 '=' 연산자로 처리가 불가능하므로 여러 비교연산자가 필요함
-- <in, all, any, exists, some> 등이 사용됨

-- #1. in
-- 부산광역시 고객이 주문한 주문건수
select count(*)as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객 where 도시 = '부산광역시');

-- #2. any , some
-- 부산광역시 마일리지보다 마일리지가 큰 고객의 정보
-- 서브쿼리의 결과값 중 어느하나보다만 크면 선택(즉, 최소값보다 크면 선택)
-- any
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > any(select 마일리지 from 고객 where 도시 ='부산광역시');

-- some
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > some(select 마일리지 from 고객 where 도시 ='부산광역시');


-- #3. all
-- 각 지역의 어느 평균마일리지보다고 마일리지가 큰 고객의 정보
-- 서브쿼리의 결과값중 최대값보다 크면 선택
select 담당자명, 고객회사명, 마일리지 
from 고객
where 마일리지 > all(select avg(마일리지)from 고객 group by 지역);


-- #4. exists
-- 한번이라도 주문한적이 있는 고객의 정보
 select 고객번호, 고객회사명
 from 고객
 where exists(select *from 주문 where 고객.고객번호 = 주문.고객번호);


-- in 연산자를 이용하여 동일한 결과을 얻을 수 있음
select 고객번호, 고객회사명
from 고객
where 고객번호 in(select distinct 고객번호 from 고객);
-- distinct가 없어도 동일한 결과가 나오지만 중복비교를 하게되므로 사용하는 것이 좋음

/* 다중컬럼 서브쿼리
서브쿼리가 여러개의 컬럼을 select할때 그 컬럼들을 필터링의 조건으로 두개 이상을 사용하는 문법
 */
-- 각 도시마다 최고마일리지를 보유한 고객의 정보
select 도시, 담당자명, 고객회사명, 마일리지
from 고객
where  (도시, 마일리지)  in (select 도시, max(마일리지)from 고객 group by 도시);
-- 서브쿼리가 select한 도시와 max(마일리지) 두개 컬럼에 모두 일치하는 조건을 조회해야함
-- 그러므로 한개의 컬럼으로 두 조건을 만족할 수 없으므로 다중컬럼을 사용해야함 = (도시, 마일리지)
-- 예를 들어, 서울특별시에 있으면서 마일리지가 128,790인 회사를 select하기위해 다중컬럼을 사용한 것임

-- 다중컬럼 서브쿼리 대신 from절의 서브쿼리를 이용하면 해결 가능
select 고객.도시, 담당자명, 고객회사명, 마일리지
from 고객
join (select 도시, max(마일리지)as 최고마일리지 from 고객 group by 도시)as 최고마일리지정보
on 고객.도시 = 최고마일리지정보.도시
and 고객.마일리지 = 최고마일리지정보.최고마일리지;



select * from 고객
where  마일리지 > (select avg(마일리지)from 고객) ;


select * from 고객
where if 







