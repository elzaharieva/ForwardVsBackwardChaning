launch(S):-write("Hello. Answer the following questions and find the best trip for you."),askInterest(I), askContinent(C), planeRule(C, T), durationRule(C, D),
    trip(S, C, I, T, D), reccomend(S, D, T).

reccomend(S, D, T):-write("We reccomend you a trip to "), write(S), write(" for a "), write(D), write(" by "), write(T), write(".").

askInterest(I):-write("What are you most interested in?"), nl, 
    write("a)history"),nl , write("b)nature"),nl, write("c)urbanism"), read(X), member(X, [a, b, c]) -> setInterest(X, I) ; write("Invalid input!"), nl, askInterest(I).

setInterest(A, C):- A==a -> C=history ; A==b -> C=nature ; C=urbanism.

askContinent(R):-write("Which continent do you want to travel to?"),nl,
    write("a) North America"), nl, write("b)South America"), nl, write("c)Asia"),nl, write("d)Europe"),nl,write("e)Africa"), 
    				read(C), member(C, [a, b, c, d, e]) -> setContinent(C, R) ; write("Invalid input!"), nl, askContinent(R).

setContinent(A, C):- A==a -> C=northamerica ; A==b -> C=southamerica ; A==c -> C= asia ; A==d -> C=europe; C=africa.

askTransportation(T):-write("How do you prefer to travel?"),nl, write("a)by plane"), nl, write("b)by bus"), 
    				read(C), member(C, [a, b]) -> setTransportation(C, T) ; write("Invalid input!"), nl, askTransportation(T).

setTransportation(A, T):-A==a ->  T=plane ; T=bus.

askDuration(D):-write("We currently have trips for a week and for a month.How much time do you have?"), nl, write("a)week"), nl, write("b)month"), 
    				read(C), member(C, [a, b]) -> setDuration(C, D) ; write("Invalid input!"), nl, askDuration(D).

setDuration(A, D):-A==a ->  D=week ; D=month.

planeRule(C, T):-member(C, [africa, northamerica, southamerica]) -> T=plane ; askTransportation(T).

durationRule(C, D):- C==europe -> D=week ; askDuration(D).

trip("New York", europe, urbanism, plane, week).
trip("Las Vegas", europe, urbanism, plane, week).


trip("New York", northamerica, urbanism, plane, month).
trip("Las Vegas", northamerica, urbanism, plane, week).
trip("San Francisco", northamerica, urbanism, plane, week).

trip("Grand Canyon", northamerica, nature, plane, week).
trip("Niagara Falls",northamerica, nature, plane, week).
trip("Alaska", northamerica, nature, plane, month).
		
trip("Mexico", northamerica, history, plane, month).
trip("Pearl Harbor", northamerica, history, plane, week).

trip("Iguazu Falls", southamerica, nature, plane, week).
trip("Amazonia", southamerica, nature, plane, month).
trip("Machu Picchu",southamerica, history, plane, month).
trip("Machu Picchu", southamerica, history, plane, week).
	
trip("Rio De Janeiro", southamerica, urbanism, plane, month).
trip("Buenos Aires", southamerica, urbanism, plane, week).

trip("Serengeti", africa, nature, plane, week).
trip("Nile River", africa, nature, plane, month).
trip("Victoria Falls", africa, nature, plane, week).
		
trip("Egypt", africa, history, plane, month).
trip("Morocco", africa, history, plane, week).
		
trip("Cape Town", africa, urbanism, plane, month).
trip("Tunis", africa, urbanism, plane, week).

trip("Dead Sea", asia, nature, plane, week).
trip("Fuji", asia, nature, plane, month).
trip("Pamukkale", asia, nature, bus, week).
trip("Bordum Peninsula", asia, nature, bus, month).
		
trip("Angkor Wat", asia, history, plane, week).
trip("Hiroshima", asia, history, plane, month).
trip("Israel", asia, history, bus, month).
trip("Efes", asia, history, bus, week).
		
trip("Dubai", asia, urbanism, plane, week).
trip("Tokyo", asia, urbanism, plane, month).
trip("Bangkok", asia, urbanism, plane, month).
trip("Baku", asia, urbanism, bus, week).
trip("Moscow", asia, urbanism, bus, month).

trip("Triglav", europe, nature, bus, week).
trip("Norway", europe, nature, plane, week).
trip("The Azores", europe, nature, plane, week).
trip("Plitvice Lakes", europe, nature, bus, week).
trip("Montblanc", europe, nature, bus, week).

trip("Rome", europe, history, plane, week).
trip("Istanbul", europe, history, bus, week).
trip("Athens", europe, history, bus, week).

trip("London", europe, urbanism, plane, week).
trip("Paris", europe, urbanism, plane, week).
trip("Barcelona", europe, urbanism, plane, week).
trip("Lisbon", europe, urbanism, plane, week).
trip("Budapest", europe, urbanism, plane, week).
trip("Vienna", europe, urbanism, plane, week).