/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import { Button, Form, FormControl, Row, Col, InputGroup } from 'react-bootstrap';
import React, { Component } from 'react';

export default class SearchString extends Component {
    input;
    state = {
        query: ""
    }
    searchClick(evt) {
        evt.preventDefault();
        let text = this.state.query.trim();
        this.props.onSearch(text);
    }
    render()  {
        return (
            <Row>
                <Col lg={12}>
                    <InputGroup className="input-group-lg">
                        <FormControl
                            type="text"
                            placeholder="java"
                            className="input-lg"
                            onChange={evt=>{this.setState({query: evt.target.value})}}
                        />
                        <span className="input-group-btn">
                            <Button type="submit"
                                    className="btn-lg"
                                    onClick={this.searchClick.bind(this)}
                            >
                                <span className="glyphicon glyphicon-search" aria-hidden='true'/>
                            </Button>
                        </span>
                    </InputGroup>
                </Col>
            </Row>)
    }
}