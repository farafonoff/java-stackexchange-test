/**
 * Created by Artem_Farafonov on 12/26/2016.
 */

import { call, put, takeEvery, takeLatest } from 'redux-saga/effects'
import * as actions from '../actions/actions'
import * as generators from '../actions/generators'
import mock from './myMockData'

//var API = "http://localhost:8080/myapp/stackoverflow/search/";
var API = "api/stackoverflow/search/";

function apiCall(query, page=1) {
    return fetch(API+encodeURIComponent(query)+"/"+page)
        .then(response=>response.json())
}

function* makeQuery(action) {
    //const user = yield call(Api.fetchUser, action.payload.userId);
    let query = action.payload.title;
    const data = yield call(apiCall, query, action.payload.page);
    //const data = mock;
    if (action.payload.page===undefined) {
        yield put(generators.searchResults(data));
    } else {
        yield put(generators.searchMoreResults(data, action.payload.page));
    }

}

function* mySaga() {
    yield takeLatest(actions.SEARCH_TITLE, makeQuery);
    yield takeLatest(actions.LOAD_MORE, makeQuery);
}

export default mySaga;