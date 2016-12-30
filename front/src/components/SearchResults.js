/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import React, { Component } from 'react';
import { Table } from 'react-bootstrap';
import ReduxInfiniteScroll from 'redux-infinite-scroll';
import {FormattedDate, FormattedRelative} from 'react-intl';

export default class SearchResults extends Component {
    render()  {
        return this.renderTable(this.props.data.items);
    }

    loadMore() {
        this.props.onLoadMore();
    }

    renderTable(items) {
        return (
            <Table className="table">
                <thead>
                <tr><th>Created</th><th>Last activity</th><th>Title</th></tr>
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
            <td> <FormattedDate
              value={new Date(item.create_date*1000)}
              day="numeric"
              month="long"
              year="numeric" /> </td>
            <td> <FormattedRelative value={new Date(item.activity_date*1000)} /> </td>
            <td><a href={item.link} target="_blank" dangerouslySetInnerHTML={{__html:  item.title}}/></td>
        </tr>
    }
	//<td><a href={item.link} target="_blank">GoTo</a></td>
}