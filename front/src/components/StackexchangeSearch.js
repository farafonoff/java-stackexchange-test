/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import SearchResults from "./SearchResults"
import SearchString from "./SearchString"
import * as actions from "../actions/generators"
import React, { Component } from 'react';
import { connect } from 'react-redux'

class StackexchangeSearch extends Component {
    loadMore() {
        this.props.onLoadMore(this.props.query, this.props.page);
    }
    render()  {
        return (<div>
            <SearchString onSearch={this.props.onSearch.bind(this)}/>
            <SearchResults data={this.props.results} onLoadMore={this.loadMore.bind(this)} isNextPageLoading={this.props.loading} />
        </div>)
    }
};

StackexchangeSearch.propTypes = {
    onSearch: React.PropTypes.func,
    onLoadMore: React.PropTypes.func,
    results: React.PropTypes.object,
};

let mapStateToProps = (state) => {
    return {
        results: state.searchResults.data,
        query: state.search.query,
        page: state.searchResults.page,
        loading: state.searchResults.loading
    }
}

let mapDispatchToProps = (dispatch) => {
    return {
        onSearch: (query) => {
            dispatch(actions.searchForTitle(query))
        },
        onLoadMore: (query, page) => {
            dispatch(actions.searchForTitlePage(query, page+1))
        }
    }
}

StackexchangeSearch = connect(mapStateToProps,  mapDispatchToProps)(StackexchangeSearch);

export default StackexchangeSearch;