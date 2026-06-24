set serveroutput on;

declare
    a number := 15;
begin
    if a < 18 then
        dbms_output.put_line('You are not eligible');
    else
        dbms_output.put_line('You are eligible');
    end if;
end;
/
set serveroutput on;

declare
    a char(1) := 'A';
begin
    case a
        when 'A' then
            dbms_output.put_line('grade is A');
        when 'B' then
            dbms_output.put_line('grade is B');
        when 'C' then
            dbms_output.put_line('grade is C');
        when 'D' then
            dbms_output.put_line('grade is D');
        else
            dbms_output.put_line('Fail');
    end case;
end;
/
set serveroutput on;

declare
    mark number := 50;
begin
    if mark >= 90 then
        dbms_output.put_line('Grade A');
    elsif mark >= 75 then
        dbms_output.put_line('grade B');
    elsif mark >= 50 then
        dbms_output.put_line('grade C');
    else
        dbms_output.put_line('Fail');
    end if;
end;
/


create or replace procedure greet
is
begin
    dbms_output.put_line('Hello World');
end;
/
exec greet;

create or replace procedure square_num(n in number)
is
begin
    dbms_output.put_line('Square = ' || (n*n));
end;
/
exec square_num(5);