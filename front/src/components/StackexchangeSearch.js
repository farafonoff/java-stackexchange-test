/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import SearchResults from "./SearchResults"
import SearchString from "./SearchString"
import * as actions from "../actions/generators"
import React, { Component } from 'react';
import { connect } from 'react-redux'

class StackexchangeSearch extends Component {
    render()  {
        return (<div>
            <SearchString onSearch={this.props.onSearch.bind(this)}/>
            <SearchResults data={this.props.results}/>
        </div>)
    }
};

StackexchangeSearch.propTypes = {
    onSearch: React.PropTypes.func,
    results: React.PropTypes.object,
};

let mapStateToProps = (state) => {
    return {
        results: state.searchResults.data
    }
}

let mapDispatchToProps = (dispatch) => {
    return {
        onSearch: (query) => {
            dispatch(actions.searchForTitle(query))
        }
    }
}

StackexchangeSearch = connect(mapStateToProps,  mapDispatchToProps)(StackexchangeSearch);

export default StackexchangeSearch;