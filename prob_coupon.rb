t = []

until t.length == 100 
    s = []
    trials = 0
    until s.length == 10
        r = (rand(10)).to_s
        if !s.include?(r)
            s.push(r)
        end
        trials += 1
    end 
    t.push(trials)
end 
print t
#puts "collection complete after #{trials} trials"