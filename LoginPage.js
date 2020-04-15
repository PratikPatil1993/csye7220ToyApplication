import React, { Component } from "react";
import LoginForm from "./LoginForm";
import RegisterForm from "./RegisterForm";
import Auth from "../../services/Auth";

/**
* Entering page where users can sign in and/or log in
*/
class LoginPage extends Component {
    async login(loginData) {
        const loginSuccess = await Auth.login(loginData);
        if (!loginSuccess) {
            alert("Invalid credentials");
        }
    }

    async register(registrationData) {
        const registerSuccess = await Auth.register(registrationData);
        if (!registerSuccess) {
            alert("Couldn't register check credentials and try again");
        }
    }

    render() {
        return (
            <div className="wrapper">
                <div className="container">
                    <div className="row mt-4">
                        <div className="col-md-6 ">
                            <p className="big-p text-center" align="center">CSYE7220 Spring 2020 DevOps Final Project</p>
                            <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/qIZ2lua9aQA" allowfullscreen></iframe>
                            </div>

                            <div className="card-body text-dark bg-warning mb-5">
                                <p className="login" align="center">Toy Exchanging Application</p>
                                <p className="login">GROUP 4: Lakshit Talreja | Pratik Patel
                                </p>
                                <p className="login">An application for exchanging toys online instead of buying brand new toys.
                                    The application is for the community of parents whose children outgrow the toys quickly. 
                                    Parents can put their toys on the portal and exchange them for other toys.
                                    It also aims to educate children of age group 5 -13 years about the value 
                                    of money and currency by comparing the value of their favorite toy in different 
                                    countries in the world in a fun-interactive way by introducing tasks.
                                </p>
                            </div>
                            
                        </div>
                        <div className="col-md-6">
                            <p></p>
                            <div className="row">
                            <img src="robot.svg" class="rounded mx-auto d-block" width="100" height="100"alt="logo"/>
                                <div className="col-12 strong-shadow">
                                   
                                    <LoginForm onSubmit={this.login} />
                                    
                                </div>

                                <div className="col-12 mt-4">
                                    <RegisterForm onSubmit={this.register }/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default LoginPage;
