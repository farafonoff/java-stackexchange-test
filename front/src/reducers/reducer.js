/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import * as actions from '../actions/actions'
import {combineReducers} from 'redux'

let initial = {
    search: {query: ""},
    searchResults: { data: {}, page: 1, loading: false }
}

function search(state = initial.search,action) {
    switch (action.type) {
        case actions.SEARCH_TITLE: return { query: action.payload.title };
        default: return state;
    }
}

function searchResults(state = initial.searchResults,action) {
    switch (action.type) {
        case actions.SEARCH_TITLE:
        case actions.LOAD_MORE:
            return Object.assign({}, state, {loading: true});
        case actions.SEARCH_RESULTS: return { data: action.payload, page: 1, loading: false };
        case actions.SEARCH_MORE_RESULTS: return ({
            data: {
                items: state.data.items.concat(action.payload.items),
                hasMore: action.payload.hasMore
            },
            page: action.payload.page,
            loading: false
        });
        default: return state;
    }
}

let searchApp = combineReducers({search, searchResults});
export default searchApp;