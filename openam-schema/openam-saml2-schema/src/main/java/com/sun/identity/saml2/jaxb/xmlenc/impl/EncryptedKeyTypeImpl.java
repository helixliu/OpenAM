//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.xmlenc.impl;

public class EncryptedKeyTypeImpl
    extends com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl
    implements com.sun.identity.saml2.jaxb.xmlenc.EncryptedKeyType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.identity.saml2.jaxb.xmlenc.ReferenceListType _ReferenceList;
    protected java.lang.String _CarriedKeyName;
    protected java.lang.String _Recipient;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.xmlenc.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.xmlenc.EncryptedKeyType.class);
    }

    public com.sun.identity.saml2.jaxb.xmlenc.ReferenceListType getReferenceList() {
        return _ReferenceList;
    }

    public void setReferenceList(com.sun.identity.saml2.jaxb.xmlenc.ReferenceListType value) {
        _ReferenceList = value;
    }

    public java.lang.String getCarriedKeyName() {
        return _CarriedKeyName;
    }

    public void setCarriedKeyName(java.lang.String value) {
        _CarriedKeyName = value;
    }

    public java.lang.String getRecipient() {
        return _Recipient;
    }

    public void setRecipient(java.lang.String value) {
        _Recipient = value;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (_ReferenceList!= null) {
            if (_ReferenceList instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
            } else {
                context.startElement("http://www.w3.org/2001/04/xmlenc#", "ReferenceList");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
                context.endElement();
            }
        }
        if (_CarriedKeyName!= null) {
            context.startElement("http://www.w3.org/2001/04/xmlenc#", "CarriedKeyName");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _CarriedKeyName), "CarriedKeyName");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Recipient!= null) {
            context.startAttribute("", "Recipient");
            try {
                context.text(((java.lang.String) _Recipient), "Recipient");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
        if (_ReferenceList!= null) {
            if (_ReferenceList instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if (_ReferenceList!= null) {
            if (_ReferenceList instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ReferenceList), "ReferenceList");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.xmlenc.EncryptedKeyType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.Element"
+"Pattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameCl"
+"ass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUn"
+"declaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Bo"
+"olean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsr\u0000 co"
+"m.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gra"
+"mmar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0016psr\u0000 com.sun.m"
+"sv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~"
+"\u0000\u0012xq\u0000~\u0000\u0003q\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expression$AnyStringEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0015\u0001q\u0000~\u0000 sr\u0000 com.sun.msv.grammar"
+".AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000!q\u0000~\u0000&sr\u0000#com.sun.msv.grammar.SimpleN"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnames"
+"paceURIq\u0000~\u0000(xq\u0000~\u0000#t\u00007com.sun.identity.saml2.jaxb.xmlenc.Encr"
+"yptionMethodTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elemen"
+"tssq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004"
+"namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv."
+"datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xs"
+"d.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.C"
+"oncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatyp"
+"eImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000(L\u0000\btypeNameq\u0000~\u0000(L\u0000\nwhite"
+"Spacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 h"
+"ttp://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datat"
+"ype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.m"
+"sv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun."
+"msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~"
+"\u0000\u0016psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~"
+"\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\'t\u0000\u0004typet\u0000)http://www"
+".w3.org/2001/XMLSchema-instanceq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u0010EncryptionMetho"
+"dt\u0000!http://www.w3.org/2001/04/xmlenc#q\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fq\u0000~\u0000"
+"\u0016psq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~"
+"\u0000&sq\u0000~\u0000\'t\u00001com.sun.identity.saml2.jaxb.xmlsig.KeyInfoElement"
+"q\u0000~\u0000+sq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000"
+"\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000.com.sun.identity.saml2.jaxb.x"
+"mlsig.KeyInfoTypeq\u0000~\u0000+sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000"
+"~\u0000\'t\u0000\u0007KeyInfot\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u0000&sq\u0000~\u0000"
+"\u000fppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&s"
+"q\u0000~\u0000\'t\u00004com.sun.identity.saml2.jaxb.xmlenc.CipherDataElement"
+"q\u0000~\u0000+sq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~"
+"\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00001com.sun.identity.saml2.jaxb.xmlen"
+"c.CipherDataTypeq\u0000~\u0000+sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~"
+"\u0000\'t\u0000\nCipherDataq\u0000~\u0000Fsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fq\u0000~\u0000\u0016psq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u000fp"
+"psq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000>com.sun.ide"
+"ntity.saml2.jaxb.xmlenc.EncryptionPropertiesElementq\u0000~\u0000+sq\u0000~"
+"\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000"
+"~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000;com.sun.identity.saml2.jaxb.xmlenc.Enc"
+"ryptionPropertiesTypeq\u0000~\u0000+sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000"
+"&sq\u0000~\u0000\'t\u0000\u0014EncryptionPropertiesq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fq\u0000~\u0000\u0016p"
+"sq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&"
+"sq\u0000~\u0000\'t\u00007com.sun.identity.saml2.jaxb.xmlenc.ReferenceListEle"
+"mentq\u0000~\u0000+sq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016ps"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00004com.sun.identity.saml2.ja"
+"xb.xmlenc.ReferenceListTypeq\u0000~\u0000+sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~"
+"\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rReferenceListq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0011q\u0000~\u0000\u0016p\u0000"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000.q\u0000~\u0000\u0016psr\u0000#com.sun.msv.datatype.xsd.StringType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00003q\u0000~\u00008t\u0000\u0006stringsr\u00005com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;"
+"\u0001q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u009dq\u0000~\u00008sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000"
+"~\u0000\'t\u0000\u000eCarriedKeyNameq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000"
+"\u0016psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000"
+"~\u00008t\u0000\u0006anyURIq\u0000~\u0000<q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u00aaq\u0000~\u00008sq\u0000~\u0000\'t\u0000\bEncodingt\u0000\u0000q\u0000"
+"~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.ppsr\u0000\u001fcom.sun.msv.datatype.xsd."
+"IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u009bq\u0000~\u00008t\u0000\u0002IDq\u0000~\u0000<\u0000q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u00b6q\u0000~\u00008sq\u0000~\u0000\'t\u0000\u0002Idq\u0000~\u0000\u00aeq\u0000~\u0000&"
+"sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000\u009asq\u0000~\u0000\'t\u0000\bMimeTypeq\u0000~\u0000\u00aeq\u0000~\u0000&sq\u0000~\u0000\u000fpp"
+"sq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000\u00a7sq\u0000~\u0000\'t\u0000\u0004Typeq\u0000~\u0000\u00aeq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016p"
+"q\u0000~\u0000\u009asq\u0000~\u0000\'t\u0000\tRecipientq\u0000~\u0000\u00aeq\u0000~\u0000&sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000"
+"$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u00006\u0001pq\u0000~\u0000\u0099q\u0000~\u0000\u0019q\u0000~\u0000J"
+"q\u0000~\u0000Rq\u0000~\u0000^q\u0000~\u0000fq\u0000~\u0000rq\u0000~\u0000zq\u0000~\u0000\u0086q\u0000~\u0000\u008eq\u0000~\u0000\u00beq\u0000~\u0000\u0006q\u0000~\u0000\u0017q\u0000~\u0000Pq\u0000~\u0000d"
+"q\u0000~\u0000xq\u0000~\u0000\u008cq\u0000~\u0000\rq\u0000~\u0000\u000bq\u0000~\u0000\u00c2q\u0000~\u0000\bq\u0000~\u0000\u000eq\u0000~\u0000\fq\u0000~\u0000\u00a5q\u0000~\u0000\u001cq\u0000~\u0000Kq\u0000~\u0000S"
+"q\u0000~\u0000_q\u0000~\u0000gq\u0000~\u0000sq\u0000~\u0000{q\u0000~\u0000\u0087q\u0000~\u0000\u008fq\u0000~\u0000Gq\u0000~\u0000oq\u0000~\u0000\u0083q\u0000~\u0000\u00baq\u0000~\u0000\nq\u0000~\u0000\u0007"
+"q\u0000~\u0000\u0097q\u0000~\u0000,q\u0000~\u0000Wq\u0000~\u0000kq\u0000~\u0000\u007fq\u0000~\u0000\u0093q\u0000~\u0000Hq\u0000~\u0000\\q\u0000~\u0000pq\u0000~\u0000\u0084q\u0000~\u0000\u00a1q\u0000~\u0000\u00af"
+"q\u0000~\u0000\u0010q\u0000~\u0000\u0005q\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("ReferenceList" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            _ReferenceList = ((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ReferenceList" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        state = 5;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Recipient");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (("DataReference" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            _ReferenceList = ((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyReference" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            _ReferenceList = ((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlenc.impl.ReferenceListTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  5 :
                        if (("CarriedKeyName" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 6;
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "Encoding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MimeType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("EncryptionMethod" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("CipherData" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("CipherData" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Recipient = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        state = 5;
                        continue outer;
                    case  10 :
                        if (("ReferenceList" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Recipient");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        if (("CarriedKeyName" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "Encoding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MimeType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        state = 5;
                        continue outer;
                    case  0 :
                        if (("Recipient" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  3 :
                        if (("Encoding" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("Id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("MimeType" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("Type" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedTypeImpl)com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptedKeyTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        state = 5;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Recipient");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  2 :
                        if (("Recipient" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "Encoding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MimeType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Type");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  4 :
                            state = 5;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "Recipient");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  6 :
                            state = 7;
                            eatText2(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  5 :
                            state = 8;
                            continue outer;
                        case  3 :
                            attIdx = context.getAttribute("", "Encoding");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "MimeType");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Type");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _CarriedKeyName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
