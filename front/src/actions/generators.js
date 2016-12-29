/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import * as actions from './actions';

export function searchForTitle(title)
{
    return {type: actions.SEARCH_TITLE, payload: {title: title} }
}

export function searchForTitlePage(title, page)
{
    return {type: actions.LOAD_MORE, payload: {title: title, page: page} }
}

export function searchResults(data)
{
    return {type: actions.SEARCH_RESULTS, payload: data }
}

export function searchMoreResults(data, page)
{
    return {type: actions.SEARCH_MORE_RESULTS, payload: Object.assign({}, data, {page: page}) }
}
