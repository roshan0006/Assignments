1)use mongo_practice

2)db.createCollection('movies')

3)db.movies.insertMany(([{'Title':'Fight Club','Writer':'Chuck Palahniuko','Year':1999,'Actors':'Brad Pitt,Edward Norton'},{'Title':'Pulp Fiction','Writer':'Quentin Tarantino','Year':1994,'Actors':'John Travolta 
Uma Thurman'},{‘Title’:‘Inglorious Basterds’,‘Writer’:’Quentin Tarantino’,‘Year’:2009,‘Actors’:’Brad Pitt,Diane Kruger,Eli Roth’},{‘Title’:’The Hobbit: An Unexpected Journey’,‘writer’:‘J.R.R. Tolkein’,‘year’:2012,‘franchise’:’The Hobbit’},{‘year’:2013,‘Franchise’:‘The Hobbit’},{‘title’:‘The Hobbit: The Battle of the Five Armies’,‘Writer’:‘J.R.R. Tolkein’,‘year’:2012,‘franchise’:’The Hobbit’,‘synopsis’:'Bilbo and Company are forced to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness.'},{‘title’:'Pee Wee Hermans Big Adventure',‘Title’:'Avatar'}]
)

4)db.movies.find()

5)db.movies.find({writer:'Quentin Tarantino'})

6)db.movies.find({Actor:’Brad Pitt’})

7)db.movies.find({franchise:’The Hobbit’})

8)db.movies.find({year: {$gte:1990})

9)db.movies.find({year:{$lt:2000}},{year:{$gt:2010}})

10)db.movies.update({synopsis: ‘The Hobbit: An Unexpected Journey" : "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug.’},{‘Title’:’The Hobbit: An Unexpected Journey’,‘writer’:‘J.R.R. Tolkein’,‘year’:2012,‘franchise’:’The Hobbit’},{upsert:true})

11)db.movies.update({synopsis: "The Hobbit: The Desolation of Smaug" : "The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."},{upsert:true})

12)db.movies.update({‘actors’: ’John Travolta,Uma Thurman’},{$set:{‘actors’: ’John Travolta,Uma Thurman and Samuel L.Jackson’}}) 

13)db.movies.createIndex({synopsis:'text'})
   db.movies.find({$text:{$search:'Bilbo'}}).pretty()

14)db.movies.find({$text:{$search:'Gandalf'}}).pretty()

15)db.movies.find({$text:{$search:'Bilbo'},{$search:'Gandalf'}})

16)db.movies.find({$text:{$search:'dwarves'},{$search:'hobbit'}})

17)db.movies.find({$text:{$search:'gold'},{$search:'dragon'}})

18)db.movies.dropIndex('Pee Wee Hermans Big Adventure')

19)db.movies.dropIndex('Avatar')

20)db.createCollection(users)

21)db.users.insertmany([{'username':'GoodGuyGerg'},{'first_name':'Good Guy'},{'last_name':'Gerg'},{'username':{'first':'Scumbag','last':'Steve'}}})

22)db.createCollections(posts)

23)db.posts.insertmany([{'username':'GoodGuyGerg'},{'title':'passes out at party'},{'body':'Wakes up early and cleans house'},{'username':'GoodGuyGreg'},{'title':'Steals your identity'},{'body':'Raises your credit score'},{'username':'GoodGuyGreg'},{'title':'Reports a bug in your code'},{'body':'Sends you a Pull Request'},{'username':'ScumbagSteve'},{'title':'Borrows something'},{'body':'Sells it'},{'username':'ScumbagSteve'},{'title':'Borrows everything'},{'body':'The end'},{'username':'ScumbagSteve'},{'title':'Forks your repo on github'},{'body':'Sets to private'}])

24)db.users.find().pretty()

25)db.posts.find().pretty()

26)db.posts.find({username:'GoodGuyGreg'})

27)db.posts.find({username:'ScumbagSteve'})

28)db.comments.find().pretty()

29)db.comments.find({username:'GoodGuyGreg'})

30)db.comments.find({username:'ScumbagSteve'})

