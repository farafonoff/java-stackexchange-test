import React, { Component, PropTypes } from 'react';
import { Provider } from 'react-redux'
import {IntlProvider} from 'react-intl';

import { createStore, applyMiddleware } from 'redux'
import searchApp from './reducers/reducer'
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

export default class App extends Component {
  static propTypes = {
    children: PropTypes.element.isRequired,
  };

  render() {
    return (
      <IntlProvider locale={'en-US'}>
        <Provider store={store}>
          <div>
          {this.props.children}
          </div>
        </Provider>
      </IntlProvider>
    );
  }
}
