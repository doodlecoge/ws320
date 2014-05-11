# generate service form wsdl

1. generate service from wsdl, and copy to java directory
    > cd ./wsdl
    > wsdl2java -encoding utf-8 -frontend jaxws21 ws320.wsdl11.wsdl

2. write SIB and implements the generate SEI Ws320 class
    > public class Ws320Impl implements Ws320

---



Definitions
-----------

1.  **Schedule**. Schedule is the timetable of
    a doctor or department showing the working time
    list of that doctor. It is usually divided in
    the granularity of half day, called am or pm.
    Here, for convenient we use the plural form
    *schedules* to represent the timetable, and
    the singular word *schedule* is used to stand for
    one item of the schedules.
    And then a department's/doctor's schedule is uniquely
    identified by the following 4/5 attribute.

    1.  hospital
    2.  department
    3.  doctor (if doctor)
    4.  date
    5.  am or pm

2.  **Time Frame**. Time frame is the a period of
    time from the very beginning of a schedules to
    the very end of the schedules. This is usually
    7 days of time, can be calculated using:

        min(dates of schedules) ~ max(dates of schedules)

We consider two schedules have the same **identifier**
if they do have same values for these properties.
Besides, a schedule has a **status** attribute which
indicating the schedule is canceled or just as usual.


When a Trigger Fires
====================
1.  canceling registration, if the schedule of
    some doctor at some date in AM or PM is canceled.
    this need a **comparison** with previous data.
2.  change properties of some schedules that match
    the given pattern.
3.  schedule mismatching: only one of current and
    incoming schedule exists, we should report an
    error if encountered such situation.


Triggering Events
=================

Triggers are examined at two different times, one is
when new data comes in from hospital, the **inbound
triggers**; the other is when responding 3rd party
application requests, the **outbound triggers**.


Inbound Triggers
----------------

1.  **Duplication**. Duplicate incoming identifiers,
    there are two situations to handle:

    a.  if all other attributes have same value
        we just ignore and give an warning on this.

    b.  else, we report an error.

2.  **Out of date**. Too old or too early.

    a.  just ignore, and give a warning

3.  **Mismatching**. If one of the current/incoming schedules
    can not find a matching schedule in incoming/current
    schedules, and the date lies in the intersection of two
    time frames.

    a.  We should report an error then.

4.  **Changing**. One attribute of a incoming schedule not
    equal the one of a current schedule with same identifier.

    a.  result in a cancel registration,
    b.  or, an error same as situation (b) in (1).


Outbound Triggers
-----------------

1.  One or some of the attributes of a schedule with
    specified values need to be replaced with more
    meaningful values.

    a.  just change the value


Use Cases
---------

    Hospitalcode;
    DepartId;
    DoctorId;
    WorkDate;
    WorkType;
    WorkStatus;
    Limited;
    BeginNo;
    SpaceNo;
    Registryfee;
    Chinicfee;
    Expertsfee;




Trigger Design
==============

Selector Grammar
----------------

The grammar is described using [ABNF](http://tools.ietf.org/html/rfc5234)

    SELECTOR    =   0KV / KV *("and" KV)                    ; empty selector is allowed
    KV          =   APM / DATE / "(" K "=" V ")"
    DATE        =   "date" "=" SQ 4DIGIT-2DIGIT-2DIGIT SQ   ; date format yyyy-MM-dd
    SQ          =   "'"                                     ; single quote
    APM         =   "apm" "=" ("'am'" / "'pm'")
    K           =   "hospital" / "department" / "doctor"
    V           =   SQ *(ALPHA / DIGIT / WSP) SQ
    ALPHA       =   %x41-5A / %x61-7A                       ; A-Z / a-z
    DIGIT       =   %x30-39                                 ; 0-9



An example, any resemblance to a person is purely coincidental:

    (hospital = '人民医院') and (department = '神经内科') and (doctor = '小明') and (date = '2013-05-08') and (apm = 'am')


Events to Handle
----------------

1.  inbound - detection

    1.  duplication
    2.  out of date
    3.  single identifier (date in intersection of time frames)
    4.  same identifier, but a attribute changed

2.  outbound - replacement

    1.  some schedule need to change value of some attribute


Trigger Syntax
--------------

In previous sibling section, for case 1.1, 1.2 and 1.3, we need
to check identifiers only. For case 1.4 and 2.1, we need to
specify which attribute changed, and may also need to supply
two values for the attribute, one for current schedule and the
other for incoming schedule.

For 1.4, if two different values given, once an identifier matched
we need to perform an **action**, so an action is also needed.

    selector, attribute, old value, new value, action

The following example will result in a canceling of
registration for the schedule is being considering.

    selector    =
    attribute   = work_status
    new value   = 1
    old value   = 0



For 2.1, we need to know which attribute to replace and the new
value for that attribute.

    selector, attribute, new value

For example:

    selector    = (doctor = '小刚') and (department = '专家门诊')
    attribute   = department
    new value   = 儿科

This will replace the department name to 儿科 for all schedules
that the doctor name is 小刚 and department name is 专家门诊.