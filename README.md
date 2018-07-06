# es
简要描述：	表和列翻译			
请求URL：	http://localhost:7081/entityController/getTablesEnumColumnName			
请求方式：	POST			
参数：	参数名	必选	类型	说明
	-	-	-	-
				
************************************************************************************************************************				
简要描述：	搜索全部分表的信息			
请求URL：	http://localhost:7081/entityController/searchTables			
请求方式：	POST			
参数：	参数名	必选	类型	说明
	name	是	String	搜索信息
	pageNumber	是	int	页码
	pageSize	是	int	条数
				
************************************************************************************************************************				
				
简要描述：	搜索分表的信息			
请求URL：	http://localhost:7081/entityController/searchTable			
请求方式：	POST			
参数：	参数名	必选	类型	说明
	name	是	String	搜索信息
	table	是	String	分表名 支持多个用”,”区分
	pageNumber	是	int	页码
	pageSize	是	int	条数
				
************************************************************************************************************************				
				
简要描述：	搜索全库的信息			
请求URL：	http://localhost:7081/entityController/searchAll			
请求方式：	POST			
参数：	参数名	必选	类型	说明
	name	是	String	搜索信息
	pageNumber	是	int	页码
	pageSize	是	int	条数
				
************************************************************************************************************************				
