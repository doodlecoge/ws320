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
  patient_id VARCHAR(18) NOT NULL,
  name       VARCHAR(10) NOT NULL,
  is_blocked VARCHAR(1) DEFAULT 'N',
  blocked_at DATETIME    NOT NULL,
  created_at DATETIME    NOT NULL,
  CONSTRAINT IF NOT EXISTS pk_patient_id PRIMARY KEY (patient_id)
);

CREATE TABLE IF NOT EXISTS ws320.block_histories (
  id         INT AUTO_INCREMENT,
  patient_id VARCHAR(18) NOT NULL,
  operation  VARCHAR(3)  NOT NULL, -- block | cancel
  reason     VARCHAR(20) NOT NULL,
  when       DATETIME    NOT NULL,
  operator   VARCHAR(18) NULL
);

-- id: 1, patient_id: 110111199901016611, operation: block, reason: cancel 2
-- registrations in 7 days, when: 2014-01-01 10:10:10, operator:

CREATE TABLE IF NOT EXISTS ws320.orders
(
  order_id        VARCHAR(20) NOT NULL, -- pk

  -- 未取号,已取号,已退号,爽约,逃费
  order_status    VARCHAR(10) NOT NULL DEFAULT '未取号',

  hospital_id     VARCHAR(10) NOT NULL,
  hospital_name   VARCHAR(20) NOT NULL,
  department_id   VARCHAR(10) NOT NULL,
  department_name VARCHAR(20) NOT NULL,
  doctor_id       VARCHAR(10) NULL,
  doctor_name     VARCHAR(20) NULL,

  patient_id      VARCHAR(18) NOT NULL, -- fk
  patient_name    VARCHAR(10) NOT NULL,
  patient_phone   VARCHAR(20) NOT NULL,

  insureance_type VARCHAR(20) NOT NULL,

  work_date       DATE        NOT NULL,
  apm             VARCHAR(2)  NOT NULL,
  start_time      TIME        NOT NULL,
  end_time        TIME        NOT NULL,

  register_from   VARCHAR(20) NOT NULL,
  operator        VARCHAR(20) NULL,

  is_payed        VARCHAR(1)  NOT NULL DEFAULT 'N',
  pay_account     VARCHAR(20) NULL,
  pay_amount      FLOAT       NULL,

  created_on      DATETIME    NOT NULL,
  CONSTRAINT IF NOT EXISTS pk_order_id PRIMARY KEY (order_id)
);

CREATE TABLE IF NOT EXISTS ws320.order_histories (
  id         INT AUTO_INCREMENT,
  order_id   INT         NOT NULL,
  patient_id VARCHAR(18) NOT NULL, -- for query cancel times quickly
  vendor_id  VARCHAR(20) NOT NULL,
  operator   VARCHAR(20) NOT NULL,
  operation  VARCHAR(3)  NOT NULL, -- 添加,删除,修改
  what       VARCHAR(20) NOT NULL,
  old        VARCHAR(20) NULL,
  new        VARCHAR(20) NULL,
  when       DATETIME    NOT NULL,
  CONSTRAINT IF NOT EXISTS pk_order_his_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ws320.configs (
  key         VARCHAR(20)  NOT NULL,
  value       VARCHAR(200) NOT NULL,
  description VARCHAR(200) NOT NULL,
  CONSTRAINT IF NOT EXISTS pk_key PRIMARY KEY (key)
);

CREATE TABLE IF NOT EXISTS vendors (
  vendor_id   VARCHAR(20) NOT NULL,
  password    VARCHAR(20) NOT NULL,
  description VARCHAR(50) NULL,
  CONSTRAINT IF NOT EXISTS pk_vendor_id PRIMARY KEY (vendor_id)
)