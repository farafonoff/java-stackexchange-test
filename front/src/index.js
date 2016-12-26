import React, { Component } from 'react'
import { render } from 'react-dom'
import { Provider } from 'react-redux'
import { createStore, applyMiddleware } from 'redux'
import searchApp from './reducers/reducer'
import StackexchangeSearch from './components/StackexchangeSearch'
import mySaga from './middleware/middleware'
import createLogger from 'redux-logger';
import createSagaMiddleware from 'redux-saga'

const logger = createLogger();
const sagaMiddleware = createSagaMiddleware();

let store = createStore(searchApp,
    applyMiddleware(
        logger,
        sagaMiddleware
    )
);

sagaMiddleware.run(mySaga);

render(
  <Provider store={store}>
      <StackexchangeSearch/>
  </Provider>,
  document.getElementById('root')
);
