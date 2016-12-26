/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import * as actions from './actions';

export function searchForTitle(title)
{
    return {type: actions.SEARCH_TITLE, payload: {title: title} }
}

export function searchResults(data)
{
    return {type: actions.SEARCH_RESULTS, payload: data }
}

