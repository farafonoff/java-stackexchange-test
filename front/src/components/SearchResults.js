/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import React, { Component } from 'react';
import { Table } from 'react-bootstrap';

export default class SearchResults extends Component {
    render()  {
        return (this.props.data.items?<Table className="table">
            <thead>
            <tr><th>Title</th><th>Link</th></tr>
            </thead>
            <tbody>
                {this.props.data.items.map(this.renderLine.bind(this))}
            </tbody>
        </Table>:null)
    }

    renderLine(item) {
        return <tr className="resultLine" key={item.question_id}>
            <td>{item.title}</td>
            <td><a href={item.link}>GoTo</a></td>
        </tr>
    }
}