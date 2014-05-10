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

Trigger Design
--------------


1.  inbound

    1.  duplication
    2.  out of date
    3.  single identifier (date in intersection of time frames)
    4.  same identifier, but a attribute changed

2.  outbound

    5.  some schedule need to change value of some attribute




Use Cases
---------

1.  cancel schedule


2.

function(cur-selector, in-selector, attr, cur-val, in-val)
{
    action
}

action:

    -   trigger function