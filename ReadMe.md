# generate service form wsdl

1. generate service from wsdl, and copy to java directory
    > cd ./wsdl
    > wsdl2java -encoding utf-8 -frontend jaxws21 ws320.wsdl11.wsdl

2. write SIB and implements the generate SEI Ws320 class
    > public class Ws320Impl implements Ws320

---



Definition of Schedule
----------------------

The schedule is qualified by the following attributes:

1. hospital
2. department
3. doctor (optional)
4. date

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

1.  Duplicate incoming identifiers, there are two
    situations to handle:

    a.  if all other attributes have same value
        we just ignore and give an warning on this.

    b.  else, we report an error.

2.  If one of the current/incoming schedules can not
    find a matching schedule in incoming/current
    schedules, and the date lies in the date window
    intersection of the current and incoming date window.

    a.  We should report an error then.

3.  One attribute of a incoming schedule not equal the
    one of a current schedule with same identifier.

    a.  result in a cancel registration,
    b.  or, an error same as situation (b) in (1).


Outbound Triggers
-----------------

1.  One or some of the attributes of a schedule with
    specified values need to be replaced with more
    meaningful values.


Trigger Design
--------------

function(cur-id, in-id, attr, cur-val, in-val)
{
    action
}

action:

    -   trigger function