/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import SearchResults from "./SearchResults"
import SearchString from "./SearchString"
import * as actions from "../actions/generators"
import React, { Component } from 'react';
import { connect } from 'react-redux'
import './Search.css'

class StackexchangeSearch extends Component {
    loadMore() {
        this.props.onLoadMore(this.props.query, this.props.page);
    }

    componentDidMount() {
        this.searchIfNeeded(this.props.routeParams.query)
    }

    componentWillReceiveProps(newProps) {
        this.searchIfNeeded(newProps.routeParams.query)
    }

    onSearch(term) {
      this.props.router.push('/s/'+encodeURIComponent(term))
    }

    searchIfNeeded(term) {
      if (term!==undefined&&this.props.query!==term) {
          this.props.onSearch(term)
      }
    }
    render()  {
        return (<div className={this.props.hasResults?"search__results":"search__initial"}>
            <SearchString onSearch={this.onSearch.bind(this)} query={this.props.query} />
          {this.props.hasResults&&
            <SearchResults data={this.props.results} onLoadMore={this.loadMore.bind(this)} isNextPageLoading={this.props.loading} />}
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
        loading: state.searchResults.loading,
        hasResults: state.searchResults.data&&state.searchResults.data.items
    }
};

let mapDispatchToProps = (dispatch) => {
    return {
        onSearch: (query) => {
            dispatch(actions.searchForTitle(query))
        },
        onLoadMore: (query, page) => {
            dispatch(actions.searchForTitlePage(query, page+1))
        }
    }
};

StackexchangeSearch = connect(mapStateToProps,  mapDispatchToProps)(StackexchangeSearch);

export default StackexchangeSearch;