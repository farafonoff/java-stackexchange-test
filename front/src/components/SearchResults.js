/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import React, { Component } from 'react';
import { Table } from 'react-bootstrap';
import ReduxInfiniteScroll from 'redux-infinite-scroll';

export default class SearchResults extends Component {
    render()  {
        return (this.props.data.items?this.renderTable(this.props.data.items):null);
    }

    loadMore() {
        this.props.onLoadMore();
    }

    renderTable(items) {
        return (
            <Table className="table">
                <thead>
                <tr><th>Title</th><th>Link</th></tr>
                </thead>
                <ReduxInfiniteScroll
                    hasMore={this.props.data.hasMore}
                    loadMore={this.loadMore.bind(this)}
                    loadingMore={this.props.isNextPageLoading}
                    elementIsScrollable={false}
                    holderType={"tbody"}
                    loader={<tr><td colSpan="2">Loading...</td></tr>}
                >
                {items.map(this.renderLine.bind(this))}
                </ReduxInfiniteScroll>
            </Table>);
    }

    renderLine(item) {
        return <tr className={"resultLine "+(item.answered?"success":"")} key={item.id} >
            <td>{item.title}</td>
            <td><a href={item.link} target="_blank">GoTo</a></td>
        </tr>
    }
}