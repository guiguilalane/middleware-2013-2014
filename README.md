La nashor Team vous présente les services de son tout nouvel aggrégateur de flux RSS.
	*) aggréger
		Possibilité d'avoir plusieurs aggrégation...
		-createAggregation() //aggrégation vide
		-createAggregation(List<FluxRSS>) //aggrégation non vide
		-addRSS(FluxRSS)
		-addManyRSS(List<FluxRSS>)
		-removeRSS(FluxRSS)

	*) session utilisateur
		chaque utilisateur enregistré à sa session sauvegardée
		-signup(String user, String pass, String email)
		-signin(String user, String pass)
		-signout()
		-logout()

	*) partage
		... et possibilité d'en partager(mettre public) certaines
		-share(Aggregation)