use testdb;

-- 1. 기획부에 근무하는 사원의 이름과 직위 조회
select 이름, 직위
from 사원
where 부서번호 = (select 부서번호 from 부서 where 부서명 ='기획부');

-- 2. 재고가 50개 미만인 제품의 제품번호, 주문번호, 주문수량 조회
select 제품번호, 주문번호, 주문수량
from 주문세부
where 제품번호 in (select 제품번호 from 제품 where 재고<50);

-- 3. 고객의 주문기록이 존재하지 않는 고객의 고객번호, 고객회사명 조회
select 고객번호, 고객회사명 
from 고객
where 고객번호 not in (select 고객번호 from 주문);

-- 4.'2022-02-01'에서 내 주문이 있는 사원의 사원번호, 이름, 직위 조회
select 사원번호, 이름, 직위
from 사원
where 사원번호 in(select 사원번호 from 주문
where 주문일 >= adddate('2020-02-01',interval -3 month ) 
);

-- 5. 고객별 주문수를 계산하여 고객회사명, 주문수 조회
select 고객회사명, (select count(*)from 주문 where 고객.고객번호 = 주문.고객번호 )as 주문수
from 고객;


-- 6. 제품명, 제품별 총주문수량을 조회
select 제품명, (select sum(주문수량)from 주문세부 where 주문세부.제품번호 = 제품.제품번호)as 총주문수량
from 제품;


