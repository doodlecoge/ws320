create table if not exists hospitals
(

);

-- <HospitalCode>ZYYY</HospitalCode>
-- <DepartName></DepartName>
-- <DepartId>123</DepartId>
-- <DepartIntro></DepartIntro>
-- <DepartType>2</DepartType>
-- <RegistryFee>1.00</RegistryFee>
-- <ClinicFee>4.50</ClinicFee>
-- <MZKS>10</MZKS>
-- <Departsex>0</Departsex>
-- <Babyflag>0</Babyflag>
-- <BabyAge>14</BabyAge>

create table if not exists departments
(
  DepartId      varchar (20)  not null,
  HospitalId  varchar (20),
  DepartName    varchar (20),
  DepartIntro   varchar (1000),
  DepartType    varchar (20), -- ?
  RegistryFee   decimal (5,2),
  ClinicFee     decimal (5,2),
  MZKS          varchar (20),
  Departsex     varchar (01), -- M/F
  Babyflag      varchar (01), -- Y/N
  BabyAge       int
);

-- doctors


-- <Hospitalcode>ZYYY</Hospitalcode>
-- <DoctorId>123</DoctorId>
-- <DepartId>123</DepartId>
-- <DoctorName>何</DoctorName>
-- <DoctorSex>1</DoctorSex>
-- <DoctorRank></DoctorRank>
-- <DoctorIntor></DoctorIntor>
-- <DoctorInro></DoctorInro>
-- <IsExpert>1</IsExpert>
-- <AVeworktime></AVeworktime>

create table if not exists departments
(
  DoctorId    varchar (20),
  HospitalId  varchar (20),
  DepartId    varchar (20),
  DoctorName  varchar (20),
  DoctorSex   varchar (20), -- M/F
  DoctorRank  int,
  DoctorIntor varchar (20), -- ?
  DoctorInro  varchar (1000),
  IsExpert    varchar (20), -- Y/N
  AVeworktime varchar (20) -- ?
);


-- depart work
-- <Hospitalcode>ZYYY</Hospitalcode>
-- <DepartId>102</DepartId>
-- <WorkStatus>0</WorkStatus>
-- <WorkDate>2014-04-13</WorkDate>
-- <WorkType>1</WorkType>
-- <Limited>9999</Limited>
-- <Registryfee>0.00</Registryfee>
-- <Chinicfee>4.50</Chinicfee>
-- <BeginNo>2</BeginNo>
-- <SpaceNo>2</SpaceNo>
create table if not exists departments
(
  Hospitalcode
  DepartId
  WorkStatus
  WorkDate
  WorkType
  Limited
  Registryfee
  Chinicfee
  BeginNo
  SpaceNo
);



-- doctor work
-- Hospitalcode
-- WorkStatus
-- DoctorId
-- DepartId
-- WorkDate
-- WorkType
-- Limited
-- BeginNo
-- SpaceNo
-- Registryfee
-- Chinicfee
-- Expertsfee