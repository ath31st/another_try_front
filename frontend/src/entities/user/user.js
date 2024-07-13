class User {
  constructor(props) {
    this._firstname = props._firstname;
    this._lastname = props._lastname;
    this._email = props._email;
  }

  get firstname() {
    return this._firstname;
  }

  get lastname() {
    return this._lastname;
  }

  get email() {
    return this._email;
  }
}