Stories
=======

1.  spring ws
    1.  server
    2.  client
2.  data structure for memory cache
3.  triggers
    1.  schedule change while comparing current and incoming schedules
    2.  replace some of schedule properties if match pattern


Task Tracking System
====================

We use `to do list` to keep current task need to perform, and `completed list`
to track all completed tasks. The `history` keep track of all actions including
*add*, *finish* and *reopen* a task. We create a record in `to do list` for a
new task, and when finished we move it to `completed list`, while reopening a
task we will moving corresponding record from `completed list` to `to do list`.


the grammar for each history task:

    history     = date op to_do_id
    date        = day "/" month "/" year
    op          = "+" / "-" / "*"
    to_do_id    = "TD" 3DIGIT


`op` meanings:

    + add a to do task;
    - finish a to do task;
    * reopen a to do task, because of a bug or unfinished.


to do list
----------

1.  `TD004` add real hisclient code instead of loading data from local files;
1.  `TD005` patient & register tables
1.  `TD006` db interface
1.  `TD007` add trigger config web page - add/remove/modify trigger


completed list
--------------

1.  `TD001` ws320.xsd
2.  `TD002` memory cache
3.  `TD003` trigger design


history
-------

1.  2014/05/28 + `TD004`
1.  2014/05/29 + `TD005`