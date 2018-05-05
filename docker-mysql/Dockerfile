FROM registry.docker-cn.com/library/mysql:5.7.17
MAINTAINER Haoyun <haoyun@ghostcloud.cn>
ENV MYSQL_ROOT_PASSWORD 123456
ENV TZ Asia/Shanghai
COPY ./select_course.sql /docker-entrypoint-initdb.d/
EXPOSE 3306
