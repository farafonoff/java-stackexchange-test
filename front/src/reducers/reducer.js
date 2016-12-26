/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import * as actions from '../actions/actions'
import {combineReducers} from 'redux'

let initial = {
    search: {query: ""},
    searchResults: { data: {} }
}

function search(state = initial.search,action) {
    switch (action.type) {
        case actions.SEARCH_TITLE: return { query: action.payload.title };
        default: return state;
    }
}

function searchResults(state = initial.searchResults,action) {
    switch (action.type) {
        case actions.SEARCH_RESULTS: return { data: action.payload };
        default: return state;
    }
}

let searchApp = combineReducers({search, searchResults});
export default searchApp;