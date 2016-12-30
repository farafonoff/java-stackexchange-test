import React, { Component } from 'react'
import { render } from 'react-dom'
import StackexchangeSearch from './components/StackexchangeSearch'
import { Router, Route, browserHistory, IndexRoute } from 'react-router'
import App from './App';
import './index.css'

render(
  <Router history={browserHistory}>
    <Route path={"/"} component={App}>
      <IndexRoute component={StackexchangeSearch}/>
      <Route path={"/s/(:query)"} component={StackexchangeSearch}/>
    </Route>
  </Router>,
  document.getElementById('root')
);
