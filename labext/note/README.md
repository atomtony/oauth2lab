# H2链接
![a](images/h2_connect.png)

# 启动mysql容器服务
```
docker run -d --name mysql \
  -p 3306:3306 \
  --restart=always \
  -e MYSQL_ROOT_PASSWORD=123456 \
  -v ~/docker-data/mariadb/data:/var/lib/mysql \
  -d mysql:5.7
```