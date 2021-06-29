const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {user: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/Rakutech/User'}).done(response => {
			this.setState({user: response.entity._embedded.user});
		});
	}

	render() {
		return (
			<UserList user={this.state.user}/>
		)
	}



}

class UserList extends React.Component{
	render() {
		const users = this.props.user.map(user =>
			<User key={user._links.self.href} user={user}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>email</th>
						<th>password</th>
						<th>fullname</th>
					</tr>
					{user}
				</tbody>
			</table>
		)
	}
}
class Employee extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.user.email}</td>
				<td>{this.props.user.password}</td>
				<td>{this.props.user.fullName}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)