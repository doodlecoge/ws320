CREATE SCHEMA IF NOT EXISTS ws320;

DROP TABLE IF EXISTS ws320.hospitals;

CREATE TABLE IF NOT EXISTS ws320.hospitals
(
  id      VARCHAR(10)  NOT NULL,
  name    VARCHAR(20)  NOT NULL,
  address VARCHAR(100) NOT NULL,
  phone   VARCHAR(20)  NOT NULL,
  intro   VARCHAR(500) NULL,
  grade   VARCHAR(10)  NULL,
  kind    VARCHAR(10)  NULL,

  wsdl    VARCHAR(200) NOT NULL,

  CONSTRAINT IF NOT EXISTS pk_id PRIMARY KEY (id)
);

CREATE INDEX IF NOT EXISTS idx_name ON ws320.hospitals (name);


CREATE TABLE IF NOT EXISTS ws320.triggers
(
  selector  VARCHAR(100) NULL,
  attribute VARCHAR(20)  NULL,
  oldvalue  VARCHAR(100) NULL,
  newvalue  VARCHAR(100) NULL,
  action    VARCHAR(100) NOT NULL,
  stage     VARCHAR(10)  NOT NULL,
  CONSTRAINT IF NOT EXISTS pk_action PRIMARY KEY (action)
);


CREATE TABLE IF NOT EXISTS ws320.patients
(
  id             VARCHAR(18) NOT NULL,
  name           VARCHAR(10) NOT NULL,
--   sex            VARCHAR(1)  NOT NULL,
--   phone          VARCHAR(16) NOT NULL,
--   insurance_type INT         NULL,
  blocked        VARCHAR(1)  NOT NULL DEFAULT 'N',

  CONSTRAINT IF NOT EXISTS pk_id PRIMARY KEY (id)

);

CREATE TABLE IF NOT EXISTS ws320.orders
(
  sn              VARCHAR(20) NOT NULL, -- pk

  -- 未取号:wqh, 已取号:yqh, 已退号:yth
  order_status    varchar(10) not null default 'wqh',

  hospital_id     VARCHAR(10) NOT NULL,
  hospital_name   VARCHAR(20) NOT NULL,
  department_id   VARCHAR(10) NOT NULL,
  department_name VARCHAR(20) NOT NULL,
  doctor_id       VARCHAR(10) NULL,
  doctor_name     VARCHAR(20) NULL,

  patient_id      VARCHAR(18) NOT NULL, -- fk
  patient_name    VARCHAR(10) NOT NULL,
  patient_phone   VARCHAR(20) NOT NULL,

  work_date       DATE        NOT NULL,
  apm             VARCHAR(2)  NOT NULL,
  start_time      TIME        NOT NULL,
  end_time        TIME        NOT NULL,

  register_from   VARCHAR(20) NOT NULL,
  operator        VARCHAR(20) NULL,

  is_payed        VARCHAR(1)  NOT NULL DEFAULT 'N',
  pay_account     VARCHAR(20) NULL,
  pay_amount      FLOAT       NULL,

  created_on datetime not null
);