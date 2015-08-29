#!/user/bin/ruby

print <<EOF
	This is the first way of create
	here document ie. multiple line here.
EOF

print <<"EOF"
	This is the second way of create
	here document ie. multiple line here.
EOF

print <<'EOF'
	This is the second way of create
	here document ie. multiple line here.
EOF

print <<o1, <<o2
	Here is o1
o1
	Here is o2
o2