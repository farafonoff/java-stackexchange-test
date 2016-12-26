/**
 * Created by Artem_Farafonov on 12/26/2016.
 */

import { call, put, takeEvery, takeLatest } from 'redux-saga/effects'
import * as actions from '../actions/actions'
import * as generators from '../actions/generators'
import mock from './mockData'

function* makeQuery(action) {
    //const user = yield call(Api.fetchUser, action.payload.userId);
    let query = action.payload.title;
    let response = mock;
    yield put(generators.searchResults(response));
}

function* mySaga() {
    yield takeLatest(actions.SEARCH_TITLE, makeQuery);
}

export default mySaga;