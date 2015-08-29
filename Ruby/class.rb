class Customer
	@@nu_total_customer = 0

	def initialice(id, name)
		@id = id
		@name = name
	end

	def showDetail()
		puts "id #{@id}, name #{@name}"
	end

	def total_no_of_customers()
		@@nu_total_customer += 1 
		puts "Total numbre of customer is #{@@nu_total_customer}"
	end
end

cus1 = Customer.new
cus1.initialice(1, "asher")
cus1.showDetail()
cus1.total_no_of_customers()


cus1 = Customer.new
cus1.initialice(2, "sean")
cus1.showDetail()
cus1.total_no_of_customers()