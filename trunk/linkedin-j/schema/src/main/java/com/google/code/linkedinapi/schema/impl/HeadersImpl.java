//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 03:49:38 PM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Headers;
import com.google.code.linkedinapi.schema.HttpHeader;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "httpHeader"
})
@XmlRootElement(name = "headers")
public class HeadersImpl
    implements Headers
{

    @XmlElement(name = "http-header", required = true, type = HttpHeaderImpl.class)
    protected HttpHeaderImpl httpHeader;
    @XmlAttribute(required = true)
    protected BigInteger total;

    public HttpHeader getHttpHeader() {
        return httpHeader;
    }

    public void setHttpHeader(HttpHeader value) {
        this.httpHeader = ((HttpHeaderImpl) value);
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger value) {
        this.total = value;
    }

}
