class App extends React.Component { (1)

	constructor(props) {
		super(props);
		this.state = {user: []};
	}

	componentDidMount() { (2)
		client({method: 'GET', path: '/Rakutech/User'}).done(response => {
			this.setState({user: response.entity._embedded.user});
		});
	}

	render() { (3)
		return (
			<UserList user={this.state.user}/>
		)
	}
}