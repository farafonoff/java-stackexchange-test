/**
 * Created by Artem_Farafonov on 12/26/2016.
 */
import { Button, FormControl, Row, Col, InputGroup, Form } from 'react-bootstrap';
import React, { Component } from 'react';

export default class SearchString extends Component {
    input;
    constructor(props) {
        super(props);
        this.state = {query:props.query}
    }
    searchClick(evt) {
        evt.preventDefault();
        let text = this.state.query.trim();
        if (text.length>0) {
          this.props.onSearch(text);
        }
    }
      componentWillReceiveProps(newProps) {
        this.setState({query: newProps.query});
      }

  render()  {
        return (
          <Form>
            <Row>
                <Col lg={12}>
                    <InputGroup className="input-group-lg">
                        <FormControl
                            type="text"
                            placeholder="Search in Stackoverflow"
                            className="input-lg"
                            value={this.state.query}
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
            </Row>
          </Form>)
    }
}