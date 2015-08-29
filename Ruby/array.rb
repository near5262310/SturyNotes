array = ['a','b','c']

array.each do |i|
	puts "#{i}"
end

array.each{ |i|
	puts "S #{i}"
}

colors = {"red" => 0xf00, "green" => 0x0f0, "greeb" => 0x00f}

colors.each{ |key, value|
	puts "#{key} => #{value}"
}

(1..5).each{ |number|
	puts "#{number}"
}

(1...5).each{ |number|
	puts "#{number}"
}