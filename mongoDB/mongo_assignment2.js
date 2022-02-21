1)creating a database named population:
-->use population

2)creating a collection named zipcodes:
-->db.createCollection('zipcodes')

3)importing a zip.json file:
-->mongoimport --jsonarray --db population --collection zipcodes --file zip.json

4)to find all the results where city is 'ATLANTA':
-->db.zipcodes.find({'city':'ATLANTA'})

5)to use the aggregate command to get the same result as above:
-->db.zipcodes.aggregate([{$match:{'city':'ATLANTA'}}])

6)to use aggregate function to group the total population of ATLANTA:
-->db.zipcodes.aggregate([{$group:{_id:{city:'$ATLANTA'},population:{$sum:'$pop'}}}])

7)use aggregate to get the total population of the each state:
-->db.zipcodes.aggregate([{$group:{_id:{state:'$state'},total:{$sum:'$pop'}}}])

8)sort in the highest order:
-->db.zipcodes.aggregate([{$group:{_id:'$state', total:{$sum:'$total'}}},{$sort:{total:-1}}])

9)to limit to only first 3 results:
-->db.zipcodes.find().limit(3)

10)to calculate the total population of the city using aggregation:
11)sort in the heighest order of the population:
12)limit the resukts to first 3 results:
-->db.zipcodes.aggregate([{$group:{_id:{city:'$city',state:'$state'},population:{$sum:'$pop'}}};{$sort:{'population':-1}},{$limit:3}])

